import java.util.Scanner;
import java.util.*;


public class FlashcardDriver
{

    public static void main(String[] args)
    {
        //initialize variables
        int cardNum;
        int priority;
        String temp;
        String ans;
        String term;
        String pri;
        Boolean c = false;
        int test2;
        ArrayList<Card> deck= new ArrayList<Card>();

        Scanner kb = new Scanner(System.in);
        System.out.println("How many flash cards do you want to make?" );
        //get users amount of flashcards
        cardNum = kb.nextInt();
        //initializing
        for (int i = 0; i < cardNum; i++)
        {
            System.out.println("what is the term? ");
            if (i == 0)
            {
                 term = kb.nextLine();
            }
            term = kb.nextLine();
            System.out.println("what is the answer? ");
            ans = kb.nextLine();
            System.out.println("Do you struggle with this term? ");
            System.out.println("answer yes or no ");
            pri = kb.nextLine();
            // while (pri != "yes" || pri != "no")
            // {
            //     System.out.println("Do you struggle with this term? ");
            //     System.out.println("answer yes or no ");
            //     pri = kb.nextLine();
            // }
            deck.add(new Card(term, ans, pri, i));

        }

        clearScreen();
        System.out.println("Lets learn those terms !");
        System.out.println();
        System.out.println();
        // Testing
        for (int j = 0; j < 2; j++)
        {
            for (int i = 0; i < cardNum; i++)
            {
                if (c)
                {
                    System.out.println("Correct! ");
                }
                System.out.println(deck.get(i).getTerm()+ "? ");
                temp = kb.nextLine();
                if (temp == deck.get(i).getAnswer())
                {
                    c = true;
                    deck.get(i).priDec();
                }
                else
                {
                    c = false;
                    deck.get(i).priInc();
                    System.out.println("The correct answer is " + deck.get(i).getAnswer());
                    System.out.print("type " + deck.get(i).getAnswer() + ": ");
                    do
                    {
                        temp = kb.nextLine();
                    } while (temp != deck.get(i).getAnswer());
                }
                clearScreen();
            }
        }

        // calculate what cards you need to do over

        // int test2 ==
        // //retesting
        // for


        // Iterator itr= deck.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }


    }

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}