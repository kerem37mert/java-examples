package generics;

public class Main {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        System.out.println(b1.get());
    }
}
