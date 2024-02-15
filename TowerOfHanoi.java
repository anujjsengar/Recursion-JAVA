package Recurssion_New;

public class TowerOfHanoi {
	public static void tower(int n, char a,char c,char b) {
		if(n==1) {
			System.out.println("Move Disk "+n+" : "+a+" --- "+c);
			return ;
			}
		tower(n-1,a,b,c);
		System.out.println("Move Disk "+n+" : "+a+" --- "+c);
		tower(n-1,b,c,a);
}
	public static void main(String args[]) {
		tower(3,'A','B','C');
	}
}
