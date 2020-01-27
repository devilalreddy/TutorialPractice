package compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<StudentPojo> studentPojoArrayList = new ArrayList<StudentPojo>();
        studentPojoArrayList.add(new StudentPojo(444, "Devilal", "Palamanar"));
        studentPojoArrayList.add(new StudentPojo(333, "Police", "Chittoor"));
        studentPojoArrayList.add(new StudentPojo(111, "Reddy", "Bangalore"));
        studentPojoArrayList.add(new StudentPojo(222, "DevilalPolice", "Prague"));

        System.out.println("Asending order sortting");

        Collections.sort(studentPojoArrayList, new Comparator<StudentPojo>() {
            @Override
            public int compare(StudentPojo studentPojo, StudentPojo t1) {
                return studentPojo.getRollNumber() - t1.getRollNumber();
            }
        });
        for (int i = 0; i <studentPojoArrayList.size() ; i++) {
            System.out.println(studentPojoArrayList.get(i));

        }

        Collections.sort(studentPojoArrayList, new Comparator<StudentPojo>() {
            @Override
            public int compare(StudentPojo studentPojo, StudentPojo t1) {
                return studentPojo.getName().compareTo(t1.getName());
            }
        });


        System.out.println("assending  order based on names ");

        for (int i = 0; i <studentPojoArrayList.size() ; i++) {
            System.out.println(studentPojoArrayList.get(i));

        }

        // comparing with StudentPojo commparotor

        Collections.sort(studentPojoArrayList,new StudentPojo());

        Iterator<StudentPojo> studentPojoIterator = studentPojoArrayList.iterator();
        while (studentPojoIterator.hasNext()) {
            System.out.println(studentPojoIterator.next());
        }

        System.out.println("final order ::");
        for ( StudentPojo student:studentPojoArrayList
             ) {
            System.out.println(student);

        }

       /* new Comparator<StudentPojo>() {
            public int compare(StudentPojo a, StudentPojo b) {
                return a.rollNumber - b.rollNumber;
            }
        };*/

    }
}
