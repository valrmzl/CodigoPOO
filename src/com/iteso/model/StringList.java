package com.iteso.model;

import java.util.ArrayList;

public class StringList extends ArrayList<String> {
	
	@Override
	public boolean add(String e) {
		if(e==null || e.length()==0) return false;
		return super.add(e);
	}
	
	

}
