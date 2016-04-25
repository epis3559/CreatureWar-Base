/**
 * Class Army populates 2 Army collections that will battle.
 * @author (Edward Pisco) 
 * @version (4/23/16)
 */
import java.util.Random; 
import java.util.ArrayList;  // Import all neccessary packages
 
 public class Army  
 { 
 private ArrayList<Creature> warriors = new ArrayList<Creature>();  
 private Creature[] WarriorsW =  
 
 {  
        new DragonKing(15,17), // Super human strength healing powers
        new Human(15, 15),     // peak human strength.
        new Elf(10, 10),       // 10% chance to do magical damage 
        new Demon(10,10),      // 5% chance to do magical damage
        new CyberDemon(15, 15),  // 5% chance to do magical damage
        new Balrog(15, 15),    // Attacks TWICE each round
      
 } ; 
 
     /**
     * Method that displays the size of the Armies.
     */

 public Army(int size)  
    {  
       createArmy(size); 
    }       
 private void createArmy(int size)  
    { 
        Random rand = new Random();  
        int num = 0;  
          
        for(int i = 0; i < size; i++)  
        {  
            num = rand.nextInt(WarriorsW.length);  
            warriors.add(WarriorsW[num]);  
       
        }
    }  
    /**
     * Methods to view the Armies.
     */
    
    public void viewArmy()  
 {  
        for(int i = 0; i < warriors.size(); i++)  
        {  
            System.out.println("Army" + (i + 1) + ":");  
            warriors.get(i).viewStats();  
        }  
    }  
 public void viewWarriors(int i)  
    {  
        warriors.get(i).viewStats();  
    }  
 public int Attack(int i)  
    {  
        return warriors.get(i).setDamage();  
    }  
 public boolean Defend(int i, int dmg)  
    {    
        boolean vanquished = warriors.get(i).takeDamage(dmg);  
          
        return vanquished;  
    }  
      
 public int GetSize()  
    {  
        return warriors.size();  
    }  
}
