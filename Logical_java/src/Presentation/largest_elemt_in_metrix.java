package Presentation;

import java.util.Scanner;

public class largest_elemt_in_metrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner (System.in);		    
	     int row =s.nextInt();
	    int col =s.nextInt();
	    int arr[][]=new int[row][col];
	   int i,j,largest=-1000;
	   for(i=0;i<row;i++)
	       {
	        for(j=0;j<col;j++)
	           {
	               arr[i][j]=s.nextInt();
	            }
	        }
	        for(i=0;i<row;i++)
	       {
	        for(j=0;j<col;j++)
	           {
	              if( arr[i][j]>largest)
	              {
	                  largest=arr[i][j];
	              }
	            }
	        }
	        System.out.printf("The maximum element is %d",largest);
	}

}
