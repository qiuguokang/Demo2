package com.qiu.demo;

import java.util.Arrays;

public class Demo2 {
	static int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
	public static void myArr1(){
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[5]);
		System.out.println(arr[8]);
	}
	public static void main(String[] args){
		myArr1();
	}
}
