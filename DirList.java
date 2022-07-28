package io.github.vikeshpandey.directlist;

import java.io.File;
import java.util.Scanner;


public class DirList 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print(
			"Welcome to the Directory Lister");
		do 
		{
			System.out.print("\nEnter a path: ");
			String path = sc.nextLine();
			File dir = new File(path); →17 
			if (!dir.exists() || !dir.isDirectory())
				System.out.println(
						"\nThat directory doesn't exist.");
			else
			{
				System.out.println(
						"\nListing directory tree of:");
						System.out.println(dir.getPath()); 
						listDirectories(dir, " ");	
			}
		} while(askAgain());
	}
	
	private static void listDirectories
	( File dir, String indent)
	{
		if (f.isDirectory()) 
		{
			System.out.println(
					indent + f.getName()); 
					listDirectories(f, indent + " ");
		}
	}
}
private static boolean askAgain()
{
	System.out.print("Another? (Y or N) ");
	String reply = sc.nextLine();
	if (reply.equalsIgnoreCase("Y"))
		 return true;
    return false;
	}
}
