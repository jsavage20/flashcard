import java.util.Scanner;
import java.util.*;


public class FlashcardDriver
{

    public static void main(String[] args)
    {
        //initialize variables
        int cardNum;
        int priority;
        int mast = 0;
        String temp;
        String ans;
        String term;
        String pri;
        //used for correct questions
        Boolean c = false;
        //when the terms are mastered
        Boolean master = false;
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
            do{
                System.out.println("Do you struggle with this term? ");
                System.out.println("answer yes or no ");
                pri = kb.nextLine();
            } while(!pri.equals("yes") && !pri.equals("no"));
            deck.add(new Card(term, ans, pri, true));
        }

        clearScreen();
        System.out.println("Lets learn those terms !");
        System.out.println();
        System.out.println();
        // Testing
        do
        {
            mast = 0;
            for (int j = 0; j < 2; j++)
            {
                for (int i = 0; i < cardNum; i++)
                {

                    if (c){
                        System.out.println("Correct! ");
                        System.out.println();
                    }
                    if (deck.get(i).getPri() >= 0)
                    {
                        System.out.println(deck.get(i).getTerm()+ "? ");
                        temp = kb.nextLine();
                        if (temp.equals(deck.get(i).getAnswer()))
                        {
                            c = true;
                            deck.get(i).priDec();
                        }
                        else if (!temp.equals(deck.get(i).getAnswer()))
                        {
                            c = false;
                            deck.get(i).priInc();
                            System.out.println("The correct answer is " + deck.get(i).getAnswer());
                            System.out.print("type " + deck.get(i).getAnswer() + ": ");
                            do
                            {
                                temp = kb.nextLine();
                            } while (!temp.equals(deck.get(i).getAnswer()));
                        }
                    }

                    clearScreen();
                }
                Collections.shuffle(deck);
                c = false;
            }
            //make sure the quizlet isnt over
            for (int i = 0; i < cardNum; i++)
            {
                if (deck.get(i).getPri() < 0)
                {
                    mast++;
                    deck.get(i).mastered();
                }
            }
            if (mast == cardNum)
            {
                master = true;
                System.out.println("you have mastered all the terms!");
                System.out.println("Would you like to test again?");
                temp = kb.nextLine();
                if (temp.equals("yes"))
                {
                    for (int i = 0; i < cardNum; i++)
                    {
                        deck.get(i).priSet();
                    }
                    master = false;
                }
                else {
                    break;
                }
                do {
                System.out.println("Would you like to shuffle? yes or no");
                temp = kb.nextLine();
                } while(!temp.equals("yes") && !temp.equals("no"));
                if (temp.equals("yes"))
                {
                    Collections.shuffle(deck);
                    System.out.println("Shuffled!");
                    System.out.println();
                }
            }
            mast = 0;
            //shuffles and asks if wants to take again

            if (master = false)
            {
                System.out.println("Would you like to test again?");
                temp = kb.nextLine();
                if (temp.equals("yes"))
                {
                    for (int i = 0; i < cardNum; i++)
                    {
                        deck.get(i).priSet();
                    }
                    master = false;
                }
                else{
                    break;
                }
            }

        } while (master == false);
        System.out.println("Thank you for usuing flashcard.java");

    }

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}