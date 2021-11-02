package com.AlgorithmsProgram;
import java.lang.reflect.Array;
import java.util.*;

public class BinarySearchWord {
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   int i;  

	   System.out.println("Enter number of words you want to enter: ");
	   int n=sc.nextInt();

	   String[] words= new String[n];

	   System.out.println("Enter the words");
	   for ( i = 0; i < words.length; i++)
	   {
	       System.out.print("Word " + (i + 1) + ": ");
	       words[i] = sc.next();
	   }

	   System.out.println("enter the word you want to search for");
	   String word = sc.next();

	   Arrays.sort(words); 
	   for(int j = 0; j < words.length; j++)
	   { 
		   System.out.println(j+": "+words[j]); 
	   }
	 
		   int index= Arrays.binarySearch(words,word);
		   System.out.println("Word " +word+ "="+ index );
	 }
}

	