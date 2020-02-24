package definition;

public class Person {
    int count;
    private String Last_Name;
    private String First_Name;
    private String email;
    private String arr;
    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_number() {
        return arr;
    }

    public void setContact_number(String arr) {
        this.arr = arr;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }


    @Override
    public String toString() {
        if (Helper.count == 1) {
            return "-------- * -------- * -------- * --------" + "\n" +
                    "First Name : " + First_Name + "\n" + "Last Name : " + Last_Name + "\n" + "Contact Number: " + arr + "\n" + "Email Address : " + email + "\n" +
                    "-------- * -------- * -------- * --------";
        } else {
            return "-------- * -------- * -------- * --------" + "\n" +
                    "First Name : " + First_Name + "\n" + "Last Name : " + Last_Name + "\n" + "Contact Number(s): " + arr + "\n" + "Email Address : " + email + "\n" +
                    "-------- * -------- * -------- * --------";
        }

    }
}

