                            //(OOP)Object Oriented Programming.
                        //==========================================

//The basics.

public class App {  //<--- this is my class
    
    int x = 5; //<--- this is an attribute
    int y = 10; //<--- this is Another attribute
    String name = "Anna"; //<-- this is Another attribute
    String lastName = "Rupp-DesRosiers";  //<-- this is Another attribute

    public static void main(String[] args) {//<--- This is my Method

        App Value = new App(); //<--- This is an Object
        App ChangingX = new App(); //<-- this is another object but with the same attribute.
        App Valuey = new App(); //<-- this is another object
        App name = new App(); //<-- this is another object
        App lastName = new App();//<-- this is another object
        int number = Value.x;
        Valuey.y = 25;//<-- this is how you modify an Attribute value
        ChangingX.x = 30; 
        System.out.println(number);
        System.out.println(Valuey.y);
        System.out.println(ChangingX.x);
        //Printing mutilple objects 
        System.out.println("Full Name: " + name.name +" "+lastName.lastName +" "+ ChangingX.x );
        
        //Calling a Method
        printHello();

        //Private attribute Encapsulation
        encapsulation enc = new encapsulation();
        enc.setFirstName("Camilo"); //<-- setting a private attribute in encapsulation.java
        System.out.println("The new name is: "+ enc.getFirstName()); //<-- calling the private attribute.
    }

    public static void printHello(){ //<-- This is another method
        System.out.println("Hello World!");
    }

    


}
