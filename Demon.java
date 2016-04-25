import java.util.Random;
     /**
     * class Demon has extends class Creature.
     * Demon type has a 5% chance to do magical damage, which is (+50) damage inherited from Creature.
     */   
public class Demon extends Creature
{
    
    public Demon()
    {
       super();
    }
    public Demon(int hp, int str)
    {
       super("Demon" , hp, str);
    }
    /**
     * getDamage method to do magical damage and return damage (+50).
     * @return inheritedDamage. 
     */
    public int getDamage()
    {
        //generates a set of numbers 0 to 19
        int chance = super.randomGenerator.nextInt(20);   
        int inheritedDamage = super.giveDamage();          
        if (chance == 0)
        {
            return inheritedDamage + 50;
        }
        else
        {
            return inheritedDamage;
        }
    }
}
