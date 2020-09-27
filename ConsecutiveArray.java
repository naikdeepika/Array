package matrix;
import java.util.*;

public class ConsecutiveArray{
		public static int Consecutivezero(int[][] a) {
		int count=0;
		int maxcount=0;
		 for (int i = 0; i<a.length; i++) {
			 for (int j = 0; j<a[i].length-1; j++) {
	        	 if(a[i][j]==0 && [i][j+1]==0)
	        	 {
	        		 count++;
	        	 }	        	 
			 }
		 }
		 return count;
		 }
		 
	public static void main(String args[])
	{
	int[][] a= {{1,1,0,0},
			 {0,1,0,1},
			 {0,0,1,1}};
	
	for (int i = 0; i<=a.length-1; i++) {
		 for (int j = 0; j<=a[i].length-1; j++) {
			 System.out.print(a[i][j]);			 
		 }
		 System.out.println( );	 
	}
	System.out.println(Consecutivezero(a) );	 
	}
}
	
