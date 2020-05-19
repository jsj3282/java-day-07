package day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		/*
		//예제 1.
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		System.out.println("선풍기 : " + map.get("선풍기"));
		System.out.println("에어컨 : " + map.get("에어컨"));
		System.out.println("자동차 : " + map.get("자동차"));
		System.out.println("없는값 : " + map.get("없는값"));
		
		//예제 2.
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String key = null;
		String value = null;
		System.out.print("저장할 키 입력 : ");
		key = input.next();
		System.out.print("저장할 값 입력 : ");
		value = input.next();
		map.put(key, value);
		System.out.println(map);
		
		//예제 3.
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		System.out.println("결과 : " + map.containsKey("에어컨"));
		map.replace("선풍기", "123456");
		System.out.println(map);
		
		//예제 4.
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		System.out.println(map.remove("에어컨"));
		System.out.println("결과 : " + map.containsKey("에어컨"));
		
		//예제 5.
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "에어컨");
		
		System.out.println("목록 : " + map.keySet());
	
		//예제 6.
		HashMap map = new HashMap();
		String key = null;
		String value = null;
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
		//예제 7.
		LinkedHashMap map = new LinkedHashMap();
		//HashMap map = new HashMap(); 
		String key = null;
		String value = null;
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
		//예제 8.
		HashMap map = new HashMap(); 
		String key = null;
		String value = null;
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		System.out.println("목록 : " + map.entrySet());
		
		*/
		//예제 9.
		Scanner input = new Scanner(System.in);
		int num;
		LinkedHashMap map = new LinkedHashMap();
		String menu = null;
		String price = null;
		String menu2;
		boolean flag = true;
		while(flag) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종 료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				System.out.print("저장할 메뉴 입력 : ");
				menu = input.next();
				System.out.print("저장할 가격 입력 : ");
				price = input.next();
				map.put(menu, price);
				break;
			case 2:
				Iterator it = map.keySet().iterator();
				int i = 1;
				while(it.hasNext()) {
					menu = (String)it.next();
					System.out.println(i + ". " + menu + " : " + map.get(menu));
					i++;
				}
				System.out.println("1. 수정   2. 삭제   3. 나가기");
				System.out.print(">>> ");
				int num2 = input.nextInt();
				switch(num2) {
				case 1:
					System.out.print("수정하실 메뉴의 이름을 입력하시오 : ");
					menu = input.next();
					if(map.containsKey(menu)) {
						System.out.print("수정하실 가격은 무엇입니까? : ");
						price = input.next();
						map.replace(menu, price);
					}else {
						System.out.println("메뉴가 없습니다.");
					}
					break;
				case 2:
					System.out.println("삭제하실 메뉴의 이름을 입력하시오 : ");
					menu = input.next();
					if(map.containsKey(menu)) {
						map.remove(menu);
					}
					break;
				case 3:
					System.out.println("나가기");
					break;
				}
				break;
			case 3:
				System.out.println("시스템 종료");
				flag = false;
			}
		}
		
	}
}
