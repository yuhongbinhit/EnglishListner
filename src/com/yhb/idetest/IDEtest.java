package com.yhb.idetest;

public class IDEtest {
	String s;
	static class InnerClass{
		int m=1;
		public void in(){
			System.out.println("Inner");
		}
	}
	static void innerMethod(){
			System.out.println("Inner Method");
	}

}
