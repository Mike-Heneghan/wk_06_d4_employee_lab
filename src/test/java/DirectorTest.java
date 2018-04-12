import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director melinda;

    @Before
    public void before(){
        melinda = new Director("Melinda", 8983938, 50000.00, "C.E.O", 500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Melinda",melinda.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(8983938, melinda.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, melinda.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName(){
        assertEquals("C.E.O", melinda.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(500000.00, melinda.getBudget(), 0.001);
    }

    @Test
    public void canGetRaise(){
        melinda.raiseSalary(5000.00);
        assertEquals(55000, melinda.getSalary(), 0.001);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1000.00, melinda.payBonus(),0.001);
    }

}
