

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DragonKingTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DragonKingTest
{
    /**
     * Default constructor for test class DragonKingTest
     */
    public DragonKingTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testValue()
    {
        DragonKing dragonKi2 = new DragonKing(20, 25);
        dragonKi2.setHP(10);
    }
}

