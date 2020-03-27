package ds;


import org.junit.Test;
import static org.junit.Assert.*;


public class HeroTest {
    private Hero hero;
    private Hero enemy;
    
    public HeroTest() {
        this.hero = new Hero("Anna", 20, Race.GREMLIN.value(), HeroClass.PALADIN.value());
        this.enemy = new Hero("Clay", 20, Race.HUMAN.value(), HeroClass.MAGE.value());
    }
    
    
    @Test
    public void testUseNormalSkill() {
        this.hero.useNormalSkill(this.enemy);
        assertEquals(hero.getMana(), 5);

    }
    
}
