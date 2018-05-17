package com.advancedjava.formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.util.converter.LocalDateTimeStringConverter;

public class Fomatter {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(nowString);
	}

}
