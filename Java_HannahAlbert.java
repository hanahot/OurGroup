

package com.mycompany.java_hannaalbert;


public class Java_HannahAlbert {

    public static void main(String[] args) {
        System.out.println(">>>>>>Friends of Mine<<<<<<");
        System.out.println();
        
        Friends f = new Friends();
        
        f.setName("Nino Cartesiano");
        f.setAge(20);
        f.setHobby("playing online games");
        f.setLike("coding");
        f.setYear("third");
        
        
        System.out.println("*");
        System.out.println("This is "+f.getName()+", "+f.getAge()+"yrs old. His hobby is "+f.getHobby()+" and he likes to go to " +f.getLike()+" and also he is a "+f.getYear()+"year college.");
        System.out.println();
        
        Friends f1 = new Friends();
        
        f1.setName("Hadrian Evarola");
        f1.setAge(19);
        f1.setHobby("listening music");
        f1.setLike("playing Mobile Legends");
        f1.setYear("PN Scholar");
        
        System.out.println("**");
        System.out.println("This is "+f1.getName()+", "+f1.getAge()+"yrs old. His hobby is "+f1.getHobby()+" and he likes " +f1.getLike()+" and also he is a "+f1.getYear()+".");
        System.out.println();
        
        Friends f2 = new Friends();
        
        f2.setName("James Aldrick Odiong");
        f2.setAge(21);
        f2.setHobby("playing billiard");
        f2.setLike("travel");
        f2.setYear("third");
        
        System.out.println("***");
        System.out.println("This is "+f2.getName()+", "+f2.getAge()+"yrs old. His hobby is "+f2.getHobby()+" and he likes to " +f2.getLike()+" other places and also he is a "+f2.getYear()+" year college.");
        System.out.println();
        
        Friends f3 = new Friends();
        
        f3.setName("Estella Ocampo");
        f3.setAge(20);
        f3.setHobby("drawing");
        f3.setLike(" designing");
        f3.setYear("first");
        
        System.out.println("****");
        System.out.println("This is "+f3.getName()+", "+f3.getAge()+"yrs old. Her hobby is"+f3.getHobby()+" and she likes "+f3.getLike()+" and also she is a "+f3.getYear()+"year college.");
        System.out.println();
        
        Friends f4 = new Friends();
        
        f4.setName("Kier Vincent Mejeca");
        f4.setAge(25);
        f4.setHobby("playing basketball");
        f4.setLike("painting");
        f4.setYear("second");
        
        System.out.println("*****");
        System.out.println("This is "+f4.getName()+", "+f4.getAge()+" yrs old. His hobby is "+f4.getHobby()+" and he likes  " +f4.getLike()+" and also he is a "+f4.getYear()+"year college.");
        System.out.println();
        

        Friends f5 = new Friends();
        
        f5.setFriends("humansssss!");
        
        System.out.println("They are "+f5.getFriends());
        System.out.println();
    }
}
