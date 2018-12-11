package com.fc.SpringBoot.rabbitMQ.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration rabbitmq未启动，注释掉
public class TopicRabbitConfig {
	
	private final static String message="topic.message";
	
	private final static String messages="topic.messages";
	
	/**
	 * 新建两个队列
	 */
	@Bean
	public Queue queueMessage( ){
		return new Queue(TopicRabbitConfig.message);
	}
	@Bean
	public Queue queueMessages( ){
		return new Queue(TopicRabbitConfig.messages);
	}
	/**
	 * 新建名叫topicExchange的topic交换器
	 */
	@Bean
	TopicExchange topicExchange(){
		return new TopicExchange("topicExchange");
	}
	/**
	 * 
	 * 绑定队列、交换器，路由键
	 * 此时topic.message队列会收到消息
	 */
	@Bean
	Binding bindingExchangeMessage(Queue queueMessage,TopicExchange topicExchange){
		String routingKey="topic.message";
	return BindingBuilder.bind(queueMessage).to(topicExchange).with(routingKey);
	}
	/**
	 * #相当于sql中的*
	 * 此时topic.messages和topic.message都会收到消息
	 */
	@Bean
	Binding bindingExchangeMessages(Queue queueMessages,TopicExchange topicExchange){
		String routingKey="topic.#";
	return BindingBuilder.bind(queueMessages).to(topicExchange).with(routingKey);
	}
}
