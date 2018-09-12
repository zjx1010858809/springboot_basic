package com.situ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class def_controller {
@RequestMapping("/")
public String ss() {
	return "index";
}
}
