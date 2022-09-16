
package com.mycompany.java2_inherit;

public class Main {

	public static void main(String[] args) {
		Friends frnd = new Friends();
		System.out.println(frnd.getName("Hannah"));
		frnd.give();
		
		Hobby hob = new Hobby();
		hob.travel();
	}
        
        
}

class Friends {
	public String getName(String name) {
		return "Hello " +name;
	}
	
	public void give() {
		System.out.println("You are beautiful!");
	}
        
        String hobby = "Travelling";
}


