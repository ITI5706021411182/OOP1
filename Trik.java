import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L=1,C=0,R=0,TEMP=0;
		String textinput="",ans="";
		Scanner scantextinput=new Scanner(System.in);
		textinput=scantextinput.nextLine();
		
		for(int i=0;i<textinput.length();i++){
			if(textinput.charAt(i)=='A'){
				TEMP=L;L=C;C=TEMP;
			}else if(textinput.charAt(i)=='B'){
				TEMP=C;C=R;R=TEMP;
			}else{
				TEMP=L;L=R;R=TEMP;
			}
		}//for
		if(L==1){
			ans="1";
		}else if(C==1){
			ans="2";
		}else if(R==1){
			ans="3";
		}
		
		System.out.println(ans);
	}//main

}//class
