package com.iteso.model;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<E> extends ArrayList<E> {
	
	private int index=0;
	private int secuencia=0;
	
	public E next() {
		if(index>= this.size()) {
			index=0;
		}
		return this.get(index++);
	}

	public void initSequence() {
		this.secuencia=1;
		int n = this.size();
		Random r = new Random();
	
		for(int i = 0; i<n;i++) {
			int randomValue = i + r.nextInt(n - i);
			E element = this.get(randomValue);
			this.set(randomValue, this.get(i));
			this.set(i, element);
			}
	}
	
	@Override
	public String toString() {
		if(secuencia==1) {
			this.initSequence();
			this.secuencia=0;
		}
		return super.toString();
	}
	
	@Override
	public boolean add(E obj) {
		super.add(obj);
		this.initSequence();
		return true;
	}
	
	@Override
	public E remove(int index) {
		secuencia=1;
		return super.remove(index);
	}
}
