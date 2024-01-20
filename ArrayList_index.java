package Recurssion;
import java.util.*;
public class Array_List_index {
	public static ArrayList<Integer> index(int[] arr,int target,int i,ArrayList<Integer> list){
		if(i==arr.length) {
			return list;
		}
		if(arr[i]==target) {
			list.add(i);
		}
		return index(arr,target,i+1,list);
	}
	public static void main(String args[]){
		int[] arr= {1,2,3,4,5,6,7,5,2,8,9,5};
		ArrayList<Integer> list=new ArrayList();
		list=index(arr,5,0,list);
		System.out.println(list);
	}
}
