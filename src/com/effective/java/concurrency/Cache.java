package com.effective.java.concurrency;

import java.util.Set;
import java.util.HashSet;


public class Cache {
	
	private Set<Object> buffer =  new HashSet<Object>();
	
	private  static final int MAX_SIZE = 15;
	
	private  final Lock  lock = new Lock();
	
	
	public  void put(Object o) throws InterruptedException {
	    while ( buffer.size() == MAX_SIZE) {
	    	lock.lock();
	    }
	    buffer.add(o);
	    lock.unlock();
	}
	 
	public  Object get() throws InterruptedException {
	    while ( buffer.size() == 0) {
	    	lock.lock();
	    }
	    Object o = buffer.remove(0);
	    lock.unlock();
	    return o;
	}
	
	public static void main (){
	  
		
		
	}
	
}
