import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {

        Scanner User = new Scanner(System.in);

        System.out.print("Enter a command: ");
        String user = User.nextLine();



        if (user.equals("C")) {
            System.out.println("Do you want to clear the list?");
            if (User.nextLine().equals("Y")) {

                System.exit(0);

            }
        }
        ArrayList<String> List = new ArrayList<String>();

        List.add("Item1: Milk");
        List.add("Item2: eggs");
        List.add("Item3: bread");
        List.add("Item4: ");
        List.add("Item5: ");
        List.add("Item6: ");
        List.add("Item7: ");

        List.set(3, "tomato");
        List.set(4, "butter");

        for(int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }

    }
}