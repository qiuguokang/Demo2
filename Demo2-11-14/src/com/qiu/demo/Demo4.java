package com.qiu.demo;
/**
 * ²âÊÔ++£¬--µÄ×÷ÓÃ
 * (1)²âÊÔ++
 *    1)²âÊÔ  ++a
 *    2)²âÊÔ  a++
 * (2)
 *    1)²âÊÔ--a
 *    2)²âÊÔa--
 */
public class Demo4 {
	/**
	 * ²âÊÔ++aµÄÓÃ·¨
	 */
	int a = 1;
	public void myTest1(){
		int b =10;
		++b;
		System.out.println(b);
	}
	public void myTest2(){
		++a;
		System.out.println(a);
	}

}
