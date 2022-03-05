                            //Java Constructors 

// a constructure is the method that manipulates the attributes and other general methods

public class JavaConstructors{ //<--Main class
    int x = 123; //<-- class atribute
    String def;
    final int z = 4; //<--- unmutable int 

    public JavaConstructors(int y){ //<-- this is a constructor with the same name of the class
         x = y; // <--- with this we set initial value of the class atribute.
         def = z+" is unmmutable.";
    }
    public static void main(String[] args){ //<-- Main mathod
        JavaConstructors xValue = new JavaConstructors(23); //<-- we create our object and add the parameter of the constructor. 
        System.out.println(xValue.x);
        System.out.println(xValue.def);
    }

}