package day07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		/*
		//���� 1.
		Scanner input = new Scanner(System.in);
		String str;
		System.out.print("���ڿ� �Է� : ");
		str = input.next();
		System.out.println("�Է� ���� ���ڿ� : " + str);
				
		//���� 2.
		Scanner input = new Scanner(System.in);
		String str = new String();
		System.out.print("���ڿ� �Է� : ");
		str = input.next();
		System.out.println("�Է� ���� ���ڿ� : " + str);
				
		//���� 3.
		String str = new String("Java is Easy. �׸��� programming �Ҹ��ϴ�.");
		System.out.println("�⺻ : " + str);
		String changeStr = new String();
		changeStr = str.toUpperCase();
		System.out.println("��ȯ �� : " + changeStr);
		changeStr = str.toLowerCase();
		System.out.println("��ȯ �� : " + changeStr);
		
		//���� 4.
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		String addStr;
		addStr = "a";
		System.out.println(addStr);
		addStr += "b";
		System.out.println(addStr);
		System.out.println(str.charAt(0) == 'a');
		System.out.println(str.charAt(0) == 'c');
		System.out.println(str.charAt(0) - 32);
		System.out.println((char)(str.charAt(0) - 32));
		
		//���� 5.
		String str = new String("Have a nice day Have a nice day Have a nice day");

		ArrayList arr = new ArrayList();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				arr.add(i);
			}
		}
		System.out.println("��� : " + arr);
				
		//���� 6.
		String str = new String("It is a fun java programming");
		int numa = 0, numg = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				numa += 1;
			}
			if(str.charAt(i)=='g') {
				numg += 1;
			}
		}
		System.out.println("�� ���� : " + str.length());
		System.out.println("a ���� : " + numa);
		System.out.println("b ���� : " + numg);
		
		*/
		//���� 7.
		//������ ������ �� ���� �ִ��� �� �� ���� ��Ȳ���� ù��° ���ĺ��� �빮�ڷ� �����Ͻÿ�.
		String str = new String("tESt  sTring   change    first");
		String changeStr = new String();
		changeStr = str.toLowerCase();
		System.out.println(changeStr);
		String[] split = changeStr.split(" ");
		for(int i = 0; i<split.length; i++) {
			System.out.print(split[i]+" ");
		}
		System.out.println();
		for(int i = 0; i<split.length; i++) {
//			System.out.print(split[i]+" ");
			for(int j = 0; j<split[i].length(); j++) {
				if(j==0) {
				System.out.print(split[i].substring(0,j+1).toUpperCase() + split[i].substring(j+1));
				}
			}
			System.out.print(" ");
		}
		/*
		
		//���� 8.
		String str = new String(" Have a nice day  ");
		String result = str.trim();
		System.out.println("1 : " + str + "..");
		System.out.println("2 : " + result + "..");
		
		String[] split = result.split(" ");
		for(int i = 0; i < split.length; i++) {
			System.out.println(i + " : " + split[i]);
		}
		String replace = result.replace(" ", "==");
		System.out.println("replace : " + replace);
		
		
		//���� 9.
		System.out.println("====���� �� str====");
		String str = "�谳�� -2019��\nȫ�浿���� -2015��\n���켱�� -2018��";
		System.out.println(str);
		System.out.println("====���� �� str====");
		String[] split = str.split("\n");
		for(int i = 0; i<split.length; i++) {
			//System.out.println(split[i]);
			for(int j = 0; j<split[i].length(); j++) {
				if(j==split[i].length()-1) {
					String n1 = split[i].substring(j-4,j);
					//String n2 = split[i].substring(j-3, j-2);
					//String n3 = split[i].substring(j-2, j-1);
					//String n4 = split[i].substring(j-1, j);
					//System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4);
					split[i] = split[i].replace(n1, "1999");
					//split[i] = split[i].replace(n2, "9");
					//split[i] = split[i].replace(n3, "9");	
					//split[i] = split[i].replace(n4, "9");
				}				
			}	
		}
		for(int i = 0; i<split.length; i++) {
			System.out.println(split[i]);
		}
		
		*/
	}	
}
