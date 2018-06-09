package com.advancedjava.designpattern.strategy;

public class WebClientSide implements ClientSide{
	@Override
	public String getClientProgramming() {
		return "Javascript, Html";
	}
}