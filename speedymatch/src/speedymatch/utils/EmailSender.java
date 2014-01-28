package speedymatch.utils;



import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import speedymatch.entities.Member;




public class EmailSender {
		
	
	final String jdaySend = "jday.sg@gmail.com";
	final String jdayPW = "jdayjday";

	Session session = null;
	Member m;
	
		public EmailSender(Member m) {

			this.m = m;
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", true);
			props.put("mail.smtp.ssl.trust", "*");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			 
			session = Session.getInstance(props,
			  new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(jdaySend, jdayPW);
				}
			  });
			
	}
		
		
/*		public void sendActivationLink(String token){
			
			String subject="Account activation";

			
			try {
	 
				Message message = new MimeMessage(session);

				message.setFrom(new InternetAddress(jdaySend));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(c.getEmail()));
				message.setSubject(subject);
				message.setContent("<h1>Dear client,</h1><p>Please activate your account by clicking " +
						"<a rel='nofollow' target='_blank' href='https://samuelong-pc:443/CyberPrime2/ActivateAccount?token="+token+"&userId="+c.getUserId()+"'>here</a></p>",
                        "text/html" );
				System.out.println("Before sending");
				Transport.send(message);
				System.out.print("send");
	 
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
			
		}*/
		
		public void sendResetPattern(String password,String oldPassword){
			
			String subject="Password Reset";
			
			try {
	 
				Message message = new MimeMessage(session);

				message.setFrom(new InternetAddress(jdaySend));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(m.getEmail()));
				message.setSubject(subject);
				message.setContent("<h1>Dear member,</h1><p>This is the new passwordfor your account</p>"+
						"<p>"+password+"</p>"+
						"If you did not request to reset your password, please click "+
						"<a rel='nofollow' target='_blank' href='https://samuelong-pc:443/CyberPrime2/ResetPattern?password="+oldPassword+"&userId="+m.getUsername()+"'>here</a>",
                        "text/html" );
				Transport.send(message);
				System.out.print("send");
	 
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
			
		}
}

