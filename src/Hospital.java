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

    Hospital(String newNameofHospital,int newYearsOpen,boolean newHasER,Address newAddress,String newDoctor1,String newDoctor2,String newDoctor3,String newDoctor4,String newDoctor5){
        setNameofHospital(newNameofHospital);
        setYearsOpen(newYearsOpen);
        setHasER(newHasER);
        setAddress(newAddress);
        setDoctors1(newDoctor1);
        setDoctors2(newDoctor2);
        setDoctors3(newDoctor3);
        setDoctors4(newDoctor4);
        setDoctors5(newDoctor5);
    }


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
        if(hospitalHasER(yearsOpen)){
            hasER = false;
        }
        else{
            yearsOpen = newYearsOpen;
        }
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
        return doctors[0].name + System.lineSeparator() + doctors[1].name + System.lineSeparator() + doctors[2].name + System.lineSeparator() + doctors[3].name + System.lineSeparator() + doctors[4].name;
    }

    void setDoctors1(String newDoctor1){
        doctors[0].name = newDoctor1;
    }

    void setDoctors2(String newDoctor2){
        doctors[1].name = newDoctor2;
    }

    void setDoctors3(String newDoctor3){
        doctors[2].name = newDoctor3;
    }

    void setDoctors4(String newDoctor4){
        doctors[3].name = newDoctor4;
    }

    void setDoctors5(String newDoctor5){
        doctors[4].name = newDoctor5;
    }

    static boolean hospitalHasER(int yearsOpen){
        yearsOpen = 0;
        return false;
    }





}

