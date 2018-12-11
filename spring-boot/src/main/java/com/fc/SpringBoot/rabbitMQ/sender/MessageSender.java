package com.fc.SpringBoot.rabbitMQ.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@Service
public class MessageSender {
	
	@Autowired
    private RabbitTemplate rabbitTemplate;
	public void send1(){

	    String context = "hi, i am message 1";
	    String exchangeName="topicExchange";
	    String routingKey="topic.message";
	    System.out.println("----------send1------执行------");
	    //序列化并发送消息
		 rabbitTemplate.convertAndSend(exchangeName,routingKey, context);
	}
	public void send2(){

	    String context = "hi, i am message 2";
	    String exchangeName="topicExchange";
	    String routingKey="topic.messages";
	    System.out.println("----------send2------执行------");
	    //序列化并发送消息
		 rabbitTemplate.convertAndSend(exchangeName,routingKey, context);
	}
}
