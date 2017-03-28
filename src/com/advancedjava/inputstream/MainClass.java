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
				int count = is.read(bs);// integer�� ������ ũ��� 4����Ʈ�ε� 5����Ʈ�� �о ó��
										// �� �� �ֳ� ? answer read method�� 5����Ʈ ������
										// ��� �д´� ��� count�������� ���� ����Ʈ �� 0~4
										// byte �迭������ 5����Ʈ ũ���� �����͸� �о ����
				if (count == -1)
					break;

				os.write(bs, 0, count); // byte �迭�ȿ� �о���� ������ ���� ���� �� �ִ�.
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
		 * System.out.println("������ :" + i); index++; if (i == -1) break; }
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
