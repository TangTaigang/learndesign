package com.LearnSpring.iterator;

import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class PancakeHouseMenu implements Menu{
	ArrayList menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList();
		addItem("煎饼早餐","煎饼和鸡蛋",true,2.99);
		addItem("豆浆早餐","豆浆和油条",true,2.99);
	}

	@SuppressWarnings("unchecked")
	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItem(){
		return menuItems;
	}
	
	public Iterator createIterator(){
//		return new PancakehouseIterator(menuItems);
		return menuItems.iterator();
	}
}
