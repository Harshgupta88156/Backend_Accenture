package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class data1 {
@Id
	String label;
int count;
String colour;

int part;
public data1(String label, int count, String colour, int part) {
	super();
	this.label = label;
	this.count = count;
	this.colour = colour;
	this.part = part;
}

}
