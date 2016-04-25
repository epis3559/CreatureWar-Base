/**
 * Elf class that extends the creature class.
 * @author (Edward Pisco) 
 * @version (4/23/2016)
 */
public class Elf extends Creature
{
    /**
     * Constructor for object of class Elf has characteristics of super class Creature.
     */
    public Elf()
    {
        super();
    }
    /**
     * Constructor with parameters hp and str
     */
    public Elf(int hp, int str)
    {
        super("Elf" , hp, str);
    }
    /**
     * getDamage method that returns inheritedDamage or inheritedDamage x2
     * @return inheritedDamage.
     */
    public int getDamage()
    {
        int chance = super.randomGenerator.nextInt(10);   
        int inheritedDamage = super.giveDamage();          
        if (chance == 0) 
        {
            return 2*inheritedDamage;
        }
        else
        {
            return inheritedDamage;
        }
    }
}