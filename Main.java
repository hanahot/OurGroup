/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java2_inherit;

/**
 *
 * @author Student.Admin
 */
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
        
        //ma inherit ni sya nga variable sa class nga hobby brad gamit ang extends nga keyword
        //pwede sad ka maka inherit diri ug mga functions or uban pa nga properties
        String hobby = "Travelling";
}


