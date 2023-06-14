import java.util.Objects;
import java.util.Scanner;

public class PartyType
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String democrat = "D";
        String republican = "R";
        String independent = "I";
        String other = "O";
        String trash = "";

        System.out.println("What is your party affiliation?");
        System.out.println("(D)emocrat");
        System.out.println("(R)epublican");
        System.out.println("(I)ndependent");
        System.out.println("(O)ther");

        String partyAffiliation = in.nextLine();

        if (Objects.equals(partyAffiliation, democrat))
        {
            System.out.println("You are a Democratic Donkey.");
        } else if (Objects.equals(partyAffiliation, republican))
        {
            System.out.println("You are a Republican Elephant.");
        } else if (Objects.equals(partyAffiliation, independent))
        {
            System.out.println("You are an Independent Person.");
        } else if (Objects.equals(partyAffiliation, other))
        {
            System.out.println("You are an Other or undecided.");
        } else if (Objects.equals(partyAffiliation, trash))
        {
            System.out.println("Please enter a valid option and not " +trash + ".");
        }

        }

    }

    }

            }
            }
            }