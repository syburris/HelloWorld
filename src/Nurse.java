/**
 * Created by stevenburris on 9/12/16.
 *
 * this class holds information about nurses working in different hospitals
 */
public class Nurse {
    String name;
    int age;
    String[] specialization = new String[3];
    int yearsExp;
    String currentHospital;

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

    String getSpecialization1(){
        return specialization[0];
    }

    void setSpecialization1(String newSpecialization1){
        specialization[0] = newSpecialization1;
    }

    String getSpecialization2(){
        return specialization[1];
    }

    void setSpecialization2(String newSpecialization2){
        specialization[1] = newSpecialization2;
    }

    String getSpecialization3(){
        return specialization[2];
    }

    void setSpecialization3(String newSpecialization3){
        specialization[2] = newSpecialization3;
    }

    int getYearsExp(){
        return yearsExp;
    }

    void setYearsExp(int newYearsExp){
        yearsExp = newYearsExp;
    }

    String getCurrentHospital(){
        return currentHospital;
    }

    void setCurrentHospital(String newHospital){
        currentHospital = newHospital;
    }


}
