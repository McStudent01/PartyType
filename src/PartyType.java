import java.util.Scanner;

public class PartyType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyChoice = "";
        String menu = "What is your party affiliation:\nD - Democratic\tR - Republican\tI - Independent\tQ - Quit";

        System.out.println(menu);
        partyChoice = in.nextLine();

        if(partyChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You are a Democratic Donkey");
        }
        else if(partyChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You are a Republican Elephant");
        }
        else if(partyChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You are an Independent Person");
        }
        else if(partyChoice.equalsIgnoreCase("Q"))
        {
            System.out.println("Remember, you volunteered to end this. ");
        }
        else
            System.out.println("This is not a valid choice " + partyChoice + " must be [D,R,I]");

        }
    }
