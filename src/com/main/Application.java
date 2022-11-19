package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> c = new ArrayList<>(10);
		
		for(int i=0;i<10;i++) {
			
			Random a = new Random();
			int r = a.nextInt(100);
			if (!(r==0)) {
			c.add(r);
			}else {
			int minimum =25;
			int maximum =50;
			Random f = new Random();
			int e = f.nextInt(minimum,maximum+1);
			c.add(e);
			System.out.println(e);
			}
		}
		Collections.sort(c);
		System.out.println(c);
		
	}

}
