package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
	public static void main(String[] args) {
		Book[] books = new Book[4];
		books[0] = new Book("红楼梦", 100);
		books[1] = new Book("新水浒传", 90);
		books[2] = new Book("青年文摘20年", 5);
		books[3] = new Book("java从入门到放弃", 300);

		Arrays.sort(books, new Comparator() {
			public int compare(Object o1, Object o2) {
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;
				double priceVal = book1.getPrice() - book2.getPrice();
				if (priceVal > 0) {
					return -1;
				} else if (priceVal < 0) {
					return 1;
				} else {
					return 0;
				}
			}

		});
		
		System.out.println("价格从大到小 "+Arrays.toString(books));
		Arrays.sort(books, new Comparator() {
			public int compare(Object o1, Object o2) {
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;
				double priceVal = book2.getPrice() - book1.getPrice();
				if (priceVal > 0) {
					return -1;
				} else if (priceVal < 0) {
					return 1;
				} else {
					return 0;
				}
			}

		});
		
		System.out.println("价格从小到大 "+Arrays.toString(books));
		
		Arrays.sort(books, new Comparator() {
			public int compare(Object o1, Object o2) {
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;
				return book2.getName().length() - book1.getName().length();
		
			}

		});
		System.out.println("按照书名长度从大到小排序 "+Arrays.toString(books));

	}



}

class Book{
	private String name;
	private double price;

	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	

}
