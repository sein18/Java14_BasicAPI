package com.chap02.stringBuffer_Builder;
//String���� ���� �ٲ� ���°�!!!
public class Run {

	public static void main(String[] args) {
		Run.method();
		Run.method2();

	}
	public static void method() {
		StringBuilder sb = new StringBuilder("�ƾ� ������ħ?");
		System.out.println(sb);
		
		
		String str = "�ȳ��ϼ���?";
		System.out.println("str ����: " + str + ", �ּ�: " + System.identityHashCode(str));
		
		str += "���� �ڼ����Դϴ�.";
		System.out.println("str �߰� ��: " + str + ", �ּ�: " + System.identityHashCode(str));

		StringBuffer sf = new StringBuffer("������ ��ħ");
		System.out.println("sf ����: " + sf + ", �ּ�: " + sf.hashCode() + ", " + System.identityHashCode(sf));

		sf.append("�ҽ��ϳ׿�!");
		System.out.println("sf �߰� ��: " + sf + ", �ּ�: " + sf.hashCode() + ", " + System.identityHashCode(sf));
	}
	
	public static void method2() {
		StringBuilder sb =new StringBuilder("�� ");
		
		//append
		sb.append("Ŀ�� �Ծ�").append("~!");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());

		//insert
		sb.insert(0, "���� �� ���� ");
		System.out.println(sb);
		
		//detete
		sb.delete(0, 8);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
