package com.practica2.test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class MailSender {
	private static Properties mailServerProperties;
	private static Session mailSession;
	
	private void buildProperties( String host, String user, String pass ){
		mailServerProperties = System.getProperties();
		mailServerProperties.put( "mail.smtp.host", host );
		mailServerProperties.put( "mail.smtp.user", user );
		mailServerProperties.put("mail.smtp.password", pass );
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
	}
	
	
	private Session getMailSession( ){
		if( mailSession == null ){
			mailSession = Session.getDefaultInstance( mailServerProperties, null );
		}
		return mailSession;
	}
	
	private MimeMessage getMimeMessage( String to, String subject, String content ) 
			throws AddressException, MessagingException
	{
		MimeMessage mimeMessage = new MimeMessage( getMailSession() );
		mimeMessage.addRecipient( Message.RecipientType.TO, new InternetAddress( to ) );
		mimeMessage.setSubject( subject );
		mimeMessage.setContent( content, "text/html" );
		return mimeMessage;
	}
	
	public void sendEmail( String to, String subject, String content ) 
			throws MessagingException
	{
		MimeMessage message = null;
		String host = "smtp.gmail.com"; //<--Cambiar acorde al host apropiado. Este es para Gmail
		String user = "correo@gmail.com";//<-Correo de gmail
		String pass = "pass"; //<-Contraseña del correo
		
		buildProperties(host, user, pass);
		
		Transport transport = getMailSession().getTransport( "smtp" );
		
		transport.connect( host, user, pass );
		message = getMimeMessage(to, subject, content);
		transport.sendMessage( message, message.getAllRecipients( ) );
		transport.close( );
	}
}
