package OP_0417;

import java.util.Scanner;

public class OP_Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//6조 연습문제_반복문
		//1번
//		int ch, menu;
//		boolean tf = true;
//		
//		while(tf) {
//			System.out.println("어서오세요");
//			System.out.println("우유자판기 입니다. 주문하시겠습니까? (YES : 1,  NO : 2)");
//			ch = scan.nextInt();
//			if(ch == 1) {
//				System.out.println("1.바나나우유, 2.딸기우유, 3.초코우유, 4. 주문안함");
//				System.out.println("번호를 선택해주세요 : ");
//				menu = scan.nextInt();
//				switch(menu) {
//				case 1:
//					System.out.println("바나나우유를 선택하였습니다.");
//					break;
//				case 2:
//					System.out.println("딸기우유를 선택하였습니다.");
//					break;
//				case 3:
//					System.out.println("초코우유를 선택하였습니다.");
//					break;
//				case 4:
//					System.out.println("원하는 메뉴가 없습니다.");
//					break;
//				default: 
//					break;
//				}
//			}else {
//				tf = false;
//				System.out.println("안녕히가세요");
//			}
//		}
		//2번
//		int ch_Num, i= 0;
//		int rand = (int) Math.floor(Math.random() * 50);
//		System.out.println("수를 맞추세요");
//		for(i=0;i<5;i++) {
//			ch_Num = scan.nextInt();
//			if(rand == ch_Num) {
//				System.out.println("정답입니다 축하합니다");
//				i=0;
//				break;
//			}else if(rand > ch_Num) {
//				System.out.println("보다 큽니다");
//			}else if(rand < ch_Num) {
//				System.out.println("보다 작습니다");
//			}
//		}
//		if(i != 0) {
//			System.out.println("패배하였습니다.");
//		}
		//3번
//		String po = "* ", sp = "  ";
//		int gi=4, gi2=4;
//		for(int i=0;i<5;i++) {
//			for(int j=0; j<9; j++) {
//				if(j>=gi && j<=gi2) System.out.print(po);
//				else System.out.print(sp);
//			}
//			System.out.println();
//			gi--;
//			gi2++;
//		}
	}

}
