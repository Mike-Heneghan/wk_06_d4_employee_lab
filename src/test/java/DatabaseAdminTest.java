import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin simon;

    @Before
    public void before(){
        simon = new DatabaseAdmin("Simon", 69797069, 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Simon",simon.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(69797069, simon.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, simon.getSalary(), 0.001);
    }

    @Test
    public void canGetRaise(){
        simon.raiseSalary(5000.00);
        assertEquals(35000.00, simon.getSalary(), 0.001);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300.00, simon.payBonus(), 0.001);
    }
}
