package com.chap01.string;

public class Run {

	public static void main(String[] args) {
		Run.method1();
	}

	public static void method1() {

		// 문자열을 리터널로 생성
		String str = "abc";
		String str1 = "abc";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());

		// new 연산자 이용
		String str2 = new String("abc");
		String str3 = new String("abc");

		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		System.out.println();
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		System.out.println("===========================");
		// charAT(i)
		System.out.println(str.charAt(0));
		// concat(합치기값)
		System.out.println(str.concat("def"));
		// contains(포함여부값)
		System.out.println(str.contains("a"));
		// equals(비교값)
		System.out.println(str.equals("abc"));
		// length()
		System.out.println(str.length());

		// split(문자구분)
		str1 = "a,b,c,d,e,f";
		String sArr[] = str1.split(",");
		for (String arr : sArr)
			System.out.print(arr);

		System.out.println();
		// toUpperCase(대문자로),toLowerCase(소문자로)
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		// substring(잘라내기)
		System.out.println(str1.substring(2, 4));
		// trim(공백 제거 앞,뒤만)
		str2 = "    abc    abc  ";
		System.out.println(str2.trim());

	}
}
