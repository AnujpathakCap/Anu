package String;

import java.io.*;
import java.io.FileOutputStream;
import java.io.FileOutputStream; 

public class FileInput
{
	public static void main(String args[])throws IOException{
	    /* try{    
	             FileOutputStream fout=new FileOutputStream("C:\\Users\\apatha14\\Desktop\\abcd.txt");    
	             fout.write(65);  
	             fout.write(66);
	             fout.write(67);
	             fout.write(68);
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);} */   
	  
			    LineNumberReader reader = null;
			    try 
			    {
			    	FileInputStream  f= new FileInputStream("C:\\Users\\apatha14\\Desktop\\abcd.txt");
			        reader = new LineNumberReader(new FileReader("C:\\Users\\apatha14\\Desktop\\abcd.txt"));
			        while ((reader.readLine()) != null)
			        {
			        
			        System.out.print( reader.getLineNumber()+"-");
			    
			  		
			  	    int i=f.read();
			  		
			  		while( i!=-1)
			  			{
			  			
			  				i=f.read();
			  				System.out.print(((char)i));
			  				if(i==10)
			  					break;
			         }
			        }
			    } 
			    catch (Exception ex) 
			    {
			        System.out.println(ex);
			    }
			    finally 
			    { 
			        if(reader != null) 
			            reader.close();
			    } 	
	}
}
  		 
  	 
  		
  	
