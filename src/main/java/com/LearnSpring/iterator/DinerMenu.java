package com.LearnSpring.iterator;
import java.util.Iterator;

/**
 * 餐厅菜单类
 * @author Administrator
 *
 */
public class DinerMenu implements Menu{
	static final int MAX_ITEM = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEM];
		
		addItem("番茄炒蛋","香香的蛋与番茄",true,2.99);
		addItem("青椒肉丝","辣辣的青椒甜甜的肉丝",false,1.5);
	}
	
	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEM){
			System.out.println("Sorry,menu is full!");
		} else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}

	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
