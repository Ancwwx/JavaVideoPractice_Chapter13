package com.hspedu.homework14;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		Car car = new Car("宝马", 400000);
		Car car2 = new Car("宾利", 5000000);
		arrayList.add(car);
		arrayList.add(car2);
		System.out.println(arrayList);
		arrayList.remove(car);
		System.out.println(arrayList);
		System.out.println(arrayList.contains(car));
		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty());
		// arrayList.clear();
		arrayList.addAll(arrayList);
		System.out.println(arrayList);
		arrayList.containsAll(arrayList);
		// arrayList.remove(arrayList);

		for (Object o : arrayList) {
			System.out.println(o);
		}
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}

	}

}

class Car {
	private String name;
	private double price;

	public Car(String name, double price) {
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
		return "Car [name=" + name + ", price=" + price + "]";
	}

}