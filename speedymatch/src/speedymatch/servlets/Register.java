package speedymatch.servlets;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;
import speedymatch.entities.Profile;
import speedymatch.entities.dao.MemberDAO;
import speedymatch.utils.ImageValidator;
import speedymatch.utils.RandomStringGenerator;
import speedymatch.utils.Validation;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session = request.getSession();
		String dbrepo = "..\\profilePic\\";
		String repos = "C:\\Users\\Deane\\git\\speedymatchGitHub\\speedymatch\\WebContent\\profilePic\\";
		File repo = new File(repos);
		DiskFileItemFactory factory = new DiskFileItemFactory();
		String saveFileName = "";
		String newFileName = "";
		
		String salt = RandomStringGenerator.getRandomString(16);
		
		String username = "";
		String email = "";
		String passwd = "";
		String fName = "";
		String lName = "";
		String gender = "";
		String dob = "";
		String country = "";
		String city = "";
		String occupation = "";
		String memType = "";
		String profilePic = "";
		
		try{
			factory.setSizeThreshold(2*1024*1024);
			factory.setRepository(repo);
	//		if(repo != null)
	//		System.out.println("Repository :"+repo.getAbsolutePath());
			ServletFileUpload upload = new ServletFileUpload(factory);
			RequestContext req = new ServletRequestContext(request);
			List<FileItem> items = upload.parseRequest(req);
			Iterator<FileItem> iterator =  items.iterator();
			
			while(iterator.hasNext()){
			FileItem item = iterator.next();
				if(item.isFormField()){
					String fieldname = item.getFieldName();
					
					if(fieldname.equalsIgnoreCase("username")){
						username = item.getString();
					}
								
						
					
					else if(fieldname.equalsIgnoreCase("email")){
						email = item.getString();
					}
					
					else if(fieldname.equalsIgnoreCase("password"))
						
						passwd = item.getString();
						
					else if(fieldname.equalsIgnoreCase("fname"))
					
						fName = item.getString();
					
					else if(fieldname.equalsIgnoreCase("lname"))
						
						lName = item.getString();
						
					else if(fieldname.equalsIgnoreCase("gender"))
						
						gender = item.getString();
					
					else if(fieldname.equalsIgnoreCase("dob"))
						
						dob = item.getString();
					
					else if(fieldname.equalsIgnoreCase("country"))
						
						country = item.getString();
					
					else if(fieldname.equalsIgnoreCase("city"))
						
						city = item.getString();
					
					else if(fieldname.equalsIgnoreCase("occupation"))
						
						occupation = item.getString();
					
					else if(fieldname.equalsIgnoreCase("memType"))
					
						memType = item.getString();
						
						
				}
				
				else{
					String fileName = item.getName();
						
					if(!fileName.isEmpty()){
						
						ImageValidator iv = new ImageValidator();
						int i=fileName.lastIndexOf("\\");
						fileName=fileName.substring(i+1,fileName.length());
						saveFileName = repos + fileName;
						File uploadedFile = new File(saveFileName);
						
		
						
						
						if(iv.validate(fileName)){
							try{
								item.write(uploadedFile);
								newFileName = username+fileName.substring(fileName.length()-4); 
								profilePic = dbrepo+newFileName;
								if(uploadedFile.renameTo(new File(repos+newFileName))){
									System.out.println("File has been renamed");
								}
								
								else{
									System.out.println("File rename failed");

								}
								
							}catch(Exception e){
								Object obj = new Object();
								obj = "<p style='color:red'>*Access denied</p>";
								request.getSession().setAttribute("regObj", obj);
								response.sendRedirect("registration.jsp");
								return;
							}

							

						}
						
						else{
							Object obj = new Object();
							obj = "<p style='color:red'>*Unauthorized file type or file name</p>";
							request.setAttribute("regObj", obj);
							response.sendRedirect("registration.jsp");
							return;
						}

					}

					else{
						Object obj = new Object();
						obj = "<p style='color:red'>*Please choose a file</p>";
						request.setAttribute("regObj", obj);
						response.sendRedirect("registration.jsp");
						return;
					}


				}
			}
			
			if(Validation.checkUsername(username)){
				
				if(MemberDAO.checkUsername(username)){
					
					if(MemberDAO.checkEmail(email)){
						Scanner sc = new Scanner(dob);
						sc.useDelimiter("-");
						int year = Integer.parseInt(sc.next());
						int month = Integer.parseInt(sc.next());
						int day = Integer.parseInt(sc.next());
						Date dateOB = new Date(year-1900,month-1,day);
						sc.close();
						Date regDate = new Date();
						
						Profile profile = new Profile();
						profile.setUsername(username);
						profile.setAge(regDate.getYear()+1900-year);
						profile.setGender(gender);
						profile.setOccupation(occupation);
						
						Member member = new Member(username, passwd, email, fName, lName, dateOB,profilePic);
						MemberSecurity ms = new MemberSecurity(salt, null, memType, regDate, 'F');
						
						Member registeredMember = MemberDAO.registerAccount(member, ms,profile);
						
						if(registeredMember!=null){
							
							request.getSession().setAttribute("member", registeredMember);
							response.sendRedirect("pages/profile.jsp");
							
							
						}
						
						else{
							
							response.sendRedirect("pages/error.jsp");
							
						}
					}
					
					else{
						Object obj = new Object();
						obj = "<p style='color:red'>*This email has already been registered with us";
						request.getSession().setAttribute("regObj", obj);
						response.sendRedirect("registration.jsp");
					}
				}
				
				else{
					Object obj = new Object();
					obj = "<p style='color:red'>*Username is already taken";
					request.getSession().setAttribute("regObj", obj);
					response.sendRedirect("registration.jsp");
				}
	
				
			}
			
			else{
				
				Object obj = new Object();
				obj = "<p style='color:red'>*Username cannot contain special characters";
				request.getSession().setAttribute("regObj", obj);
				response.sendRedirect("registration.jsp");
			}

					
			
			}catch(FileUploadException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.gc();
			}
	
		

		/*try {
			username = (String)request.getParameter("username");
			
			if(Validation.checkUsername(username)){
				
				if(MemberDAO.checkUsername(username)){
					String email = (String)request.getParameter("email");
					
					if(MemberDAO.checkEmail(email)){
						String passwd = (String)request.getParameter("password");
						String fName = (String)request.getParameter("fName");
						String lName = (String)request.getParameter("lName");
						String gender = (String)request.getParameter("gender");
						String dob = (String)request.getParameter("dob");
						Scanner sc = new Scanner(dob);
						sc.useDelimiter("-");
						int year = Integer.parseInt(sc.next());
						int month = Integer.parseInt(sc.next());
						int day = Integer.parseInt(sc.next());
						Date dateOB = new Date(year-1900,month-1,day);
						sc.close();
						String country = (String)request.getParameter("country");
						String city = (String)request.getParameter("city");
						String occupation = (String)request.getParameter("occupation");
						String memType = (String)request.getParameter("memType");
						String communication = (String)request.getParameter("comm");
						Date regDate = new Date();
						
						Member member = new Member(username, passwd, email, fName, lName, dateOB);
						MemberSecurity ms = new MemberSecurity(salt, null, memType, regDate, 'F', communication);
						
						Member registeredMember = MemberDAO.registerAccount(member, ms);
						
						if(registeredMember!=null){
							
							request.getSession().setAttribute("member", registeredMember);
							response.sendRedirect("pages/profile.jsp");
							
							
						}
						
						else{
							
							response.sendRedirect("pages/error.jsp");
							
						}
					}
					
					else{
						Object obj = new Object();
						obj = "<p style='color:red'>*This email has already been registered with us";
						request.getSession().setAttribute("regObj", obj);
						response.sendRedirect("registration.jsp");
					}
				}
				
				else{
					Object obj = new Object();
					obj = "<p style='color:red'>*Username is already taken";
					request.getSession().setAttribute("regObj", obj);
					response.sendRedirect("registration.jsp");
				}
	
				
			}
			
			else{
				
				Object obj = new Object();
				obj = "<p style='color:red'>*Username cannot contain special characters";
				request.getSession().setAttribute("regObj", obj);
				response.sendRedirect("registration.jsp");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	*/	
	}

}
