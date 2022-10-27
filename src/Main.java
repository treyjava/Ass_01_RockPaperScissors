import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String player1 = "";
        String player2 = "";
        String trash = "";
        String anotherYN = "";
        boolean done = false;
        boolean doneInput = false;

        do {
            do
            {
                System.out.print("Player 1 enter a move [R/P/S]: ");
                player1 = in.nextLine();
                player1 = player1.toUpperCase();
                if(player1.matches("[RPS]"))
                {
                    doneInput = true;
                }
            }while(!doneInput);


            doneInput = false;
            do
            {
                System.out.print("Player 2 enter a move [R/P/S]: ");
                player2 = in.nextLine();
                player2 = player2.toUpperCase();
                if(player2.matches("[RPS]"))
                {
                    doneInput = true;
                }
            }while(!doneInput);

            if(player1.equals("R"))
            {
                if(player2.equals("R"))
                {
                    System.out.println("You both picked rock, it's a tie! ");
                }
                else if(player2.equals("P"))
                {
                    System.out.println("Paper covers rock, player 2 wins! ");
                }
                else if(player2.equals("S"))
                {
                    System.out.println("Rock breaks scissors, player 1 wins! ");
                }
            }

            else if(player1.equals("P"))
            {
                if(player2.equals("R"))
                {
                    System.out.println("Paper covers rock, player 1 wins! ");
                }
                else if(player2.equals("P"))
                {
                    System.out.println("You both chose paper, it's a tie! ");
                }
                else if(player2.equals("S"))
                {
                    System.out.println("Scissors cuts paper, player 2 ");
                }
            }

            else if(player1.equals("S"))
            {
                if(player2.equals("R"))
                {
                    System.out.println("Rock breaks scissors, player 2 wins! ");
                }
                else if(player2.equals("P"))
                {
                    System.out.println("Scissors cuts paper, player 1 wins! ");
                }
                else if(player2.equals("S"))
                {
                    System.out.println("You both chose scissors, it's a tie! ");
                }
            }


            System.out.print("Would you like to play again? [Y/N] ");
            anotherYN = in.nextLine();
            if(anotherYN.equalsIgnoreCase("N"))
            {
                done = true;
            }
        }while(!done);
    }
}
