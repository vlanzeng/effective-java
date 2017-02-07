package com.effective.java.concurrency;

public class Lock {
	
	protected Object obj = new Object();
	
	private boolean isLocked = false;
	
	public void lock() throws InterruptedException{
		synchronized (this) {
			while(isLocked){
				synchronized (this.obj) {
					this.obj.wait();
				}
			}
			isLocked= true;
		}
	}
	
	public void unlock(){
		synchronized (this) {
			this.isLocked =false;
			synchronized(this.obj){
				this.obj.notify();
			}
		}
	}
	
}
