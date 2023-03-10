public interface ttn {
    default void ttn1(){
        ttn2();
    }
    private void ttn2(){
        System.out.println("WELCOME TO TTN");
    }
}
