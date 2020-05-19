package day07;

import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		
		/*
		//예제 1.
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println("개수 : " + arr.size());
		
		
		//예제 2.
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num;
		String addNum, printNum;
		System.out.print("만들 공간의 개수 입력 : ");
		num = input.nextInt();
		for(int i = 0; i<num; i++){
			System.out.print("추가할 수 입력 : ");
			addNum = input.next();
			arr.add(addNum);
		}
		System.out.println("--- 저장된 값 출력!! ---");
		for(int i = 0; i<arr.size(); i++) {
			printNum = (String)arr.get(i);
			System.out.println(printNum);
		}
		
		//예제 3.
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println("개수 : " + arr.size());
		System.out.println(arr.contains("123"));
		
		//예제 4.
		ArrayList arrList = new ArrayList();
		arrList.add("123");
		arrList.add("456");
		System.out.println("지우기 전 [0] : " + arrList.get(0));
		System.out.println("지우기 전 [1] : " + arrList.get(1));
		System.out.println("결과 값 : " + arrList.remove("123"));
		System.out.println("지우기 후 [0] : " + arrList.get(0));
		
		ArrayList arrClear = new ArrayList();
		arrClear.add("123");	arrClear.add("456");
		System.out.println(arrClear.get(0));
		System.out.println(arrClear.get(1));
		arrClear.clear();
		System.out.println();
		System.out.println("삭제 후");
		System.out.println(arrClear.get(0));
		System.out.println(arrClear.get(1));
		
		//예제 5.
		Scanner input = new Scanner(System.in);
		ArrayList foodList = new ArrayList();
		int num;
		foodList.add("설탕");	foodList.add("소금");
		foodList.add("계란"); foodList.add("라면");
		System.out.println(foodList);
		System.out.print("변경할 위치 입력 : ");
		num = input.nextInt();
		System.out.print("변경할 값 입력 : ");
		String value = input.next();
		foodList.set(num, value);
		for(int i = 0; i<foodList.size(); i++) {
			System.out.println(i + "번째 : " + foodList.get(i));
		}
		*/
		//예제 6.
		Scanner input = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("설탕");	food.add("소금");
		food.add("계란");  food.add("라면");
		System.out.println(food);
		System.out.print("찾는 값 입력 : ");
		String value = input.next();
		System.out.println(value + " 위치 : " + food.indexOf(value));
		
		/*
		//예제 7.
		//연락처 저장 프로그램 만들기(ArrayList 2개를 사용하여 만드시오.)
		//하나의 리스트 : 이름정보   //하나의 리스트 : 연락처정보
		Scanner input = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList contact = new ArrayList();
		String addName;
		String addContact;
		String removeName;
		String viewName;
		boolean flag = true;
		while(flag) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			int num = input.nextInt();
			switch(num) {
			case 1 : {
				System.out.print("이름 : ");
				addName = input.next();
				name.add(addName);
				System.out.print("전화번호 : ");
				addContact = input.next();
				contact.add(addContact);
				break;
			}
			case 2:
			{
				System.out.print("검색할 연락처의 이름을 입력하시오 : ");
				viewName = input.next();
				if(name.contains(viewName)) {
					int num1 = name.indexOf(viewName);
					System.out.println("이름 : " + name.get(num1));
					System.out.println("연락처 : " + contact.get(num1));
				}else {
					System.out.println("검색할 연락처가 목록에 없습니다.");
				}
				break;
			}
			case 3:
			{
				System.out.print("삭제할 연락처의 이름을 입력하시오 : ");
				removeName = input.next();
				if(name.contains(removeName)){
					int num2 = name.indexOf(removeName);
					name.remove(removeName);
					contact.remove(num2);
				}else {
					System.out.println("삭제할 연락처가 존재하지 않습니다.");
				}
				break;
			}
			case 4 : {
				for(int i = 0; i<name.size(); i++) {
					System.out.print(i+1+"번.\t이름 : " + name.get(i) + "\t");
					System.out.println("연락처 : " + contact.get(i));
				}
				break;
			}
			case 5:{
				System.out.println("시스템을 종료합니다.");
				flag = false;
				}
			}		
		}
		*/
	}
}
