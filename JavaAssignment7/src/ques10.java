class ques10{
    public static void main (String[] args) {
        String str="Welcome to TTN";
        int count=2;
        System.out.println("String :"+str.repeat(count));
        System.out.println(str.strip().equals("Welcome to TTN"));
        System.out.println(str.isBlank());
        str=str.indent(5);
        System.out.println(str.stripIndent());
        System.out.println(str.translateEscapes());
    }
}
