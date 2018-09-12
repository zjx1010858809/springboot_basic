package com.situ.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.mapper.Type_mapper;
import com.situ.model.Type;
import com.situ.service.Type_service;
@Service("Type_serviceImpl")
public class Type_serviceImpl extends basicServiceImpl<Type> implements Type_service{
@Resource(name="Type_mapper")
Type_mapper mapper;
}
