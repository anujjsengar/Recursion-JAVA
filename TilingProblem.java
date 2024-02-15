package Recurssion_New;

public class TilingProblem {
	public static int TileCount(int x,int y,int a,int b,int n,int i,int j,int count) {
		if((i+j)*a*b==x*y && i<=n && j<=n) {
			count++;
		}
		if((i+j)*a*b>x*y && i<=n && j<=n) {
			return count;
		}
		if(i<n) {
		return TileCount(x,y,a,b,n,i+1,j,count);
		}
		if(j<n)
		return TileCount(x,y,a,b,n,i,j+1,count);
		return count;
	}
	public static void main(String args[]) {
		System.out.println(TileCount(2,3,2,1,3,1,1,0));
	}

}
