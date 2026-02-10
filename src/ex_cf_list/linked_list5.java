package ex_cf_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class linked_list5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continueInput = "Y";
        List<String> list = new ArrayList<>();

        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter the name you want to store:");
            String name = scanner.nextLine();
            list.add(name);

            System.out.println("Do you want to add another? Y/N");
            continueInput = scanner.nextLine();
        }

        System.out.println("\nStored Names:");
        for (String name : list) {
            System.out.println(name);
        }

        scanner.close();
    }
}
