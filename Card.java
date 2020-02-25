public class Card
{
    // instance vairables
    int cardNum;
    String term;
    String answer;
    int priority;

    //constructors
    public Card(String t, String a, String p, int n)
    {
        cardNum = n;
        term = t;
        answer = a;
        priority = 0;
        if (p == "yes")
        {
            priority = 2;
        }
        else if (p == "no")
        {
            priority = 1;
        }

    }

    public String showTerm(int cardNum)
    {
        return "N";
    }

    public String getTerm()
    {
        return term;
    }
    public String getAnswer()
    {
        return answer;
    }
    public int getPri()
    {
        return priority;
    }
    public void priInc()
    {
        priority += 2;
    }
    public void priDec()
    {
        priority--;
    }
}