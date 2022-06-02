package com.capgemini.demo.col;

import java.util.LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		LinkedList l = new LinkedList ();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(17);
		l.add(20);
		System.out.println(l);

	}

    System.out.println("------------");
    System.out.println(l.lastIndexOf(10));
   
    System.out.println("------------");
    System.out.println(l.contains(30));
    
    System.out.println("---------");
    System.out.println(l);
    
    l.remove(1);
    System.out.println(l);
    
    System.out.println(l.isEmpty());
    
    l.clear();
    System.out.println(l.isEmpty());
		
	}

}

    System.out.println(l.lastIndexOf(10));
   
    System.out.println("------------");
    System.out.println(l.contains(30));
    
    System.out.println("---------");
    System.out.println(l);
    
    l.remove(1);
    System.out.println(l);
    
    System.out.println(l.isEmpty());
    
    l.clear();
    System.out.println(l.isEmpty());
		
	}

}
