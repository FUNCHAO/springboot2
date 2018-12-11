package com.fc.SpringBoot.rabbitMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fc.SpringBoot.rabbitMQ.sender.MessageSender;

/*@RestController
@RequestMapping("/RabbitMQController")*/
public class RabbitMQController {
	@Autowired
	private MessageSender messageSender;
	/**
	 * 此处通过controller测试消息发送，最好在单元测试中测试
	 */
	@GetMapping("/send1")
	public void send1(){
		
		messageSender.send1();
	}
	@GetMapping("/send2")
	public void send2(){
		
		messageSender.send2();
	}
}
