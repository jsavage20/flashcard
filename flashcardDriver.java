import java.util.Scanner;
import java.util.*;


public class flashcardDriver
{

    public static void main(String[] args)
    {
        //initialize variables
        int cardNum;
        int priority;
        String answer;
        String term;
        String pri;
        int cardNum;
        ArrayList<Card> = new ArrayList<Card>();

        Scanner kb = new Scanner(System.in);
        System.out.println("How many flash cards do you want to make?" );
        //get users amount of flashcards
        cardNum = kb.nextInt();
        for (int i = 0; i < cardNum; i++)
        {
            System.out.println("what is the term? ");
            term = kb.nextLine();
            System.out.println("what is the answer? ");
            answer = kb.nextLine();
            System.out.println("Do you struggle with this term? ");
            System.out.println("answer yes or no ")
            pri = kb.nextLine();
            Card c = new Card(term, answer, pri, i);
        }


    }

}