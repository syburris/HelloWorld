/**
 * Created by stevenburris on 9/12/16.
 *
 * Class created to identify different illnesses
 * Name of illness, whether the illness is critical or treatable,
 * how long the illness lasts, and days in bed
 */
public class MedicalCondition {

    String nameofCondition;
    boolean critical;
    boolean treatable;
    String timeWith;
    int daysInBed;

    MedicalCondition(String newNameofCondition,boolean newCritical,boolean newTreatable,String newTimeWith,int newDaysInBed){
        setNameofCondition(newNameofCondition);
        setCritical(newCritical);
        setTreatable(newTreatable);
        setTimeWith(newTimeWith);
        setDaysInBed(newDaysInBed);
    }

    String getNameofCondition(){
        return nameofCondition;
    }

    void setNameofCondition(String newNameofCondition){
        nameofCondition = newNameofCondition;
    }

    boolean getCritical(){
        return critical;
    }

    void setCritical(boolean newCritical){
        if(newCritical = reallyBad(daysInBed)){
            newCritical = true;
        }
        else{
            critical = newCritical;
        }
    }

    boolean getTreatable(){
        return treatable;
    }

    void setTreatable(boolean newTreatable){
        treatable = newTreatable;
    }

    String getTimeWith(){
        return timeWith;
    }

    void setTimeWith(String newTimeWith){
        timeWith = newTimeWith;
    }

    int getDaysInBed(){
        return daysInBed;
    }

    void setDaysInBed(int newDaysInBed){
        daysInBed = newDaysInBed;
    }

    static boolean reallyBad(int newDaysInBed){
        newDaysInBed = 10;
        return true;
    }


}
