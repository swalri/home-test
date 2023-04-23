package OP_0421;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class OP_Test_02 {
	//ArrayList 로또
	private static ArrayList<Integer> arr_lotto(){
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for(int i=0;i<6;i++) {
			int random = (int) (Math.random()*6+1);
			if(lotto.contains(random)) {
				i--;
			}else {
				lotto.add(random);
			}//if else
		}//for
		return lotto;
	}
	//HashSet 로또
	private static HashSet<Integer> set_lotto(){
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(lotto.size()<6) {
			int random = (int) (Math.random()*45+1);
			lotto.add(random);
		}//while
		return lotto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		//3번
		while(true) {
			System.out.println("===================");
			System.out.println("1. ArrayList");
			System.out.println("2. HashSet");
			System.out.println("3. exit");
			System.out.print(">>> ");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("이번 당첨번호는 ");
				System.out.println(arr_lotto());
				break;
			case 2:
				System.out.println("이번 당첨번호는 ");
				System.out.println(set_lotto());
				break;
			case 3:
				System.out.println("종료합니다");
				System.exit(0);
				break;
			default:
				System.out.println("오류");
				break;
			}//switch
		}//while
	}
}