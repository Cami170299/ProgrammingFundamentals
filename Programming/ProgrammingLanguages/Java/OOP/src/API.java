                            //API
        //==========================================

/*
    Types
    
    1)Build-in API
        
        Is a list of prewritted classes already integrated on a (JDE) Java Dev. Enviroment
        You can find more in: https://docs.oracle.com/javase/8/docs/api/

        This is divided into packages and classes 

        In order to use the APIs you have to write the keyword 'import'

        Syntax
            - import package.name.Class <-- import just one class of the package
            - import package.name.* <-- import the whole package.   
        
    2)User defined packages
        
        To create your own package, you need to follow this Strucutre.
*/

import java.util.Scanner; //<-- Build-in API

public class API {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("What is your name ?");
            String myName = myScanner.nextLine();
            System.out.println("Hello "+myName+"!");
        }
    }    
}
