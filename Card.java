public class Card
{
    // instance vairables
    Boolean repeat;
    String term;
    String answer;
    int priority;

    //constructors
    public Card(String t, String a, String p, Boolean n)
    {
        repeat = n;
        term = t;
        answer = a;
        priority = 0;
        if (p == "yes")
        {
            priority = 3;
        }
        else if (p == "no")
        {
            priority = 2;
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
    public Boolean getRepeat()
    {
        return repeat;
    }
    public void mastered()
    {
        repeat = false;
    }
}