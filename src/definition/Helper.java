package definition;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
    LinkedListDef<Person> list = new LinkedListDef<>();
    Scanner sc = new Scanner(System.in);

    public void add() {
        String s3;
        boolean option = true;
        boolean op1 = true;
        Person p = new Person();
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Please enter the name of the Person:");
        System.out.print("First Name : ");
        String s = sc.nextLine();
        System.out.print("Last Name : ");
        String s1 = sc.nextLine();
        System.out.print("Contact Number : ");
        String n = sc.nextLine();
        arr.add(n);
        while (op1) {
            System.out.println("would you like to add another contact number: y/n");
            String con = sc.nextLine();
            if (con.equals("y")) {
                System.out.print("Contact Number : ");
                n = sc.nextLine();
                arr.add(n);
                op1 = true;
            } else {
                op1 = false;
            }
        }
        System.out.println("Would you like to enter the email addresss:y/n");
        String inq = sc.nextLine();
        if (inq.equals("y")) {
            System.out.print("Enter the email address : ");
            s3 = sc.nextLine();
        } else {
            s3 = null;
        }
        p.setFirst_Name(s);
        p.setLast_Name(s1);
        p.setContact_number(arr);
        p.setEmail(s3);
        list.add(p);
        list.sort(list);
        System.out.println(list.size);
    }

}
