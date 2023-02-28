class ques1 {
    static String Firstname;
    static String Lastname;
    static int age;
    static
    {
        Firstname = "Shivam";
        Lastname = "Tyagi";
        age = 20;
    }
    static void display() {
        System.out.println("Firstname:"+Firstname);
        System.out.println("Lastname:"+Lastname);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args)
    {
        display();
    }
}