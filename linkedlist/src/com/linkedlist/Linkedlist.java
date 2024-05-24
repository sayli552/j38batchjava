package com.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list =new LinkedList<String>();
		
		list.add("pune");
		list.add("delhi");
		list.add("mumbai");
		list.add("karnataka");
		
		LinkedList<String> list1 =new LinkedList<String>();
		list1.addAll(list);
		
		System.out.println(list1);
		
		list1.addFirst("nagpur");
		list1.addLast("shirdi");
		
		for(String s:list1)
			System.out.println(s+"-"+s.length());
		
		System.out.println(list1.size());
		
		//list1.clear();
		//System.out.println(list1);
		
		//clone method of obj we need typecasting 
		list1=(LinkedList)list.clone();
		System.out.println(list1);
		
		//
		boolean b = list1.contains("pune");
		System.out.println("pune is perfect city to live!:-"+b);
		
		System.out.println(list1.element());
		System.out.println(list1);
		
		System.out.println(list1.get(1));
		
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		
		
		list1.add("pune");
		
		int i=list1.indexOf("karnataka");
		System.out.println(i);
		
		System.out.println(list1.indexOf("pune"));
		System.out.println(list1);
		
		System.out.println(list1.lastIndexOf("pune"));
		
		boolean bc = list1.contains("pune");
		System.out.println("pune is safe city to live!:-"+bc);
		
		
		list1.offer("tamil nadu");
		System.out.println(list1);
		
		list1.offerFirst("tamil nadu");
		System.out.println(list1);
		list1.offerLast("tirupati");
		System.out.println(list1);
		
		
		
		System.out.println(list1.peek());
		System.out.println(list1);
		
		String name=list1.poll();
		System.out.println(name);
		System.out.println(list1);
		
		list1.push("nashik");
		System.out.println(list1);
		System.out.println(list1);
		
		
		list1.pop();
		System.out.println(list1.pop());
		System.out.println(list1);
		
		System.out.println(list1.remove());
		System.out.println(list1);
		
		list1.set(1, "kerela");
		System.out.println(list1);
		
		Object [] city=list1.toArray();
		for(int i1=0;i1<city.length;i1++)
		{
			System.out.println(city[i1]);
			
		}
		
		String s[] =new String[list1.size()];
		
		list1.toArray(s);
		System.out.println("-------");
		for(String a:s)
			System.out.print(a);
		
		
		Arrays.asList(new int[] {2,3,4,}); /// An array in Java without any name is known as an anonymous array. It is an array just for creating and using instantly.
		
		
		Iterator<String> itr=list1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//collection framework in java is a centralized and 
	}

}

