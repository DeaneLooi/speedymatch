package speedymatch.entities.dao;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;
import speedymatch.utils.Algorithms;



public class MemberDAO {

        private static DBController db = new DBController();
        
        public static Member registerAccount(Member member, MemberSecurity memberSecurity) {
                Connection currentCon = db.getConnection();
                java.sql.Date dob = new java.sql.Date(member.getDob().getTime());
                java.sql.Date regDate = new java.sql.Date(memberSecurity.getRegDate().getTime());
                try{
                        String query = "insert into Member(username, passwd, email, Fname, Lname, dob) values(?,?,?,?,?,?)";
                        PreparedStatement pstmt = currentCon.prepareStatement(query);
                        // inserting values
                        pstmt.setString(1, member.getUsername());
                        pstmt.setString(2, member.getPasswd());
                        pstmt.setString(3, member.getEmail());
                        pstmt.setString(4, member.getFname());
                        pstmt.setString(5, member.getLname());
                        pstmt.setDate(6, dob);

                        
                        query ="insert into MemberSecurity(username, salt, token, membership, regDate, disabled, communication) values(?,?,?,?,?,?,?)";
                        PreparedStatement pstmt1 = currentCon.prepareStatement(query);
                        pstmt1 = currentCon.prepareStatement(query);
                        pstmt1.setString(1, member.getUsername());
                        pstmt1.setString(2, memberSecurity.getSalt());
                        pstmt1.setString(3, memberSecurity.getToken());
                        pstmt1.setString(4, memberSecurity.getMembership());
                        pstmt1.setDate(5, regDate);
                        pstmt1.setString(6, String.valueOf(memberSecurity.getDisabled()));
                        pstmt1.setString(7, memberSecurity.getCommunication());
                        
                        pstmt.executeUpdate();
                        pstmt1.executeUpdate();
                        
                        
        }catch (Exception ex) {

                        System.out.println("Registration failed: An Exception has occurred! "+ ex);
                        member = null;
                        
                }
                finally {

                        if (currentCon != null) {
                                try {
                                        currentCon.close();
                                } catch (Exception e) {
                                }

                                currentCon = null;
                        }
                }
                return member;
        }
        
        
        public static Member retrieveAccount(Member member){
                Connection currentCon = db.getConnection();
                Member m = null;
                MemberSecurity ms = null;
                ResultSet rs = null;
                
                try{
                        String query="select * from Member INNER JOIN MemberSecurity ON Member.username = MemberSecurity.username where Member.username = ?"; 
                        PreparedStatement pstmt = currentCon.prepareStatement(query);
                        pstmt.setString(1, member.getUsername());
                        rs = pstmt.executeQuery();
                        
                        while(rs.next()){
                                m = new Member(member.getUsername(),rs.getString("passwd"),rs.getString("email"),rs.getString("Fname"),rs.getString("Lname"),rs.getDate("dob"));
                                ms = new MemberSecurity(rs.getString("salt"),rs.getString("token"),rs.getString("membership"),rs.getDate("regDate"),rs.getString("disabled").charAt(0),rs.getString("communication"));
                        }
                        
                        m.addMemberSecurity(ms);

                }catch(Exception ex){
                        ex.printStackTrace();
                        m = null;
                }finally {

                        if (currentCon != null) {
                                try {
                                        currentCon.close();
                                } catch (Exception e) {
                                }

                                currentCon = null;
                        }
                }
                return m;
        }
        
        
        
        public static String changePassword(Member member){
                Connection currentCon = db.getConnection();
                ResultSet rs = null;
                String password = "";
                try{
                        String selectQuery = "select passwd from Member where username= ?";
                        PreparedStatement pstmt1 = currentCon.prepareStatement(selectQuery);
                        pstmt1.setString(1, member.getUsername());
                        rs = pstmt1.executeQuery();
                        while(rs.next()){
                                password = rs.getString(1);
                        }
                        
                        String query = "update Member set passwd = ? where username = ?";
                        PreparedStatement pstmt = currentCon.prepareStatement(query);
                        pstmt.setString(1, member.getPasswd());
                        pstmt.setString(2, member.getUsername());
                        pstmt.executeUpdate();
                }catch(Exception ex){
                        System.out.println("Update failed: An Exception has occurred! "+ ex);
                }                
                finally {

                        if (currentCon != null) {
                                try {
                                        currentCon.close();
                                } catch (Exception e) {
                                }

                                currentCon = null;
                        }
                }
                
                return password;
        }
        
/*        public static void main(String args[]){
        	@SuppressWarnings("deprecation")
			Date dob = new Date(1995, 9, 27);
        	Member m = new Member("GreenTeaxD","password","deanelooiz@hotmail.com","Deane","Looi",dob);
        	MemberSecurity ms = new MemberSecurity("salt","token","Admin",dob,'F',"Phone");
        	
        	Member member = MemberDAO.registerAccount(m, ms);
        	if(member!=null){
        		Member yw = new Member("GreenTeaxD","password");
        		Member mem = MemberDAO.retrieveAccount(yw);
        		MemberSecurity memS = mem.getMemberSecurity();
        		System.out.println(mem.getUsername()+mem.getPasswd()+memS.getMembership()+memS.getSalt());
        	}
        	
        }*/
        

        
        
}
        