import java.io.*;
import java.util.*;
public class Primecountinrange

{

	public static void main(String[] args)
 
	{
	    
		Scanner input=new Scanner(System.in);
	
        int a=input.nextInt();
	
        int b=input.nextInt();
	
        int flag=0;
	
        for(int i=a;i<=b;i++)

	        {

            		int temp=i;

			int count=0;
		        for(int j=1;j<=b;j++)
		        {
	
	                if(temp%j==0)
		
                {
			                count=count+1;	
		
                }
		        }
	 	       if(count==2)
	        	{
	
             	  	flag=flag+1;
	        	}
        	}

        	System.out.println(flag);	

	}

}
