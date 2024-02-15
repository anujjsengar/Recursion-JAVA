package Recurssion_2D_Array;

public class InvertTrainglePattern {
	public static void Pattern(int a,int b,int i,int j) {
		if(i==a-1) {
			return;
		}
		if(j==b-1 && i<a-1) {
			Pattern(a,b,i+1,0);
			System.out.println();
		}
		if(i<a-1) {
			System.out.print("*");
			Pattern(a,b,i,j+1);
		}
		return ;
	}
	public static void main(String args[]) {
		Pattern(3,3,0,0);
	}

}
