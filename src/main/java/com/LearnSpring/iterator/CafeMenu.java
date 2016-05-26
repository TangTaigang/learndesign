package com.LearnSpring.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * 咖啡厅菜单
 * @author Administrator
 *
 */
public class CafeMenu implements Menu {
	@SuppressWarnings("rawtypes")
	Hashtable menuItems = new Hashtable();
	
	public CafeMenu() {
		addItem("拿铁","苦苦的",false,4.28);
	}

	@SuppressWarnings("unchecked")
	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
	
}
