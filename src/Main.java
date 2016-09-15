import java.util.*;
import java.util.function.BooleanSupplier;

/**
 * Created by stevenburris on 9/14/16.
 */
public class Main {
    public static void main(String[] args){
        String[] names = new String[3];
        names[0] = "alice";
        names[1] = "bob";
        names[2] = "charlie";

//        //while loop
//        int index = 0;
//        while(index < names.length){
//            System.out.println(names[index]);
//            index++;
//        }
//
//        //traditional for loop
//        for (int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
//        //new for loop
//        for(String name : names){
//            System.out.println(name);
//        }

        // int -> Integer
        // long -> Long
        //boolean -> Boolean
        // ^ above shows unboxed -> boxed

        boolean b = Boolean.valueOf(true);
        System.out.println(b);


        //ArrayLists
        ArrayList<String> names2 = new ArrayList();
        names2.add("alice");
        names2.add("bob");
        names2.add("charlie");
        names2.remove(1);
        System.out.println(names2);

        //HashMaps
        HashMap<String, Object> person = new HashMap();
        person.put("name", "alice");
        person.put("age", 30);
        person.put("location", "Charleston");
        person.put("name", "bob");
        person.remove("age");
        person.put("names", names2);
        System.out.println(person.get("name"));



        String alice = names2.get(0);
        String bob = (String) person.get("name");
    }
}


