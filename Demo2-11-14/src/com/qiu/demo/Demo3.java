package com.qiu.demo;

import java.util.Arrays;

public class Demo3 {
	/**
	 * ������һ����ΪmyArr1�ķ���
	 */
	public static  void myArr1(){
		/**
		 * ������һ�������͵����飬���鳤��Ϊ5.
		 */
		int[] arr = new int[5];
		/**
		 * �������ڵ�λ�ø�ֵ��
		 */
	    arr[0] = 1;
	    arr[1] = 3;
	    arr[2] = 5;
	    arr[3] = 7;
	    arr[4] = 9;
	    /**
	     * ��ӡ�������
	     */
	    System.out.println(Arrays.toString(arr));
	    /**
	     * ���������ĳ���
	     */
	    System.out.println(arr.length);
	    /**
	     * �����������е�4������ֵ��
	     */
	    System.out.println(arr[3]);
	}
	public static void main(String[] args){
		/**
		 * ���÷�������myArr1�ķ���
		 */
		myArr1();
		
	}

}
