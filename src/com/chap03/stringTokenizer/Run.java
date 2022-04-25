package com.chap03.stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	
	//countTokens : 토큰 수 파악
	//nextToken : 토큰 읽어오기
	//hasMoreTokens : 토큰이 남아있는지 확인, boolean
	public static void main(String[] args) {
		String str = "박세인,27,서울시 관아구,남";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); 
		}
	}

}
