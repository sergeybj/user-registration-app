package org.sergey.javabrains.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
	
	public void sendMail()
	{
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(properties,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("pifagor1", "Tallinn2!");
					}
				  });
		
		MimeMessage message = new MimeMessage(session);
		
		try {
			
			message.setFrom(new InternetAddress("pifagor1@gmail.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("sergey.bjorklund@gmail.com"));
			message.setSubject("TEST SUBJECT");
			
			Transport.send(message);
			
			
			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
