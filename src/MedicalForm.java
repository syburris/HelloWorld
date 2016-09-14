/**
 * Created by stevenburris on 9/12/16.
 */
public class MedicalForm {
    String name;
    Address address;
    int yearOfBirth;
    String[] allergies = new String[5];
    static int deadIf = 1945;

    MedicalForm(String newName,Address newAddress,int newYearOfBirth,String newAllergy1,String newAllergy2, String newAllergy3,String newAllergy4, String newAllergy5){
        setName(newName);
        setAddress(newAddress);
        setYearOfBirth(newYearOfBirth);
        setAllergy1(newAllergy1);
        setAllergy2(newAllergy2);
        setAllergy3(newAllergy3);
        setAllergy4(newAllergy4);
        setAllergy5(newAllergy5);
    }

    String getName(){
        return name;
    }

    void setName(String newName){
        name = newName;
    }

    Address getAddress(){
        return address;
    }

    void setAddress(Address newAddress){
        address = newAddress;
    }

    int getYearOfBirth(){
        return yearOfBirth;
    }

    void setYearOfBirth(int newYearOfBirth){
        if(newYearOfBirth < deadIf){
            name = "Dead";
        }
        else{
            yearOfBirth = newYearOfBirth;
        }
    }

    String getAllergy1(){
        return allergies[0];
    }

    void setAllergy1(String newAllergy1){
        allergies[0] = newAllergy1;
    }

    String getAllergy2(){
        return allergies[1];
    }

    void setAllergy2(String newAllergy2){
        allergies[1] = newAllergy2;
    }

    String getAllergy3(){
        return allergies[2];
    }

    void setAllergy3(String newAllergy3){
        allergies[2] = newAllergy3;
    }

    String getAllergy4(){
        return allergies[3];
    }

    void setAllergy4(String newAllergy4){
        allergies[3] = newAllergy4;
    }

    String getAllergy5(){
        return allergies[4];
    }

    void setAllergy5(String newAllergy5){
        allergies[4] = newAllergy5;
    }

}


