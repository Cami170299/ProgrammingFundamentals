import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("What is going to be your name on our app ?");
            String myInputName = scan.nextLine();
            System.out.println("What is going to be your last name on our app ?");
            String myInputLastName = scan.nextLine();
            encaup myFName = new encaup();
            encaup myLName = new encaup();
            myFName.setFirstName(myInputName);
            myLName.setLastName(myInputLastName);
            System.out.println("my full private name is: "+myFName.getFirstName()+" "+myLName.getLastName());
        }
    }
}
