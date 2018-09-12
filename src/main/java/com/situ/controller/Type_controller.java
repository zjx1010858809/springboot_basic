package com.situ.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.model.Type;
import com.situ.service.Type_service;

@Controller
@RequestMapping("Type")
public class Type_controller extends basicController<Type> {
@Resource(name="Type_serviceImpl")
Type_service service;
}
