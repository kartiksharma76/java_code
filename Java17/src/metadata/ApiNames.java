package com.jdbc.metadata;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApiNames {
	public static void main(String[] args) {

		try {
			Class<?> className = Class.forName("java.sql.PreparedStatement");
			Method[] methods = className.getDeclaredMethods();
			List<String> collect = Arrays.stream(methods).filter(m -> Modifier.isPublic(m.getModifiers()))
					.map(Method::getName).sorted().distinct().collect(Collectors.toList());
			System.out.println(collect.size());
			System.out.println("java.nio.file.Files");
			collect.forEach(System.out::println);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
