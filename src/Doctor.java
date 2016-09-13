/**
 * Created by stevenburris on 9/12/16.
 * Name, age, years of experience of doctors, and schools attended
 */
public class Doctor {
    String name;
    int age;
    int yearsWorked;
    String[] education = new String[3];

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

    int getYearsWorked(){
        return yearsWorked;
    }

    void setYearsWorked(int newYearsWorked){
        yearsWorked = newYearsWorked;
    }


}
