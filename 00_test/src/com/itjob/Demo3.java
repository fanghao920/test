package com.itjob;

import java.lang.reflect.Method;
import java.util.ArrayList;

class Person{
	public static void show(){
		System.out.println("show");
	}
}
public class Demo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 1; i <= 20; i++){
			al.add(i);
		}
		int size = al.size();
		while(size > 1){
			for(int i = 0; i < size; i = i + 2){
				al.set(i, -1);
			}
			for(int i = 0; i < al.size(); i++){
				if(al.get(i) == -1){
					al.remove(i);
					i--;
				}
			}

			size = al.size();
		}
		System.out.println(al.get(0));
	}

}
