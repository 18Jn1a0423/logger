package com.example.demo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class LoggerService {
	Logger log=LoggerFactory.getLogger(LoggerService.class);
	public String print() {
	log.trace("This is tracing");
	log.debug("This is debugging");
	log.info("this is a info message");
	log.warn("this is a warn message");
	log.error("this is a error message");
	return "hello pavani";

	}

	}

