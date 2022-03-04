import java.util.ArrayList;
import java.util.Scanner; // input value terminal.
import javax.swing.JOptionPane; // dialog box appear.

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.event.SwingPropertyChangeSupport;

//everytime the .java file always must match with the class <-
public class main { 
    public static void main(String[] args) {
        
    //VARIABLE´S TYPE

        //strings 
        String myString = "This is a string on a variable.";
        System.out.println(myString);
        
        //numbers 
            
            //Int
            final int myNum = 123;
            // myNum = 124; 
            System.out.println(myNum);

            //long 
            long myLongNum = 120000L; // we have to use a L at the end
            System.out.println(myLongNum);

            //float
            float myFloatNum = 12.345f; //Always have to finish with a f
            System.out.println(myFloatNum);

            //double
            double myDoubleNum = 12.5567625456456d; // long decimals and ends with a d
            System.out.println(myDoubleNum);

        //characters
        char myLetter = 'D';
        System.out.println(myLetter);

        //Boolean 
        boolean myBool = true;
        System.out.println(myBool);

        //syntax tricks
        int num1 = 1, num2 = 2, num3 = 3; // in here we defined multiple variables.
        System.out.println(num1+num2+num3);

        //Operating
        int firstJob = 10;
        int secondJob = 5;
        int yearsOfExp = firstJob + secondJob;
        String fisrtName = "Camilo ";
        String lastName = "Sierra ";
        String fullName = fisrtName + lastName ;
        System.out.println(fullName + "you Have " + yearsOfExp + " of experience.");

    //CASTINGS

        //Narrowing Casting 
        float floatNum = 12.5f;
        int integerNum = (int)floatNum; //you have to do a manual casting.
        System.out.println(integerNum);

        //Widening Casting

        int castingInt = 12;
        float castingFloat = castingInt;
        System.out.println(castingFloat); 

    //OPERATORS
        
        //sum
        int x = 12 + 5;
        System.out.println(x);

        //rest
        float resFloat1 = 12.234f,resFloat2 = 3.546645f ;
        System.out.println(resFloat1-resFloat2);

        //multiplication
        int multOperation = 123 * 5 ;
        System.out.println(multOperation);

        //Divition
        float divNum = 123f / 5f;
        System.out.println(divNum);

        //Modulus (remainder)
        int remCero = 4%2;
        int remOne = 4%3;
        System.out.println(remCero);
        System.out.println(remOne);

        //increment by 1
        int incrNum = 12;
        ++incrNum;
        System.out.println(incrNum);

        //decrease by 1
        int decNum = 12;
        decNum--;
        System.out.println(decNum);

        //Swaping Values 
        int swapNum1 = 10;
        int swapNum2 = 20;
        int temporal;
        temporal = swapNum1;
        swapNum1 = swapNum2;
        swapNum2 = temporal;
        System.out.println("Num1: "+swapNum1);
        System.out.println("Num2: "+swapNum2);
        
        //this is how oyu call an imput.
        Scanner scan = new Scanner(System.in);

       /*
        //questions scan System.in
        System.out.println("What is oyur name ?");
        String name = scan.nextLine();
        System.out.println("How old are you ?");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your favourite food ?");
        String food = scan.nextLine();

        System.out.println("Hello " +name+ " your have " +age+ " years old.");
        System.out.println("And " +food+ "is your favourite food.");
        

        //input dialog box
        String name = JOptionPane.showInputDialog("What is your name ?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age ?"));
        JOptionPane.showMessageDialog(null, "Hello "+name+" you have "+age);
        */

    //STRINGS 

        //String methods
        String txt = "This is a Text";
        System.out.println("The lenght of the text is: "+ txt.length());
        System.out.println("LowerCase: " +txt.toLowerCase());
        System.out.println("UperCase: " +txt.toUpperCase());
        System.out.println("The index of the word 'a' is: "+txt.indexOf("a"));

        //String concatenations
        String firstName = "Camilo";
        String lastName1 = "Sierra";
        System.out.println(firstName+" "+lastName1);

        //Strings Soecial Characters
        String phara = "They are called themselves \"The Doom Of Hell.\" \n Even though they didn't believed that much on God.";
        System.out.println(phara);

    //MATH METHODS
        
        //The higest value.
        int maxValue = Math.max(5,12);
        System.out.println("The max Value is: " +maxValue);

        //The minimum value.
        int minValue = Math.min(12,5);
        System.out.println("The min Value is: "+minValue); 

        //Sqrtroot
        double squeaRoot = Math.sqrt(78);
        System.out.println("The Square root of 12 is: " + squeaRoot);

        //return a positive number
        int posNum = Math.abs(-12);
        System.out.println("Trunung -12 into: "+posNum );

        //generate random numbers
        int randNum = (int) (Math.random()*101); // this will create a random number from 0 to 100
        System.out.println(randNum);

    //STATEMENTS

        //If Statement 
        int tester = 3;
        if ( tester > 5){
            System.out.println("this is True");
        } else if (tester < 5) {
            System.out.println("this is false");
        }else{
            System.out.println("Equal");
        }

        //Short hand ternary operator
        int time = 18;
        String resultTime = (time > 18) ? "Good Evening" : "Good Afternoon";
        System.out.println(resultTime); 

        //Switch Statements
        int dayOFTheWeek = 5;
        switch (dayOFTheWeek) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Not a valid Number.");
        }

