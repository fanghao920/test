package com.itjob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo1 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("aaa");
		lhs.add("bbb");
		lhs.add("ccc");
		System.out.println(lhs);
		
		HashSet<String> lhss = new HashSet<>();
		lhss.add("aaa");
		lhss.add("bbb");
		lhss.add("ccc");
		System.out.println(lhss);
		
	}

}
