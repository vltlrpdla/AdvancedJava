package com.advancedjava.threadtest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoteThread voteThread1 = new VoteThread();
		VoteThread voteThread2 = new VoteThread();
		VoteThread voteThread3 = new VoteThread();
		
		
		Thread location1 = new Thread(voteThread1,"location1");
		Thread location2 = new Thread(voteThread1,"location2");
		Thread location3 = new Thread(voteThread1,"location3");
		
		location1.start();
		location2.start();
		location3.start();
	}

}
