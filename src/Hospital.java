/**
 * Created by stevenburris on 9/12/16.
 * Hospital names, years operated, whether or not it has an ER, the address, and doctor on staff
 */
public class Hospital {
    String nameofHospital;
    int yearsOpen;
    boolean hasER;
    Address address;
    Doctor[] doctors = new Doctor[5];


    String getNameofHospital() {
        return nameofHospital;
    }

    void setNameofHospital(String newNameofHospital){
        nameofHospital = newNameofHospital;
    }

    int getYearsOpen(){
        return yearsOpen;
    }

    void setYearsOpen(int newYearsOpen){
        yearsOpen = newYearsOpen;
    }

    boolean getHasER(){
        return hasER;
    }

    void setHasER(boolean newHasER){
        hasER = newHasER;
    }

    String getAddress(){
        return address.street + System.lineSeparator() + address.city +", "+ address.state + " " + address.zipCode + System.lineSeparator() + address.country;
    }

    void setAddress(Address newAddress){
        address = newAddress;
    }

    String getDoctors(){
        return doctors[0].name;
    }



}

