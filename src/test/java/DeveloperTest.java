import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer mike;

    @Before
    public void before(){
        mike = new Developer("Mike", 56685489, 25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Mike",mike.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(56685489, mike.getNiNumber());
    }

    @Test
    public void hadSalary(){
        assertEquals(25000.00, mike.getSalary(), 0.001);
    }

    @Test
    public void canGetRaise(){
        mike.raiseSalary(500.00);
        assertEquals(25500.00, mike.getSalary(), 0.001);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250.00, mike.payBonus(), 0.01);
    }
}
