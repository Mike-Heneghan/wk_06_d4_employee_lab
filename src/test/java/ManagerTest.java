import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class ManagerTest {
        private Manager keith;
        @Before
        public void before(){
            keith = new Manager("Keith", 890880, 40000.00, "Instructor");
        }

        @Test
        public void hasName(){
            assertEquals("Keith",keith.getName());
        }

        @Test
        public void hasniNumber(){
            assertEquals(890880, keith.getNiNumber());
        }

        @Test
        public void hasSalary(){
            assertEquals(40000.00, keith.getSalary(), 0.001);
        }

        @Test
        public void hasDeptName(){
            assertEquals("Instructor", keith.getDeptName());
        }

        @Test
        public void canRaiseSalary(){
            keith.raiseSalary(500.00);
            assertEquals(40500.00, keith.getSalary(), 0.001);
        }

        @Test
        public void canGetBonus(){
            assertEquals(400.00, keith.payBonus(), 0.001);
        }

    }

