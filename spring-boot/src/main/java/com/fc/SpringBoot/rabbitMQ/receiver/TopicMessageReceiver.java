package com.fc.SpringBoot.rabbitMQ.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*@Component
@RabbitListener(queues="topic.message")*/
public class TopicMessageReceiver {
	@RabbitHandler
	public void process(String msg){
		
		System.out.println("TopicMessageReceiver收到消息："+msg);
	}
}
