package com.advancedjava.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bs[] = new byte[5];
		int index = 0;
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("D:\\eclipseWorkspace\\text.txt");
			os = new FileOutputStream("D:\\textout.txt");
			while (true) {
				int count = is.read(bs);// integer형 정수의 크기는 4바이트인데 5바이트씩 읽어서 처리
										// 할 수 있나 ? answer read method는 5바이트 단위로
										// 끊어서 읽는다 고로 count값에서는 읽은 바이트 값 0~4
										// byte 배열에서는 5바이트 크기의 데이터를 읽어서 저장
				if (count == -1)
					break;

				os.write(bs, 0, count); // byte 배열안에 읽어들인 데이터 값이 저장 돼 있다.
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != os) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != is) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		/*
		 * try { is = new FileInputStream("D:\\eclipseWorkspace\\text.txt");
		 * while (true) { int i = is.read(); bs[index] = (byte) i;
		 * System.out.println("데이터 :" + i); index++; if (i == -1) break; }
		 * String str = new String(bs);
		 * 
		 * System.out.println(str);
		 * 
		 * os = new FileOutputStream("D:\\textout.txt");
		 * 
		 * byte[] arrayByte = str.getBytes();
		 * 
		 * os.write(bs);
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } finally { if (null != os) { try { os.close();
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } } if (null != is) { try { is.close(); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } } }
		 */

	}

}
