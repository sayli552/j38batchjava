package com.linkedlist;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.InputStream;
import java.util.LinkedList;
public class LinedLisTprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list =  new LinkedList<>();
		
		list.add(23);
		list.add(32);
		list.add(65);
		list.add(41);
		list.add(45);
		
		System.out.println("even number");
		for(int i =0; i<5;i++)
		{
			if(list.get(i)%2==0)
			{
				System.out.println(list.get(i));
			}
		}
		
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
			Integer num = listIterator.next();
			
			if(num%2==0)
				System.out.println(num);
		}
		System.out.println("reverse list elements");
		
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		
		List<Integer> list1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from list");
		int num,sum=0;
		for(int i =0; i<5;i++)
		{
			num=sc.nextInt();
			list1.add(num);
		}
		System.out.println("after adding num");
		System.out.println(list1);
		System.out.println("sum of elements");
		for(int i =0; i<5;i++)
		{
			sum = sum+list1.get(i);
		}
		System.out.println(sum);
	}


}
