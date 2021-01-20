package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
public class ArrayList01_RemoveANameFromTheList {

    public static void main(String[] args) {

        ArrayList <String> names1 = new ArrayList<>();
        names1.add("Ali");
        names1.add("Veli");
        names1.add("John");
        names1.add("Eric");
        System.out.println(names1);


        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Ahmed");
        names2.add("Mehmed");

        names1.addAll(names2);
        System.out.println(names1);


        Collections.addAll(names1, "Rahul", "OM", "Ahmed");
        System.out.println(names1);


        String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
        System.out.println(Arrays.toString(geeks));
       // List al = Arrays.asList(geeks);
        //System.out.println(al);

        names1.addAll(Arrays.asList(geeks));
        System.out.println(names1);

        names1.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names1);

        names1.set(0, "Anna");
        System.out.println(names1);

        Collections.replaceAll(names1, "Mehmed", "Ahmed");
        System.out.println(names1);

        System.out.println("---------------------------------------");

        List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                List<String> names4 = new ArrayList<>();

            names3.forEach(p-> {if(!p.equals("Ahmed")) names4.add(p);}  );


        System.out.println(names4);


    }


}
