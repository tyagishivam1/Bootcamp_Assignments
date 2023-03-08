import java.util.Optional;
class ques4{
    public static void main(String[] args)
    {
        String[] str = new String[5];
        str[1] = "Welcome to TTN";
        Optional<String> value = Optional.of(str[1]);
        System.out.println(value.get());
        System.out.println(value.isPresent());
    }
}
