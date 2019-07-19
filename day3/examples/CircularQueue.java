package day3.examples;

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
			System.out.println("占쏙옙占쏙옙호 : " + arr[tail]);
			arrSize++;
		}
	}
	public void dequeue() {
		if(arrSize == 0) {
			System.out.println("Underflow!");
		}else {
			head = (head) % arr.length;
			System.out.println(arr[head] + "占쏙옙 占쏙옙占쏙옙 !");
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
			System.out.println("System Start");
			System.out.println("\n占쏙옙占쏙옙恝占� : " + q.arrSize + "占쏙옙");
			System.out.println("--------------");
			System.out.println("1. 占쏙옙호표占싱깍옙");
			System.out.println("2. 占쏙옙호占쏙옙");
			System.out.println("3. 占쏙옙占쏙옙");
			System.out.print("占쌨댐옙 占쏙옙호 占쌉뤄옙 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1: q.enqueue(); break;
			case 2: q.dequeue(); break;
			case 3: return;
			default: System.out.println("占쌩몌옙占쏙옙 占쏙옙호占쏙옙 占쌉뤄옙占싹울옙占쏙옙占싹댐옙.");
			}
		}while(true);
	}
	public static void main(String[] args) {
		new CircularQueue().menu();

		System.out.println("占쏙옙占싸그뤄옙占쏙옙 占쏙옙占쏙옙퓸占쏙옙占쏙옙求占�.");
	}
	
}
