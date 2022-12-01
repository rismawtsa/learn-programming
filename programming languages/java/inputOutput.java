import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        System.out.println("what is your name?");

        // type identifier = new type()
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // read the input on terminal

        System.out.println("hello " + name);
    }
}
