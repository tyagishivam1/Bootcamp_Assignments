public interface inter {
    default void display(){
        System.out.println("interface");
    }
    interface ttn1 extends inter{
        default void display(){
            System.out.println("ttn1");
        }
    }
    interface ttn2 extends inter{
        default void display(){
            System.out.println("ttn2");
        }
    }
}
