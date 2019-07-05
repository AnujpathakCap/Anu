package String;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class FileDemo
{
	public static void main(String[] args) throws IOException
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		File f1=new File(s);	
		System.out.println("File Name:"+f1.getName());
		System.out.println("Abs Path:"+f1.getAbsolutePath());
        System.out.println("This file is:"+(f1.exists()?"Exists":"Does not exists"));
		
		System.out.println("Is Readable:"+f1.canRead());
		System.out.println("IS Writable:"+f1.canWrite());
	    System.out.println("File Size:"+f1.length()+"bytes");
	
	}
}
