package day07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		/*
		//예제 1.
		Scanner input = new Scanner(System.in);
		String str;
		System.out.print("문자열 입력 : ");
		str = input.next();
		System.out.println("입력 받은 문자열 : " + str);
				
		//예제 2.
		Scanner input = new Scanner(System.in);
		String str = new String();
		System.out.print("문자열 입력 : ");
		str = input.next();
		System.out.println("입력 받은 문자열 : " + str);
				
		//예제 3.
		String str = new String("Java is Easy. 그리고 programming 할만하다.");
		System.out.println("기본 : " + str);
		String changeStr = new String();
		changeStr = str.toUpperCase();
		System.out.println("변환 후 : " + changeStr);
		changeStr = str.toLowerCase();
		System.out.println("변환 후 : " + changeStr);
		
		//예제 4.
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
		
		//예제 5.
		String str = new String("Have a nice day Have a nice day Have a nice day");

		ArrayList arr = new ArrayList();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				arr.add(i);
			}
		}
		System.out.println("결과 : " + arr);
				
		//예제 6.
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
		System.out.println("총 개수 : " + str.length());
		System.out.println("a 개수 : " + numa);
		System.out.println("b 개수 : " + numg);
		
		*/
		//예제 7.
		//현재의 공백은 몇 개가 있는지 알 수 없는 상황에서 첫번째 알파벳만 대문자로 변경하시오.
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
		
		//예제 8.
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
		
		
		//예제 9.
		System.out.println("====변경 전 str====");
		String str = "김개똥 -2019년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println(str);
		System.out.println("====변경 후 str====");
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
