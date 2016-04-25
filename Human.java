import java.util.Random;
/**
 * Human class that extends the Creature class.
 * @author (Edward Pisco) 
 * @version (4/23/2016)
 */
public class Human extends Creature
{
    // Set max strength and hit point. 
    private final int MAX_HP = 30;
    private final int MAX_STR = 18;

    /**
     *Constructor for object of class Human has characteristics of suoer class Creature.
     */
    public Human()
    {
        super();
    }

    public Human(int hp, int str)
    {
        super("Human", hp, str);
        setHP(hp);      
        setStrength(str);
    }

    /**
     * set hitPoints for Human object to be less than MAX_HP.
     * @param hp hitPoints.
     */
    public void setHP(int hp)
    {
        if (hp > MAX_HP)
        {
            super.setHP(MAX_HP);
        }
        else
        {
            super.setHP(hp);
        }

    }

    /**
     * set strength for Human object to be less than MAX_HP.
     * @param str strength.
     */
    public void setStrength(int str)
    {
        if (str > MAX_STR)
        {
            super.setStrength(MAX_STR);
        }
        else
        {
            super.setStrength(str);
        }

    }
}
