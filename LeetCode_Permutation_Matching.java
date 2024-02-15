package Recurssion_2D_Array;

public class LeetCode_Permutation_Matching {
	public static void main(String args[]) {
		String str="ab";
		String str_="anbab";
		System.out.println(check(str,str_,"",str.length()));
	
	}
	    private static boolean check(String str, String s2, String ans, int size) {
	        if (ans.length() == size) {
	            if (s2.contains(ans)) {
	                return true;
	            }
	            return false;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            if (check(str.substring(0, i) + str.substring(i + 1), s2, ans + str.charAt(i), size)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
