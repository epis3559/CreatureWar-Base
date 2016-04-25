
/**
 * Class War populates 2 Armies that battle.
 * Program loops until at least one of the collections are empty. 
 * A battle of attrition between 2 armies.
 * @author (Edward Pisco) 
 * @version (4/23/2016)
 */
public class WarBattle 
 {  
    public WarBattle() 
    {  
        int size = 20; 
        Army Army_1 = new Army(size);  
        Army Army_2 = new Army(size);    
 		System.out.println("Army 1:");  
 		Army_1.viewArmy();  
 		System.out.println();  
 		System.out.println("Army 2:");  
 		Army_2.viewArmy();  
 		System.out.println();  
        System.out.println("Final Battle");  
        boolean warOver = false;  
        int armyArmy1  = 0;  
        int armyArmy2 = 0;  
        
 /** While loop to control the results of the batttle between 2 armies.
 *Based on the boolean condition we have the results of the battle.
 */

    while(!warOver)  
        {  
            
          System.out.println("Army 1 attacks" + armyArmy1);  
          int dmg = Army_1.Attack(armyArmy1);  
          Army_1.viewWarriors(armyArmy1);  
          System.out.println("damage meter: " + dmg); 
          boolean vanquished = Army_2.Defend(armyArmy2, dmg);  
          
          if(vanquished)  
            {  
                armyArmy2++;  
                System.out.println("Army 2 has been vanquished!");  
            }  
          if(armyArmy2 >= size)  
            {  
                warOver = true;  
                System.out.println("Army 1 are the ultimate warriors!");  
                break;  
            }  
              
            System.out.println("Army 2 attacks" + armyArmy2);  
            dmg = Army_2.Attack(armyArmy2);  
            Army_2.viewWarriors(armyArmy2);  
            System.out.println("damage meter: " + dmg); ;  
            vanquished = Army_1.Defend(armyArmy1, dmg);  
        
            if(vanquished)  
            {  
                armyArmy2++;  
                System.out.println("Army 1 has been vanquished!");  
            }  
            if(armyArmy1 >= size)  
            {  
                warOver = true;  
                System.out.println("Army 2 are the ultimate warriors!");  
                break;  
            }  
        }  
    }  
 } 

