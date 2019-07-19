package day2.examples;

import java.util.Scanner;

public class CircularQueue {
	int[] arr = new int[10];
	int head = 0;
	int tail = -1;
	int arrSize = 0;
	int number = 0;
	Scanner sc = new Scanner(System.in);
	
	public void enqueue() {
		if(arrSize == arr.length) {
			System.out.println("Overflow!");
		}else {
			tail = (tail+1) % arr.length;
			arr[tail] = ++number;
			System.out.println("대기번호 : " + arr[tail]);
			arrSize++;
		}
	}
	public void dequeue() {
		if(arrSize == 0) {
			System.out.println("Underflow!");
		}else {
			head = (head) % arr.length;
			System.out.println(arr[head] + "번 고객님 !");
			arr[head] = 0;
			head++;
			arrSize--;
		}
	}
	public void menu() {
		CircularQueue q = new CircularQueue();
		do {
			for(int i=0; i<q.arr.length; i++) {
				System.out.print(q.arr[i] + " ");
			}
			System.out.println("\n대기인원 : " + q.arrSize + "명");
			System.out.println("--------------");
			System.out.println("1. 번호표뽑기");
			System.out.println("2. 고객호출");
			System.out.println("3. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1: q.enqueue(); break;
			case 2: q.dequeue(); break;
			case 3: return;
			default: System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}while(true);
	}
	public static void main(String[] args) {
		new CircularQueue().menu();
		System.out.println("프로그램이 종료되었습니다.");
	}
}
