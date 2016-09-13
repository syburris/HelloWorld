/**
 * Created by stevenburris on 9/12/16.
 * Name, age, years of experience of doctors, and schools attended
 */
public class Doctor {
    String name;
    int age;
    boolean isWorking;
    String[] education = new String[3];


    Doctor(String newName, int newAge, boolean isWorking, String education1, String education2, String education3){
        setName(newName);
        setAge(newAge);
        setIsWorking(isWorking);
        setEducation1(education1);
        setEducation2(education2);
        setEducation3(education3);


    }

    String getName() {
        return name;
    }

    void setName(String newName){
        name = newName;
    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    boolean getIsWorking(){
        return isWorking;
    }

    void setIsWorking(boolean newIsWorking){
        if(age > 65) {
            isWorking = false;
        }
        else{
            isWorking = newIsWorking;
        }
    }

    String getEducation1(){
        return education[0];
    }

    void setEducation1(String education1){
        education[0] = education1;
    }

    String getEducation2(){
        return education[1];
    }

    void setEducation2(String education2){
        education[1] = education2;
    }

    String getEducation3(){
        return education[2];
    }

    void setEducation3(String education3){
        education[2] = education3;
    }



}
