import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nWELCOME TO YOUR GAMES!!");
        Scanner scanInput = new Scanner(System.in);
        char choice;
        choice = menu(scanInput);
        
        while (choice != 'Q'){
            //test for choice type and call appropriate Game
            if (choice == 'L'){
                Games.lotteryGame(scanInput);
            }
            else if (choice == 'C'){
                Games.playCraps(scanInput);
            }
            else if (choice == 'S'){
                Games.playScraps(scanInput);
            }
            else if (choice == 'R'){
                Games.playRPS(scanInput);
            }
            else if (choice == 'Q'){
                System.out.println("Goodbye!");
                break;
            }

            //ask to play again? Show menu & get choice
            System.out.println("\nDo you want to play again?");
            choice = menu(scanInput);
        }
        scanInput.close();
    }

    public static char menu(Scanner scanInput){
        char choice = 'Q';
        String inputString;

        //menu loop
        //   print menu
        System.out.println("L       Lottery");
        System.out.println("C       Craps");
        System.out.println("S       Scraps");
        System.out.println("R       Rock, Paper, Scissors");
        System.out.println("Q       Quit");
        //   prompt user, get response & convert to upper case
        System.out.print("What choice do you prefer: ");
        inputString = scanInput.nextLine();
        choice = inputString.toUpperCase().charAt(0);

        //   verify that the choice is L, C, S, R, or Q 
        if (choice != 'L' && choice != 'C'
        && choice != 'S' && choice != 'R'
        && choice != 'Q'){
            System.out.println("Invalid option!");
            choice = menu(scanInput);
        }
        return choice;
    }
}

