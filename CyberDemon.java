/**
 * CyberDemon class that extends and inherits Demon class characteristics 
 */
public class CyberDemon extends Demon
{
     /**Constructor for CyberDemon object
     */
    public CyberDemon()
    {
        super();
    }
    /**
     * Constructor for CyberDemon object with parameters to set hitPoints and strength
     * @param hp to set hitPoints
     * @param str to set strength
     */
    public CyberDemon(int hp, int str)
    {
        super(hp, str);
    }
}