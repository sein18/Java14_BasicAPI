# 기본 API

<h4> String 관련 크래스 </h4>

* __String 클래스__
  * 문자열 값 수정 불가능, immutable(불변) 수정 시 수정된 문자열이 새로 할당 되어 새 주소를 넘긴다.
* __StringBuffer 클래스__
  * 문자열 값 수정 가능하다.  mutable(가변)
  * 수정, 삭제 등이 기존 문자열에 수정되어 적용된다.
  * 기본 16문자 크기로 지정된 버퍼를 이용하며 크기 증가가 가능하다. 
  * 쓰레드 safe기능 제공(성능 저하 요인)
* __StringBuilder 클래스__
  * StringBuffer와 동일하나 쓰레드 safe기능을 제공하지 않는다.

---

* __String API__

```java
	String str = "abc";	
	
	// charAT(i) ,index(i)번째 값 출력
	System.out.println(str.charAt(0));
	// concat(합치기값)
	System.out.println(str.concat("def"));
	// contains(포함여부값)
	System.out.println(str.contains("a"));
	// equals(비교값)
	System.out.println(str.equals("abc"));
	// length() string 크기반환
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
```

---

* __StringBuilder API__

~~~java
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
~~~

---

* __StringTokenizer 클래스__ : String클래스에서 제공하는 split()메소드와 같은 기능을 하는 클래스로 생성 시 전달받은 문자열을 구분자로 나누어 각 토큰에 저장

```java
import java.util.*;
public class TestStringTokenizer{
	public static void main(String[] args){
		
        String str = "AA|BB|CC";

        StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			}
		}
	}
```

---

* __Wrapper 클래스__

  * 기본 자료형을 String으로 바꾸기

  ```java
  String b = Byte.valueOf((byte)1).toString();
  String s = Short.valueOf((short)2).toString();
  String i = Integer.valueOf(3).toString();
  String l = Long.valueOf(4L).toString();
  String f = Float.valueOf(0.1f).toString();
  String d = Double.valueOf(0.2).toString();
  String bool = Boolean.valueOf(true).toString();
  String ch = Character.valueOf('a').toString();
  
  ```

  