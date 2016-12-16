package com.qiu.demo;

public class Test1 {
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.myTest1();
		d1.myTest2(12, 23);
		double x = d1.myTest3();
		System.out.println("无参数，有返回值："+ x);
		double y = d1.myTest4(4.0f, 2.4f);
		System.out.println("有参数，有返回值"+ y);
		
	}

}
