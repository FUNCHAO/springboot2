package com.fc.SpringBoot.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
//@Component 取消jms
public class Receiver {
	
	@JmsListener(destination="my-destination")
	public void receiveMessage(String message){
		System.out.println("接受到：<"+message+">");
	}
}
