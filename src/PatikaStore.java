import java.util.Scanner;

public class PatikaStore {
    Scanner input = new Scanner(System.in);

    public void initialize() {
        while (true) {
            System.out.println("---------- Patika Store ----------");
            System.out.println("1 - Notebook");
            System.out.println("2 - Mobile Phone");
            System.out.println("3 - List Brand");
            System.out.println("4 - Filter by ID");
            System.out.println("5 - Filter by Brand");
            System.out.println("0 - Exit");
            System.out.print("Please, enter the operation you want to do: ");
            int operation = input.nextInt();

            switch (operation) {
                case 1:

            }
        }
    }
}
