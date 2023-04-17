package testing1;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Console con = System.console();
        // Ask for name
        String name = con.readLine("What is your name?");
        if (name.length() > 0) {
            System.out.printf("\nNice to meet you, %s", name);
            Integer age = 80;
            System.out.printf("\n%s is %d years old.", name, age);
        } else {
            System.out.println("You have not told me your name");
        }
// slide 17
        String input = con.readLine("\nWhat is your hobby?");
        input.trim();
        if (input.equals("swim"))
        {
            System.out.println("\nYou float");
        }else if (input.equals("cycle")){
            System.out.println("\nYou roll");
        } else if (input.equals("jog")){
            System.out.println("\nYour heart is strong");
        } else {
            System.out.print("\nNothing");
        }
    }
}
