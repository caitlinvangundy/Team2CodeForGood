package com.example.handsonandroid.mail_utility;

import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class Mail extends javax.mail.Authenticator {

	
	private String user = "handsonc4g";
	private String password = "code4good";
	
	private String[] to;
	private String from;
	
	private String port;
	private String sport;
	
	private String host;
	
	private String subject;
	private String body;
	
	private boolean _auth;
	
	private boolean _debuggable;
	
	private Multipart multipart;
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String[] getTo(){
		return to;
	}
	
	public void setTo(String[] to){
		this.to = to;
	}
	
	public String getFrom() {
	    return from;
	}

	public void setFrom(String from) {
	    this.from = from;
	}

	public String getHost() {
	    return host;
	}

	public void setHost(String host) {
	    this.host = host;
	}

	public String getSubject() {
	    return subject;
	}

	public void setSubject(String subject) {
	    this.subject = subject;
	}
	
	public Multipart getMultipart(){
		return this.multipart;
	}
	
	public void setMulitpart(Multipart part){
		this.multipart = part;
	}

	
	public Mail(){
		host = "smtp.googlemail.com";
		port = "465";
		sport = "465";
		
		from = "handsonc4g@gmail.com";
		subject = "";
		body = "";
		
		_debuggable = false;
		_auth = true;
		
		multipart = new MimeMultipart();
		
		
	}
	
	public boolean send() throws Exception{
		
		Properties props = _setProperties();
		
		if(!from.equals("") && !subject.equals("") && !body.equals("")){
			Session session = Session.getInstance(props, this);
			
			MimeMessage msg = new MimeMessage(session);
		
			msg.setFrom(new InternetAddress(from));
			
			InternetAddress[] addressTo = new InternetAddress[to.length];
			for(int i = 0; i < to.length; i++){
				addressTo[i] = new InternetAddress(to[i]);
			}
			msg.setRecipients(MimeMessage.RecipientType.TO, addressTo);
			
			msg.setSubject(subject);
			msg.setSentDate(new Date());
			
			//setup meessage body
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText(body);
			multipart.addBodyPart(messageBodyPart);
			
			msg.setContent(multipart);
			
			Transport.send(msg);
			
			return true;
			
			
		}
		
		
		return false;
	}
	
	private Properties _setProperties() {
	    Properties props = new Properties();

	    props.put("mail.smtp.host", host);

	    if (_debuggable) {
	        props.put("mail.debug", "true");
	    }

	    if (_auth) {
	        props.put("mail.smtp.auth", "true");
	    }

	    props.put("mail.smtp.port", port);
	    props.put("mail.smtp.socketFactory.port", sport);
	    props.put("mail.smtp.socketFactory.class",
	            "javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.socketFactory.fallback", "false");

	    return props;
	}
	
	public void setBody(String msg){
		this.body = msg;
	}
}
