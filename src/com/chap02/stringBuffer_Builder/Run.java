package com.chap02.stringBuffer_Builder;
//String값이 많이 바뀔때 쓰는거!!!
public class Run {

	public static void main(String[] args) {
		Run.method();
		Run.method2();

	}
	public static void method() {
		StringBuilder sb = new StringBuilder("아아 좋은아침?");
		System.out.println(sb);
		
		
		String str = "안녕하세요?";
		System.out.println("str 기존: " + str + ", 주소: " + System.identityHashCode(str));
		
		str += "저는 박세인입니다.";
		System.out.println("str 추가 후: " + str + ", 주소: " + System.identityHashCode(str));

		StringBuffer sf = new StringBuffer("아직은 아침");
		System.out.println("sf 기존: " + sf + ", 주소: " + sf.hashCode() + ", " + System.identityHashCode(sf));

		sf.append("쌀쌀하네요!");
		System.out.println("sf 추가 후: " + sf + ", 주소: " + sf.hashCode() + ", " + System.identityHashCode(sf));
	}
	
	public static void method2() {
		StringBuilder sb =new StringBuilder("난 ");
		
		//append
		sb.append("커피 먹어").append("~!");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());

		//insert
		sb.insert(0, "잠이 덜 깨서 ");
		System.out.println(sb);
		
		//detete
		sb.delete(0, 8);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
