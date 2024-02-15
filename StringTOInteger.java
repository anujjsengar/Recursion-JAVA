package Recurssion_2D_Array;
import java.util.*;
public class StringTOInteger {
	public static void main(String args[]) {
		String str="012034";
		convert(str,0,0);
		
	}
	public static void convert(String str,int ans,int i) {
		if(str.length()==1) {
			ans=(ans*10)+(int)str.charAt(0)-'0';
			System.out.println(ans);
			return ;
		}
		if(str.charAt(0)=='0' && i==0) {
			convert(str.substring(1),ans,i+1);
		}
		else {
			convert(str.substring(1),(ans*10)+(int)str.charAt(0)-'0',i+1);
		}
	}
}
