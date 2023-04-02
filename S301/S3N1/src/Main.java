import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        String command;
        Undo undo1 = Undo.getInstance();

        do {
            System.out.println("Please select one of these 5 options");
            System.out.println("1.Introduce command");
            System.out.println("2.Delete last command");
            System.out.println("3.List all commands");
            System.out.println("4.List last command added");
            System.out.println("5.Exit");

            try {
                System.out.println("Please write one option, number from 1 to 5 : ");
                option = sn.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("You has chosen option 1");
                        System.out.println("Introduce your command : ");
                        command= sn.next();
                        undo1.addCommand(command);
                        break;

                    case 2:
                        System.out.println("You has chosen option 2");
                        undo1.deleteCommand();
                        break;

                    case 3:
                        System.out.println("You has chosen option 3");
                        undo1.ShowCommand();
                        break;

                    case 4:
                        System.out.println("You has chosen option 4");
                        undo1.ShowLastCommand();
                        break;

                    case 5:
                        System.out.println("You has chosen option 5. GoodBye!");
                        exit = true;
                        break;

                    default:
                        System.out.println("You must choose only number between 1 and 5.");
                }
            }catch(InputMismatchException e){
                System.out.println("You should insert a number");
                //No eternal bucle
                sn.next();
                }

        } while (!exit);
    }

}
