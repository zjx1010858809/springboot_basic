package com.situ.model;

import java.io.Serializable;

public class Type implements Serializable{
private int id;
private int parentid;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getParentid() {
	return parentid;
}
public void setParentid(int parentid) {
	this.parentid = parentid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
