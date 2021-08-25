package com.advancejava.service;

import java.io.FileReader;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {
	public static void sendMail(String toEmail) {
		Properties pro = new Properties();
		pro.put("mail.smtp.auth", "true");
		pro.put("mail.smtp.starttls.enable", "true");
		pro.put("mail.smtp.host", "smtp.gmail.com");
		pro.put("mail.smtp.port", "465");
		pro.put("mail.smtp.socketFactory.port", "465");
        pro.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		
		String email = "palashbajaj001@gmail.com";
		String password = "palash@3847";
		
		Session session = Session.getInstance(pro, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(email, password);
			}
		});
		
		 try {
	           Message message = new MimeMessage(session);
	           message.setFrom(new InternetAddress(email));//change accordingly
	           message.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
	           message.setSubject("Thank you for register");
	            Transport.send(message);
	            System.out.println("message sent successfully");
	        }
		 catch (Exception e) {
			 e.printStackTrace();
		}
	    }
}
