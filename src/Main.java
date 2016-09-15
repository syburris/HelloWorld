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

        boolean b = Boolean.valueOf("1");
        System.out.println(b);

        int i = Integer.valueOf("123");
        System.out.println(i);




    }
}