    //LOOPS

        //while loops
        int i = 0;
        while(i != 5) {
            System.out.println(i);
            i++;
        }

        //do while loop
        int d = 0;
        do{
            System.out.println(d);
            d++;            //it is the same dif syntax
        }
        while(d !=5 );

        //For loops
        for (int f = 0; f < 5; f+=2){
            System.out.println(f);
        }

        //for each loops
        String[] cars = {"Mazda", "BMW", "Chevy"};
        for (String c : cars ) {
            System.out.println(c);
        }

        //Break and continue
            //breake
            for (int b = 0; b < 10; b++){
                if(b == 4){
                    break;
                }
                System.out.println(b);
            }
            //Contunue 
            for (int con = 0; con < 10; con++){
                if(con == 4){
                    continue;
                }
                System.out.println(con);
            }

    //ARRAYS

        //types of Arrays
        int[] myIntArray = {10,20,30,40,50};
        String[] myStrArray = {"Hola", "Adios", "Si", "No"};

        //Accessing data of an array
        for (int num : myIntArray){
            if (num == myIntArray[3]){
            System.out.println("We stop in: " + num);
                break;
            }
            System.out.println(num);
        }

        //Changing elements in a array
        String[] disneyCharacters = {"Timon", "Pumba", "Mogly", "Elsa"};
        disneyCharacters[1] = "Snow White";
        for(int dis = 0; dis != disneyCharacters.length;dis++){
            System.out.println(disneyCharacters[dis]);
        }

        //Multidimentional arrays 
        int[][] multyArray = {{1,2,3,4,5},{5,6,7,8}};

        //transforming a multy dim array to a single 
       ArrayList<Integer> mySingleArray = new ArrayList<Integer>();
        for (int mul=0; mul < multyArray.length;++mul){
            for (int mul1=0; mul1 < multyArray[mul].length; ++mul1){
                mySingleArray.add(multyArray[mul][mul1]);
            }
        }
        System.out.println(mySingleArray);

    //METHODS

        //Calling a new basic method
        myNewMethod();

        //Calling a parameters method
        helloByName("Anna");
        helloByName("Cami");
        helloByName("Cami Jr.");

    }

                                        /*NEW METHODS*/
                        //============================================
    
    //creating a basic method
    public static void myNewMethod() {
        System.out.println("This is a new method called.");
    }

    //a method with parameters
    public static void helloByName(String userName) {
        System.out.println("Hello "+userName);
    }
}



