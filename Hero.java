package ds;

public class Hero extends Character {
    private String heroClass;
    private double weapon;
    private int mana;

    public Hero(String name, int hp, String race, String heroClass) {
        super(name, hp, race);
        this.heroClass = HeroClass.MAGE.value();
        this.weapon = Weapon.NOTHING.value();
        this.mana = 10;
    }

    
    /** 
     * @return int
     */
    public int getMana() {
        return this.mana;
    }
    
    /** 
     * @param enemy
     */
    public void attack(Hero enemy) {
        System.out.println(this.getName() + "attacks" + enemy.getName());
        enemy.takeDamage(this.getAttack() + this.weapon);
    }

    
    /** 
     * @param weapon
     */
    public void takeWeapon(double weapon) {
        this.weapon = weapon;
    }

    
    /** 
     * @param character
     */
    public void useEasySkill(Character character) {
        if (this.mana >= 1) {
            this.mana -= 1;
            character.restoreHp(-2);
        }
        else {
            System.out.println("No mana");
        }
    }

    
    /** 
     * @param enemy
     */
    public void useNormalSkill(Hero enemy) {
        if (this.mana >= 5) {
            this.mana -= 5;
            enemy.restoreHp(-8);
        }
        else {
            System.out.println("No mana");
        }
    }


}