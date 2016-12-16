package com.qiu.demo;

import java.util.Arrays;

public class Demo3 {
	/**
	 * 创建了一个名为myArr1的方法
	 */
	public static  void myArr1(){
		/**
		 * 定义了一个整数型的数组，数组长度为5.
		 */
		int[] arr = new int[5];
		/**
		 * 给数组内的位置赋值。
		 */
	    arr[0] = 1;
	    arr[1] = 3;
	    arr[2] = 5;
	    arr[3] = 7;
	    arr[4] = 9;
	    /**
	     * 打印这个数组
	     */
	    System.out.println(Arrays.toString(arr));
	    /**
	     * 求这个数组的长度
	     */
	    System.out.println(arr.length);
	    /**
	     * 输出这个数组中第4个数的值。
	     */
	    System.out.println(arr[3]);
	}
	public static void main(String[] args){
		/**
		 * 调用方法名是myArr1的方法
		 */
		myArr1();
		
	}

}
