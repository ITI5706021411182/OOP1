import java.util.Scanner;

public class Seven_Dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dwarf1,dwarf2,dwarf3,dwarf4,dwarf5,dwarf6,dwarf7,dwarf8,dwarf9=0;
		Scanner scandwarf = new  Scanner(System.in);
		dwarf1=scandwarf.nextInt();
		dwarf2=scandwarf.nextInt();
		dwarf3=scandwarf.nextInt();
		dwarf4=scandwarf.nextInt();
		dwarf5=scandwarf.nextInt();
		dwarf6=scandwarf.nextInt();
		dwarf7=scandwarf.nextInt();
		dwarf8=scandwarf.nextInt();
		dwarf9=scandwarf.nextInt();
		
			//case1
		if(dwarf3+dwarf4+dwarf5+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case2
		}else if (dwarf2+dwarf4+dwarf5+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case3
		}else if (dwarf2+dwarf3+dwarf5+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case4
		}else if (dwarf2+dwarf3+dwarf4+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case5
		}else if (dwarf2+dwarf3+dwarf4+dwarf5+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case6
		}else if (dwarf2+dwarf3+dwarf4+dwarf5+dwarf6+dwarf8+dwarf9==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			//case7
		}else if (dwarf2+dwarf3+dwarf4+dwarf5+dwarf6+dwarf7+dwarf9==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			//case8	
		}else if (dwarf2+dwarf3+dwarf4+dwarf5+dwarf6+dwarf7+dwarf8==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			//case9		
		}else if (dwarf1+dwarf4+dwarf5+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case10
		}else if (dwarf1+dwarf3+dwarf5+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case11
		}else if (dwarf1+dwarf3+dwarf4+dwarf5+dwarf6+dwarf7+dwarf8==100){
			System.out.print(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			//case12
		}else if (dwarf1+dwarf3+dwarf4+dwarf5+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case13
		}else if (dwarf1+dwarf3+dwarf4+dwarf5+dwarf6+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			//case14
		}else if (dwarf1+dwarf3+dwarf4+dwarf5+dwarf6+dwarf7+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			//case15
		}else if (dwarf1+dwarf2+dwarf5+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case16
		}else if (dwarf1+dwarf2+dwarf4+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case17
		}else if (dwarf1+dwarf2+dwarf4+dwarf5+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case18
		}else if (dwarf1+dwarf2+dwarf4+dwarf5+dwarf6+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			//case19
		}else if (dwarf1+dwarf2+dwarf4+dwarf5+dwarf6+dwarf7+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			//case20
		}else if (dwarf1+dwarf2+dwarf4+dwarf5+dwarf6+dwarf7+dwarf8==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			//case21
		}else if (dwarf1+dwarf2+dwarf5+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case22
		}else if (dwarf1+dwarf2+dwarf3+dwarf6+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case23
		}else if (dwarf1+dwarf2+dwarf3+dwarf5+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case24
		}else if (dwarf1+dwarf2+dwarf3+dwarf5+dwarf6+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			//case25
		}else if (dwarf1+dwarf2+dwarf3+dwarf5+dwarf6+dwarf7+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			//case26
		}else if (dwarf1+dwarf2+dwarf3+dwarf5+dwarf6+dwarf7+dwarf8==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			//case27
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf7+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case28
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf6+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			//case29
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf6+dwarf7+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			//case30
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf6+dwarf7+dwarf8==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			//case31
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf5+dwarf8+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf8+"\n"+dwarf9);
			//case32
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf5+dwarf7+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf9);
			//case33
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf5+dwarf7+dwarf8==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8);
			//case34
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf5+dwarf6+dwarf9==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf9);
			//case35
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf5+dwarf6+dwarf8==100){
			System.out.print(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8);
			//case36
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf5+dwarf6+dwarf7==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			//case37
		}else if (dwarf1+dwarf2+dwarf3+dwarf4+dwarf5+dwarf6+dwarf7==100){
			System.out.print(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
		}

	}//class

}//main
