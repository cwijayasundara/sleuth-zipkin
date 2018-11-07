package com.cham.feignserver;

import com.cham.feignserver.producer.KafkaTradeProducer;
import com.cham.feignserver.stream.TradeStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(TradeStream.class)
public class FeignServerApplication {

	@Autowired
	private KafkaTradeProducer kafkaTweetProducer;

	public static void main(String[] args) {
		SpringApplication.run(FeignServerApplication.class, args);
	}

}
