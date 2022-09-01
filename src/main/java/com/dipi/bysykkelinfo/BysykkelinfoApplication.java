package com.dipi.bysykkelinfo;

import com.dipi.bysykkelinfo.controller.InformationStatusController;
import com.dipi.bysykkelinfo.payload.InformationStation;
import com.dipi.bysykkelinfo.service.InformationStatusService;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class BysykkelinfoApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(BysykkelinfoApplication.class, args);

	}

	}

