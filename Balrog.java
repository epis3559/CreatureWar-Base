
/**
 * Balrog is a Demon sub class that attacks twice each round.
 */
public class Balrog extends Demon
{
    /**
     * No-arg Constructor for Balrog object
     *
     */
    public Balrog()
    {
        super();
    }
    /**
     * Constructor for Balrog object with parameters to set hitPoints and strength
     * @param hp Use to set hitPoints
     * @param str Use to set strength
     */
    public Balrog(int hp, int str)
    {
        super(hp, str);
    }
}