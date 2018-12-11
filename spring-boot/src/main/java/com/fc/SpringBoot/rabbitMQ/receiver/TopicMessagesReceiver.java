package com.fc.SpringBoot.rabbitMQ.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*@Component
@RabbitListener(queues="topic.messages")*/
public class TopicMessagesReceiver {
	@RabbitHandler
	public void process(String msg){
		
		System.out.println("TopicMessagesReceiver收到消息："+msg);
	}
}
