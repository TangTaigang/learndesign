package com.LearnSpring.iterator;

import java.util.ArrayList;

/**
 * 煎饼屋对象
 * @author Administrator
 *
 */
@SuppressWarnings("rawtypes")
public class PancakehouseIterator implements Iterator {
	ArrayList menuItems;
	int position = 0;
	
	public PancakehouseIterator(ArrayList menuItems){
		this.menuItems = menuItems;
	}
	
	public boolean hasNext() {
		if(menuItems.size() > position){
			return true;
		} else{
			return false;
		}
	}

	public Object next() {
		MenuItem menuItem = (MenuItem) menuItems.get(position);
		position += 1;
		return menuItem;
	}

}
