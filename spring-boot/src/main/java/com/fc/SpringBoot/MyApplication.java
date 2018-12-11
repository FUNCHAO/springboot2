package com.fc.SpringBoot;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.core.Pollers;
import org.springframework.integration.feed.inbound.FeedEntryMessageSource;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.jms.core.JmsTemplate;

import com.fc.SpringBoot.jms.Msg;
import com.rometools.rome.feed.synd.SyndEntry;
//括号内：springboot启动时会自动注入数据源和配置，在@SpringBootApplication中排除其注入..去掉之后会连接配置的数据库
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class MyApplication /**implements CommandLineRunner*/ {
	/*@Autowired
	private JmsTemplate jmsTemplate;*/
	public static void main(String[] args) {
		 
		SpringApplication.run(MyApplication.class, args);

	}
	/**
	 * jms:实现CommandLineRunner
	 * springboot 为我们提供了CommandLineRunner接口，用于程序启动后执行的代码，通过重写期run方法执行
	 * 通过注入的jmsTemplate的send方法向 my-destination目的地发生Msg的消息，这里也等于在消息代理
	 * 上定义了一个目的地叫my-destination
	 * 
	 */
//	@Override activemq未启动，所以注释掉
//	public void run(String... args) throws Exception {
//		System.out.println("--------------fc验证是否开机启动执行------1-------");
//		System.out.println("--------------fc验证是否开机启动执行------2-------");
//		System.out.println("--------------fc验证是否开机启动执行------3-------");
//		System.out.println("-------------args"+args.toString());
//		System.out.println("--------------fc验证是否开机启动执行------4-------");
//		System.out.println("--------------fc验证是否开机启动执行------5-------");
//		System.out.println("--------------fc验证是否开机启动执行------6-------");
//		jmsTemplate.send("my-destination",new Msg());
//		
//	}
	/**
	 * spring integraion  资料有问题所以暂时不学习此内容，注释掉
	 */
//	@Value("https://spring.io/blog.atom")//通过注解自动获取该路径的资源
//	Resource resource;
//	
//	@Bean(name=PollerMetadata.DEFAULT_POLLER)
//	public PollerMetadata poller(){
//		return Pollers.fixedRate(500).get();
//	}
//	public FeedEntryMessageSource feedMessageSource() throws IOException{
//		FeedEntryMessageSource feedEntryMessageSource 
//				=new FeedEntryMessageSource(resource.getURL(),"news");
//	return feedEntryMessageSource;
//	}
//	public IntegrationFlow myFlow()throws IOException{
//		return IntegrationFlows.from(feedMessageSource() )
//				.<SyndEntry,String> route(payload->)
//	}

}
