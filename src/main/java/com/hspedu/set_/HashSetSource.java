package com.hspedu.set_;

import java.util.HashSet;

public class HashSetSource {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("java");
		hashSet.add("php");
		hashSet.add("java");

		System.out.println("tset=" + hashSet);

	}

}
