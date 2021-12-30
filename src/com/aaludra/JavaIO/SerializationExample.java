package com.aaludra.JavaIO;

import java.io.*;

public class SerializationExample implements Serializable {
	int id;
	String name;

	SerializationExample(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
