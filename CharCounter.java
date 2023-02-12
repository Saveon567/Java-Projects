package io.github.vikeshpandey.currency;

import java.io.*;
import java.util.Arrays;

public class CharCounter {

	public static void main(String[] args) throws IOException {
		  String input="SampleInput.txt";
		   BufferedReader br= new BufferedReader(new FileReader(input));
		   String line="";
		   int count=0;
		   String str[]=new String[200];
		   int[] a=new int[24];
		   try {
			   br.readLine();
		       while((line = br.readLine())!=null)
		       { 
		           String[] f=line.split(",");
		            a[count]=Integer.parseInt(f[2]);
		            str[count]=f[1];            
		            count++;
		       }
		   } catch (IOException e) {
			   e.printStackTrace();
		   }
		   Arrays.sort(a);
		    for(int i:a)
		    {
		        System.out.println(i);
		    }
		    System.out.println("min="+a[0]);
	        System.out.println("Max="+a[count-1]);
	        
	        String min1=str[0];
	        for(int i=0;i<count;i++)
	        {
	            if(str[i].compareTo(min1)<0)
	            	 min1=str[i];
	        }
	        System.out.println(min1);
	        /*String Sort end*/
	        /*Finding the Median*/
	        
	        int median;
	        if(a.length%2==0)
	        	median = a[a.length/2]+a[(a.length/2)+1];
	        else
	        	 median=a[a.length/2];
	        System.out.println("Median"+median);
	        /*Median*/
	        System.out.println("Line"+count);
	      

	}

}
