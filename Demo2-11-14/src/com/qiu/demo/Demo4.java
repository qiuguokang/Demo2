package com.qiu.demo;
/**
 * ����++��--������
 * (1)����++
 *    1)����  ++a
 *    2)����  a++
 * (2)
 *    1)����--a
 *    2)����a--
 */
public class Demo4 {
	/**
	 * ����++a���÷�
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
