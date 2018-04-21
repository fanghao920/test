package com.itjob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {
	public static void swap(Integer i1, Integer i2){
		Integer temp = i1;
		i1 = i2;
		i2 = temp;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String format = String.format("%d:%d:%d", 2018,3,27);
		System.out.println(format);
	}

}
