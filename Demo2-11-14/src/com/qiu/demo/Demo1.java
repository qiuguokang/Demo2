package com.qiu.demo;

public class Demo1 {
	/**
	 * �޷���ֵ���޲����ĺ�������
	 */
	public void myTest1(){
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	/**
	 * �޷���ֵ���в����ĺ�������
	 */
	public void myTest2(int a,int b){
		int c = a + b;
		System.out.println(c);
	}
	/**
	 * �з���ֵ���޲���������
	 */
	public double myTest3(){
		double a = 3.5;
		double b = 4.2;
		double c = a + b;
		return(c);
	}
	/**
	 * �з���ֵ���в���������
	 */
	public double myTest4(float a,float b){
		double c =(double)(a+b);
		return c;
	}

}
