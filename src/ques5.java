public class ques5{
    String firstname;
    String lastname;
    int age;
    String designation;
    public ques5()
    {
        firstname = "Shivam";
        lastname = "Tyagi";
        age = 24;
        designation = "Trainee";
    }
    public ques5(String firstname, String lastname, int age, String designation)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }
    public void set_firstname(String fname)
    {
        this.firstname = fname;
    }
    public String get_firstname()
    {
        return firstname;
    }
    public void set_lastname(String lname)
    {
        this.lastname = lname;
    }
    public String get_lastname()
    {
        return lastname;
    }
    public void set_age(int age)
    {
        this.age = age;
    }
    public int get_age()
    {
        return age;
    }
    public void set_designation(String dsg)
    {
        this.designation = dsg;
    }
    public String get_designation()
    {
        return designation;
    }
    // toString
    public String toString()
    {
        return "Employee { " +
                "First Name - " + firstname + " | " +
                "Last Name - " + lastname + " | " +
                "Age - " + age + " | " +
                "Designation - " + designation + " }";
    }
    public static void main(String[] args)
    {
        ques5 sc = new ques5();
        ques5 st= new ques5("Shivam", "Tyagi", 24, "Trainee");
        sc.set_firstname("Aman");
        st.get_designation();
        System.out.println(sc.toString());
        System.out.println(st.toString());
    }
}
