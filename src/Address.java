/**
 * Created by stevenburris on 9/12/16.
 */

public class Address {
    String street;
    String city;
    String state;
    String country;
    int zipCode;

    String getStreet(){
        return street;
    }

    void setStreet(String newStreet){
        street = newStreet;
    }

    String getCity(){
        return city;
    }

    void setCity(String newCity){
        city = newCity;
    }

    String getState(){
        return state;
    }

    void setState(String newState){
        state = newState;
    }

    String getCountry(){
        return country;
    }

    void setCountry(String newCountry){
        country = newCountry;
    }

    int getZipCode(){
        return zipCode;
    }

    void setZipCode(int newZipCode){
        zipCode = newZipCode;
    }


}
