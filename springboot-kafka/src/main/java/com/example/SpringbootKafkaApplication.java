package com.example;

import com.example.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringbootKafkaApplication  {

	@Autowired
	private  static Sender sender;
	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringbootKafkaApplication.class, args);
		while(true){
			sender.sendMessage();
			Thread.sleep(500);
		}
	}


}
