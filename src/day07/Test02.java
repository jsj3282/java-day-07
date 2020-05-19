package day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		/*
		//예제 1.
		HashSet hs = new HashSet();
		hs.add("라면");		hs.add("김밥");
		hs.add("순대");		hs.add("김밥");
		System.out.println("HashSet : " + hs);
		
		ArrayList arr = new ArrayList();
		arr.add("라면");		arr.add("김밥");
		arr.add("순대");		arr.add("김밥");
		System.out.println("ArrayList : " + arr);
		
		
		//예제 2.
		HashSet hs = new HashSet();
		boolean bool;
		bool = hs.add("라면");		System.out.println(bool);
		bool = hs.add("고길동");		System.out.println(bool);
		bool = hs.add("현대인"); 	System.out.println(bool);
		bool = hs.add("고길동");		System.out.println(bool);
		System.out.println("HashSet : " + hs);
		
		
		//예제 3.
		HashSet hs = new HashSet();
		hs.add("라면");		hs.add("김밥");
		hs.add("순대");		hs.add("김밥");
		System.out.println("HashSet : " + hs);
		System.out.println(hs.remove("김밥"));
		System.out.println("HashSet : " + hs);
		
		//예제 4.
		HashSet hs = new HashSet();
		hs.add("1. 대부");
		hs.add("2. 반지의 제왕");
		hs.add("3. 겨울왕국");
		hs.add("4. 다크나이트");
		hs.add("5. 해리포터");
		hs.add("6. 공공의 적");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
//			String name = (String)it.next();
			System.out.println(name);
		}
		
		
		//예제 5.
		HashSet hs = new HashSet();
		hs.add("1. 대부");
		hs.add("2. 반지의 제왕");
		hs.add("3. 겨울왕국");
		hs.add("4. 다크 나이트");
		hs.add("5. 해리포터");
		hs.add("6. 공공의 적");
		Iterator it = hs.iterator();
		Scanner input = new Scanner(System.in);
		System.out.print("삭제할 책 : ");
		String name = input.nextLine();
		while(it.hasNext()) {
			if(name.equals((String)it.next())){
				System.out.println("삭제완료");
				it.remove();
			}
		}
		it = hs.iterator();
		while(it.hasNext()) {
			name = (String)it.next();
			System.out.println(name);
		}
		
		*/
	} 

}
