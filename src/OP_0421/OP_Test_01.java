package OP_0421;
public class OP_Test_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2번
		String str = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		String [] name_s = str.replace("-", ":").split("\n");
		String [] s;
		String ch_str = "";
		System.out.println("====변경 전 str====");
		System.out.println(str);
		System.out.println("====변경 후 str====");
		for(int i=0;i<name_s.length;i++) {
			s = name_s[i].split(":");
			for(int j=0;j<2;j++) {
				if(j==1) {s[j] = ":1999년\n";}
				ch_str += s[j];
			}
		}
		System.out.println(ch_str);
	}

}
