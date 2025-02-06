import java.util.*;

public class ass1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ass1 <name> <age>");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Name: " + name + ", Age: " + age);
    }
}
