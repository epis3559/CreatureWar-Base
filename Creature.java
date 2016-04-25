import java.util.Random; // Import all necassary packages

/**
 * Creature Class implements hit points and strengths for the creature sub classes. 
 * @author (Edward Pisco) 
 * @version (4/23/2016)
 */
public class Creature
{
    // Variable Initializtion:
    private int STRENGTH;        
    private int HIT_POINTS;
    private final int minStr = 5;
    private final int minhp = 5; 
    private String name = "Creature"; 
    private int HP = 0;  
    private int STR = 0;  
    public Random randomGenerator = new Random();   
    
    /**
     * Constructor for a Creature object default values for hitpoints and strength to 10 each.
     */
    public Creature(){
        HIT_POINTS = 10;
        STRENGTH = 10;
    }
    
    /**
     * Constructor for a Creature object with parameters hp and str to initialize hitPoints and strength.
     */
    public Creature(String n, int hp, int str){
        name = n; 
        setHP(hp);      
        setStrength(str);   
    }
    
    /**
     * Method to diaply the Army of warriors that will battle
     */
    public void viewStats()  
 	{  
 		System.out.println(name);  
 		System.out.println("Hit Points: " + HIT_POINTS + "/" + HIT_POINTS);  
 		System.out.println("Strength: " + STRENGTH+ "/" + STRENGTH);  
 	}  
    /**
     * setHP allows hitPoints to be set
     * @param hp The designated hp, which can't be less than MIN_HP.
     */
    public void setHP(int hp)
    {
        if (hp < minhp)
        {
            HIT_POINTS = 5;
        }
        else
            HIT_POINTS = hp;
    }
    
    public int setDamage()  
 	{  
 	    // Random structure is used to create random strength of the combatants.
 		Random rand = new Random();  
 		int dmg = rand.nextInt(STRENGTH) + 1;  
 		  
 		return dmg;  
 	}  
    public boolean takeDamage(int dmg)  
    {  
     	HIT_POINTS -= dmg;  
     	  
     	if(HIT_POINTS <= 0) return true;  
     	else return false;  
 	}  
    /**
     * setStrength allows strength to be set
     * @param str The designated hp, which cannot be less than MIN_STR.
     */
    public void setStrength(int str)
    {
        if (str < minStr)
        {
            STRENGTH = 5;
        }
        else
            STRENGTH = str;
    }

    /**
     * getDamage is the potential damage the Creature can inflict up to its strength
     * @return damage Potential damage the Creature can inflict
     */
    public int giveDamage(){
        
       return randomGenerator.nextInt(STRENGTH)+1;
    }
    
    /**
     * getName returns names of creatures
     * @return hitPoints.
     */
     public String GetName()  
 	{  
 		return name;  
 	}  
 	
    /**
     * getHP returns hitPoints
     * @return hitPoints.
     */
    public int getHP()
    {
       return HIT_POINTS;
    }

    /**
     * getStrength returns strength
     * @return strength
     */
    public int getStrength()
    {
        return STRENGTH;
    }
     private void SetStats(int hpMax, int sMax)  
 	{  
 		if(hpMax != 0) STRENGTH = 0;  
 		if(sMax != 0) STRENGTH = 0;  
     	if(hpMax < minhp && hpMax != 0)  
 		{  
 			System.out.println("ERROR: HP can not be less than 5!");  
 			return;  
 		}  
     	if(STRENGTH < minStr && STRENGTH != 0)  
 		{  
 			System.out.println("ERROR: Strength can not be less than 5!");  
 			return;  
 		}   
 		Random rand = new Random();  
 		if(hpMax >= minhp)  
 		{   
 			while (HIT_POINTS < minhp)  
 			{  
 				HIT_POINTS = rand.nextInt(hpMax) + 1;  
 				//System.out.println(maxHP);  
 			}  
 		{  
 			// Find a new random max until it is not less than min  
 			while (STRENGTH < minStr)  
 			{  
 				STRENGTH = rand.nextInt(sMax) + 1;  
 				//System.out.println(maxStrength);  
 			}  
 		}  
		HP = HIT_POINTS;  
		STR = STRENGTH;  
	}  
  } 
    /**
     * takeWound method passes an int injury to update hitPoints based on injury
    */
    public void takeWound(int DAMAGE)
    {
        HIT_POINTS = HIT_POINTS - DAMAGE;
    }
}


