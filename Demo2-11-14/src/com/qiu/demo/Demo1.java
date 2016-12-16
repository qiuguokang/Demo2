package com.qiu.demo;

public class Demo1 {
	/**
	 * 无返回值，无参数的函数类型
	 */
	public void myTest1(){
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	/**
	 * 无返回值，有参数的函数类型
	 */
	public void myTest2(int a,int b){
		int c = a + b;
		System.out.println(c);
	}
	/**
	 * 有返回值，无参数的类型
	 */
	public double myTest3(){
		double a = 3.5;
		double b = 4.2;
		double c = a + b;
		return(c);
	}
	/**
	 * 有返回值，有参数的类型
	 */
	public double myTest4(float a,float b){
		double c =(double)(a+b);
		return c;
	}

}
