package day07;

import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		
		/*
		//���� 1.
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println("���� : " + arr.size());
		
		
		//���� 2.
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num;
		String addNum, printNum;
		System.out.print("���� ������ ���� �Է� : ");
		num = input.nextInt();
		for(int i = 0; i<num; i++){
			System.out.print("�߰��� �� �Է� : ");
			addNum = input.next();
			arr.add(addNum);
		}
		System.out.println("--- ����� �� ���!! ---");
		for(int i = 0; i<arr.size(); i++) {
			printNum = (String)arr.get(i);
			System.out.println(printNum);
		}
		
		//���� 3.
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println("���� : " + arr.size());
		System.out.println(arr.contains("123"));
		
		//���� 4.
		ArrayList arrList = new ArrayList();
		arrList.add("123");
		arrList.add("456");
		System.out.println("����� �� [0] : " + arrList.get(0));
		System.out.println("����� �� [1] : " + arrList.get(1));
		System.out.println("��� �� : " + arrList.remove("123"));
		System.out.println("����� �� [0] : " + arrList.get(0));
		
		ArrayList arrClear = new ArrayList();
		arrClear.add("123");	arrClear.add("456");
		System.out.println(arrClear.get(0));
		System.out.println(arrClear.get(1));
		arrClear.clear();
		System.out.println();
		System.out.println("���� ��");
		System.out.println(arrClear.get(0));
		System.out.println(arrClear.get(1));
		
		//���� 5.
		Scanner input = new Scanner(System.in);
		ArrayList foodList = new ArrayList();
		int num;
		foodList.add("����");	foodList.add("�ұ�");
		foodList.add("���"); foodList.add("���");
		System.out.println(foodList);
		System.out.print("������ ��ġ �Է� : ");
		num = input.nextInt();
		System.out.print("������ �� �Է� : ");
		String value = input.next();
		foodList.set(num, value);
		for(int i = 0; i<foodList.size(); i++) {
			System.out.println(i + "��° : " + foodList.get(i));
		}
		*/
		//���� 6.
		Scanner input = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("����");	food.add("�ұ�");
		food.add("���");  food.add("���");
		System.out.println(food);
		System.out.print("ã�� �� �Է� : ");
		String value = input.next();
		System.out.println(value + " ��ġ : " + food.indexOf(value));
		
		/*
		//���� 7.
		//����ó ���� ���α׷� �����(ArrayList 2���� ����Ͽ� ����ÿ�.)
		//�ϳ��� ����Ʈ : �̸�����   //�ϳ��� ����Ʈ : ����ó����
		Scanner input = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList contact = new ArrayList();
		String addName;
		String addContact;
		String removeName;
		String viewName;
		boolean flag = true;
		while(flag) {
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			System.out.print(">>> ");
			int num = input.nextInt();
			switch(num) {
			case 1 : {
				System.out.print("�̸� : ");
				addName = input.next();
				name.add(addName);
				System.out.print("��ȭ��ȣ : ");
				addContact = input.next();
				contact.add(addContact);
				break;
			}
			case 2:
			{
				System.out.print("�˻��� ����ó�� �̸��� �Է��Ͻÿ� : ");
				viewName = input.next();
				if(name.contains(viewName)) {
					int num1 = name.indexOf(viewName);
					System.out.println("�̸� : " + name.get(num1));
					System.out.println("����ó : " + contact.get(num1));
				}else {
					System.out.println("�˻��� ����ó�� ��Ͽ� �����ϴ�.");
				}
				break;
			}
			case 3:
			{
				System.out.print("������ ����ó�� �̸��� �Է��Ͻÿ� : ");
				removeName = input.next();
				if(name.contains(removeName)){
					int num2 = name.indexOf(removeName);
					name.remove(removeName);
					contact.remove(num2);
				}else {
					System.out.println("������ ����ó�� �������� �ʽ��ϴ�.");
				}
				break;
			}
			case 4 : {
				for(int i = 0; i<name.size(); i++) {
					System.out.print(i+1+"��.\t�̸� : " + name.get(i) + "\t");
					System.out.println("����ó : " + contact.get(i));
				}
				break;
			}
			case 5:{
				System.out.println("�ý����� �����մϴ�.");
				flag = false;
				}
			}		
		}
		*/
	}
}
