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
        if (p.equals("yes"))
        {
            priority = 5;
        }
        else if (p.equals("no"))
        {
            priority = 3;
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
    public void priSet()
    {
        priority = 3;
    }
    public void mastered()
    {
        repeat = false;
    }
}