package com.lip.deb;

import java.util.stream.Stream;

public class Array_to_Stream {
	public static void main(String[] args) {
		String[] names = {"LIPSA","DEBASISH","DEB","DEBU"};
		Stream arrayData = Stream.of(names);
		arrayData.forEach(System.out::println);
		
	}

}
