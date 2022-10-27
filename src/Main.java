import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String player1= "";
        String player2 = "";
        String trash = "";
        String anotherYN = "";
        boolean done = false;

        do
        {
            System.out.print("Player 1 enter a move [R/P/S]: ");

            if(in.hasNextLine())
            {
                player1 = in.nextLine();
                if(player1.equalsIgnoreCase("R"))
                {
                    System.out.print("Player 2 enter a move [R/P/S]: ");
                    if (in.hasNextLine())
                    {
                        player2 = in.nextLine();
                        if (player2.equalsIgnoreCase("R"))
                        {
                            System.out.println("You both picked rock, it's a tie! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                        else if (player2.equalsIgnoreCase("P"))
                        {
                            System.out.println("Paper covers rock, player 2 wins! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                        else if (player2.equalsIgnoreCase("S"))
                        {
                            System.out.println("Rock beats scissors, player 1 wins! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                    }
                }
                else if(player1.equalsIgnoreCase("P"))
                {
                    System.out.print("Player 2 enter a move [R/P/S]: ");
                    if (in.hasNextLine())
                    {
                        player2 = in.nextLine();
                        if (player2.equalsIgnoreCase("R"))
                        {
                            System.out.println("Paper beats rock, player 1 wins! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                        else if (player2.equalsIgnoreCase("P"))
                        {
                            System.out.println("You both picked paper, it's a tie! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                        else if (player2.equalsIgnoreCase("S"))
                        {
                            System.out.println("Scissors beats paper, player 2 wins! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                    }
                }
                else if(player1.equalsIgnoreCase("S"))
                {
                    System.out.print("Player 2 enter a move [R/P/S]: ");
                    if (in.hasNextLine())
                    {
                        player2 = in.nextLine();
                        if (player2.equalsIgnoreCase("R"))
                        {
                            System.out.println("Rock beats scissors, player 2 wins! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                        else if (player2.equalsIgnoreCase("P"))
                        {
                            System.out.println("Scissors beats paper, player 1 wins! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                        else if (player2.equalsIgnoreCase("S"))
                        {
                            System.out.println("You both chose scissors, it's a tie! ");
                            System.out.print("Would you like to play again? [Y/N] ");
                            anotherYN = in.nextLine();
                            if (anotherYN.equalsIgnoreCase("N"))
                            {
                                done = true;
                            }
                        }
                    }
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid move, not " + trash);
            }
        }while(!done);
    }
}