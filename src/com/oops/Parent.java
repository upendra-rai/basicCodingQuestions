package com.oops;

class Parent {
	public static void main(String[] args) {
		Child obj = new Child();
		
//		*********************  Output  *************************
//		Parent Class Param Constructor
//		Parent Class Default Constructor
//		Child Class Param Constructor Constructor
//		Child Class Default Constructor
		
	}

	Parent() {
		this("Constructor");
		System.out.println("Parent Class Default Constructor");
	}

	Parent(String s) {
		System.out.println("Parent Class Param " + s);
	}
}

class Child extends Parent {
	Child() {
		this("Constructor");
		System.out.println("Child Class Default Constructor");
	}

	Child(String s) {
		System.out.println("Child Class Param Constructor " + s);
	}

}