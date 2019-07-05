package day3;
import java.util.*;

public class fibbo {

		void fie(int num)
		{
			
			int num1=0;
			int num2=1;
			int temp=0;
			System.out.println(num1);
			System.out.println(num1);
			for(int i=0;i<num-1;i++)
			{
				
				temp=num1+num2;
				System.out.println(temp);
				num1=num2;
				num2=temp;
				
				
			}
			
		}
		int fib(int num)
		{
			 
		
		    if(num==0)
		    {
		        return(0);
		    }
		    else if(num==1)
		    {
		    	return(1);
		    }
		    else
		    {
			   
		        return fib(num - 1) + fib(num - 2);
		       
		    }
	
	}

	

}
