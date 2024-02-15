package Recurssion_2D_Array;
import java.util.*;
public class SubSet_Array {
	public static void main(String args[]) {
		int arr[] = {1,2,3};
		boolean[] bool=new boolean[3];
 		ArrayList<Integer> list=new ArrayList<>();
 		
		subset(arr,bool,list,0);
	}
	private static void subset(int[] arr,boolean [] bool,ArrayList<Integer> list,int lp){
		System.out.println(list);
		if(list.size()==3) {
			return ;
		}
		for(int i=lp;i<arr.length;i++) {
			if(bool[i]==false) {
				bool[i]=true;
			list.add(arr[i]);
			subset(arr,bool,list,i+1);
			list.remove(list.size()-1);
			bool[i]=false;
		}
		}
	}
		}
