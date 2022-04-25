package com.chap03.stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	
	//countTokens : ��ū �� �ľ�
	//nextToken : ��ū �о����
	//hasMoreTokens : ��ū�� �����ִ��� Ȯ��, boolean
	public static void main(String[] args) {
		String str = "�ڼ���,27,����� ���Ʊ�,��";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); 
		}
	}

}
