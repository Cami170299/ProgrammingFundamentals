            //Encasulation

// with encapsulation you are able to access private inoformation.
public class encapsulation {

    private String firstName = "Sierra"; //<-- buiding a private attribute.
    private String lastNAme = "Anna";

    //Getters of the private attributes.
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastNAme;
    }


    //Setters of the private attributes.
    public String setFirstName(String NewName) { 
        return firstName = NewName;
    }
    public String setLastName(String newLastName){
        lastNAme = newLastName;
        return lastNAme;
    }

}
