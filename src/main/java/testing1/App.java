package testing1;

import java.io.Console;

import javax.lang.model.util.ElementScanner14;

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
        input=input.trim();
       /*  if (input.equals("swim"))
        {
            System.out.println("\nYou float");
        }else if (input.equals("cycle")){
            System.out.println("\nYou roll");
        } else if (input.equals("jog")){
            System.out.println("\nYour heart is strong");
        } else {
            System.out.print("\nNothing");
        } */
        //slide 18
        switch (input.toLowerCase())
        {
            case "swim": System.out.println("\nYou float");
            break;
            case "jog": System.out.println("\nYour heart is strong");
            break;
            case "cycle": System.out.println("\nYou roll");
            break;
            default: System.out.print("\nNothing");
        }
        // slide 19
        String inputAge = con.readLine("What is your age?");
        Integer myAge = Integer.parseInt(inputAge);
        if(myAge<=0)
        {
            System.out.println("You are a baby");
        } else if(myAge>2 && myAge<=4)
        {
            System.out.println("You are a toddler");
        } else if(myAge>4 && myAge<=12){
            System.out.println("You are a child");
        } else if(myAge>12 && myAge<19){
            System.out.println("You are a teen");
        } else {
            System.out.println("You are an adult");
        }
    }
}
