/**
 * Created by stevenburris on 9/12/16.
 *
 * Patient info: name, age, date of birth, check in date,
 * check out date, and illness
 */
public class Patients {
    String name;
    int age;
    String dateOfBirth;
    String checkIn;
    String checkOut;
    String sickWith;

    String getName(){
        return name;
    }

    void setName(String newName){
        name = newName;
    }

    int getAge(){
        return age;
    }

    void setAge(int newAge){
        age = newAge;
    }

    String getDateOfBirth(){
        return dateOfBirth;
    }

    void setDateOfBirth(String newDateOfBirth){
        dateOfBirth = newDateOfBirth;
    }

    String getCheckIn(){
        return checkIn;
    }

    void setCheckIn(String newCheckIn){
        checkIn = newCheckIn;
    }

    String getCheckOut(){
        return checkOut;
    }

    void setCheckOut(String newCheckOut){
        checkOut = newCheckOut;
    }

    String getSickWith(){
        return sickWith;
    }

    void setSickWith(String newSickWith){
        sickWith = newSickWith;
    }

}
