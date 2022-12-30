package com.anudip;

public class Agent {
private int id;
private String name;
private int commission;
public Agent() {
	
	// TODO Auto-generated constructor stub
}
public Agent(int id, String name, int commission) {
	
	this.id = id;
	this.name = name;
	this.commission = commission;
}

public Agent(int id, int commission) {
	
	this.id = id;
	this.commission = commission;
}

public Agent(int id) {
	
	this.id = id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCommission() {
	return commission;
}
public void setCommission(int commission) {
	this.commission = commission;
}

}
