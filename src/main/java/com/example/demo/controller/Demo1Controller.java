package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class Demo1Controller {

    private Logger log = Logger.getLogger(getClass().getName());

	@RequestMapping("/")
	public @ResponseBody String demo() {
		log.info("===== demo-1 controller =====");
		return "demo-1 controller";
	}
}
