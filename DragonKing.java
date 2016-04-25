import java.util.Random; 
/**
 * The Dragon King takes - 15 damage from all attacks.
 * @author (Edward Pisco) 
 * @version (4/23/2016)
 */
public class DragonKing extends Creature
{
    Random rng;
 /**
 * DragonKing method that declares @param hp(hitpoints) and stregth.
 */ 
 public DragonKing(int hp, int strength)  
    {  
        super("Dragon King", hp, strength);  
    } 
 /**
 * Method that allows Dragon King to take considerable damage.
 * Allowing for regenerative healing powers.
 */
public int damage()
{
   int dam = super.setDamage();
   dam = dam - 15;
   return dam;
}
}