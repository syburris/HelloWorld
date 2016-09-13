/**
 * Created by stevenburris on 9/12/16.
 * Hospital names, years operated, whether or not it has an ER, the address, and doctor on staff
 */
public class Hospital {
    String nameofHospital;
    int yearsOpen;
    boolean hasER;
    Address address;
    String[] doctors = new String[5];


    String getNameofHospital(){
        return nameofHospital;
    }

    int getYearsOpen(){
        return yearsOpen;
    }

    boolean getHasER(){
        return hasER;
    }

    Address getAddress(){
        return address;
    }

    String getAddress2(){
        return address.street + System.lineSeparator() + address.city +", "+ address.state + " " + address.zipCode + System.lineSeparator() + address.country;
    }
}

