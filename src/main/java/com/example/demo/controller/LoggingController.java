package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	@RequestMapping(value = "/logging", method = RequestMethod.PUT)
	public void printLogs(@RequestBody Logger l) {
		System.out.println(l.getLogString());
	}

	public static class Logger {
		private String logString;

		public String getLogString() {
			return logString;
		}

		public void setLogString(String logString) {
			this.logString = logString;
		}

	}

}