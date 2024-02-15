package Recurssion_New;

public class BoardQueen {
	public static void queen(boolean arr[],int q,String ans,int nq) {
		if(q==nq) {
			System.out.println(ans);
			return;
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==false) {
				arr[i]=true;
			queen(arr,q,ans+"B"+i+"Q"+nq,nq+1);
			arr[i]=false;
			}
		}
	}
	public static void main(String args[]) {
		boolean arr[]=new boolean[4];
		queen(arr,2,"",0);
	}
}
