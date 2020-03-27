
package ds;

import org.junit.Test;
import static org.junit.Assert.*;


public class CharacterTest {
    
    public CharacterTest() {
        
    }

    @Test
    public void setUp() {
        Character instance = new Character("John", 20, Race.HUMAN.value());

    }
    /**
     * Test of takeDamage method, of class Character.
     */
    @Test
    public void testTakeDamage() {
        System.out.println("takeDamage");
        Double damage = 2.0;
        Character instance = new Character("John", 20, Race.HUMAN.value());
        instance.takeDamage(damage);
        assertEquals(instance.getHp(), 18);
    }

    /**
     * Test of restoreHp method, of class Character.
     */
    @Test
    public void testRestoreHp() {
        System.out.println("restoreHp");
        int value = 3;
        Character instance = new Character("John", 20, Race.HUMAN.value());
        instance.restoreHp(value);
        assertEquals(instance.getHp(), 23);
    }

}
