package day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		/*
		//���� 1.
		HashMap map = new HashMap();
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "20����");
		
		System.out.println("��ǳ�� : " + map.get("��ǳ��"));
		System.out.println("������ : " + map.get("������"));
		System.out.println("�ڵ��� : " + map.get("�ڵ���"));
		System.out.println("���°� : " + map.get("���°�"));
		
		//���� 2.
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String key = null;
		String value = null;
		System.out.print("������ Ű �Է� : ");
		key = input.next();
		System.out.print("������ �� �Է� : ");
		value = input.next();
		map.put(key, value);
		System.out.println(map);
		
		//���� 3.
		HashMap map = new HashMap();
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "20����");
		
		System.out.println("��� : " + map.containsKey("������"));
		map.replace("��ǳ��", "123456");
		System.out.println(map);
		
		//���� 4.
		HashMap map = new HashMap();
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "20����");
		
		System.out.println(map.remove("������"));
		System.out.println("��� : " + map.containsKey("������"));
		
		//���� 5.
		HashMap map = new HashMap();
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "������");
		
		System.out.println("��� : " + map.keySet());
	
		//���� 6.
		HashMap map = new HashMap();
		String key = null;
		String value = null;
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "20����");
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
		//���� 7.
		LinkedHashMap map = new LinkedHashMap();
		//HashMap map = new HashMap(); 
		String key = null;
		String value = null;
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "20����");
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
		//���� 8.
		HashMap map = new HashMap(); 
		String key = null;
		String value = null;
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "20����");
		
		System.out.println("��� : " + map.entrySet());
		
		*/
		//���� 9.
		Scanner input = new Scanner(System.in);
		int num;
		LinkedHashMap map = new LinkedHashMap();
		String menu = null;
		String price = null;
		String menu2;
		boolean flag = true;
		while(flag) {
			System.out.println("1. �޴� ���");
			System.out.println("2. �޴��� ���� ����");
			System.out.println("3. �� ��");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				System.out.print("������ �޴� �Է� : ");
				menu = input.next();
				System.out.print("������ ���� �Է� : ");
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
				System.out.println("1. ����   2. ����   3. ������");
				System.out.print(">>> ");
				int num2 = input.nextInt();
				switch(num2) {
				case 1:
					System.out.print("�����Ͻ� �޴��� �̸��� �Է��Ͻÿ� : ");
					menu = input.next();
					if(map.containsKey(menu)) {
						System.out.print("�����Ͻ� ������ �����Դϱ�? : ");
						price = input.next();
						map.replace(menu, price);
					}else {
						System.out.println("�޴��� �����ϴ�.");
					}
					break;
				case 2:
					System.out.println("�����Ͻ� �޴��� �̸��� �Է��Ͻÿ� : ");
					menu = input.next();
					if(map.containsKey(menu)) {
						map.remove(menu);
					}
					break;
				case 3:
					System.out.println("������");
					break;
				}
				break;
			case 3:
				System.out.println("�ý��� ����");
				flag = false;
			}
		}
		
	}
}
