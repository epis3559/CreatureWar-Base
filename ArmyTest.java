

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArmyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArmyTest
{
    /**
     * Default constructor for test class ArmyTest
     */
    public ArmyTest()
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
        Army army2 = new Army(20);
        assertEquals(20, army2.GetSize());
    }
}

