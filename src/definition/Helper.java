package definition;
import java.util.Scanner;

public class Helper {
    LinkedListDef<Person> list = new LinkedListDef<>();
    Scanner sc = new Scanner(System.in);
    public static int count = 0;

    public void add() {
        String s3;
        count = 0;
        boolean option = true;
        boolean op1 = true;
        Person p = new Person();
        String arr = "";
        System.out.println("Please enter the name of the Person:");
        System.out.print("First Name : ");
        String s = sc.nextLine();
        System.out.print("Last Name : ");
        String s1 = sc.nextLine();
        System.out.print("Contact Number : ");
        String n = sc.nextLine();
        arr = arr + n;
        count++;
        while (op1) {
            System.out.println("would you like to add another contact number: y/n");
            String con = sc.nextLine();
            if (con.equals("y")) {
                System.out.print("Contact Number : ");
                n = sc.nextLine();
                arr = arr + ", " + n;
                count++;
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
    }

    public void print() {
        if (list.size == 0) {
            System.out.println("EMPTY CONTACT LIST ! Please add Some New Contacts");
        } else {
            for (Person j : list) {
                System.out.println(j);
            }
        }

    }


    public void Search() {
        int count = 0;
        boolean response = false;
        LinkedListDef<Person> l1 = new LinkedListDef<Person>();
        System.out.println("Enter the first name of contact:");
        String search = sc.nextLine();
        for (Person obj : list) {
            if (obj.getFirst_Name().equals(search)) {
                count++;
                l1.add(obj);
                response = true;
            }
        }
        if (response != true) {
            System.out.println("Match does not found !");
        } else {
            System.out.println(count + " Match Found ! ");
            for (Person ob : l1) {
                System.out.println(ob);
            }
        }
    }

    public void delete() {
        int count = 1;
        for (Person ob : list) {
            System.out.println(count + ". " + ob.getFirst_Name() + " " + ob.getLast_Name());
            count++;
        }
        System.out.println("Press the number against the contact to delete it:");
        int del = sc.nextInt();
        sc.nextLine();
        Person ob = list.remove(del - 1);
        System.out.println(ob.getFirst_Name() + " " + ob.getLast_Name() + "'s contact  deleted from list.");
    }
}





