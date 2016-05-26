package com.LearnSpring.iterator;
import java.util.Iterator;
/**
 * 女招待对象
 * @author Administrator
 * 1、DinnerMenu和PancakeHouseMenu的类，都实现了Menu接口，女招待可以利用接口（而不是具体类）引用每一个菜单对象。
 * 	    这样，通过“针对接口编程，而不是针对实现编程”，就可以减少女招待和具体类之间的依赖。
 * 2、这个新的菜单接口有一个方法，createIterator()，次方法是有DinnerMenu和PancakeHouseMenu菜单实现的。每个菜单类都必须负责提供社当的具体迭代器。
 * 3、将女招待从菜单的实现中解耦了，所以现在我们可以利用迭代器来遍历菜单项，而无需知道菜单项列表是如何被实现的。
 */
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu,Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("MENU\n-------\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
			System.out.println();
		}
	}
}
