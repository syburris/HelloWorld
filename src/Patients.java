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
    static int maxAge = 100;

    Patients(String newName,int newAge,String newDateOfBirth, String newCheckIn,String newCheckOut,String newSickWith){
        setName(newName);
        setAge(newAge);
        setDateOfBirth(newDateOfBirth);
        setCheckIn(newCheckIn);
        setCheckOut(newCheckOut);
        setSickWith(newSickWith);
    }

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
        if(newAge >= 100){
            sickWith = "Death";
        }
        else{
            age = newAge;
        }
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
