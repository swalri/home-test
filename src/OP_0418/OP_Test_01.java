package OP_0418;
import java.util.Scanner;
public class OP_Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4번
		Scanner scan = new Scanner(System.in);
		final int skill=20,nomal=10;
		int count = 10, mp = 100;
		int button_S;
		double hp = Math.floor( Math.random() * 150+50 );
		boolean tf = true;
		
		System.out.println("게임을 시작합니다");
		System.out.println("적의 hp 는 "+hp+"입니다");
		
		while(tf) {
			System.out.println();
			System.out.println("당신의 남은 체력은 "+count+"남았습니다.");
			System.out.println("당신의 남은 mp는 "+mp+"남았습니다.");
			System.out.println();
			System.out.println("공격수단을 선택해 주세요");
			System.out.println("1. 일반공격(10데미지)");
			System.out.println("2. 스킬사용(20데미지)");
			button_S = scan.nextInt();
			
			if(button_S == 1) {
				System.out.println("일반공격");
				hp -= nomal;
			}else if(button_S == 2) {
				System.out.println("스킬사용");
				if(mp < skill) {
					System.out.println("mp가 부족하여 스킬사용이 불가능 합니다");
				}else {
					mp -= skill;
					hp -= skill;
				}
			}else {
				System.out.println("오류 다시 입력해주세요");
			}
			
			System.out.println("적의 남은 hp : "+hp);
			
			if(hp <=0) {
				System.out.println("적이 쓰러졌습니다");
				System.out.println("당신이 승리하였습니다");
				tf=false;
			}else {
				count--;
			}
			
			if(count==0) {
				tf=false;
				System.out.println("패배하였습니다");
			}
		}//while
		
		
	}

}
