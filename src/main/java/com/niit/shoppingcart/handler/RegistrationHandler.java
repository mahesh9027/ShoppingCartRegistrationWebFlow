package com.niit.shoppingcart.handler;


import org.hibernate.boot.archive.scan.spi.AbstractScannerImpl.ArchiveContextImpl;
import com.niit.shoppingcart.model.UserDetails;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.binding.message.MessageContext;
@Component
public class RegistrationHandler {
	public UserDetails initFlow(){
		return new UserDetails();
	}

	public String validateDetails(UserDetails userDetails,MessageContext messageContext){
		String status="success";
		if(userDetails.getId().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"id").defaultText("UserId cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getName().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"name").defaultText("Name cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("Password cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getAddress().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"address").defaultText("Address cannot be Empty").build());
			status = "failure";
		}
	
		return status;
		
	}
}
