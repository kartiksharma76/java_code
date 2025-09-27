package com.jdbc.nptl;

public class W10_P2 {
public static void main(String[] args) {
	String url = "jdbc.sqlite,test.dp";
	if (url.equals("jdbc.sqlite,test.dp")) {
		System.out.println("Connection String ready");
		
	}else {
		System.out.println("Incorrect COnnection String");
	}
}
}
