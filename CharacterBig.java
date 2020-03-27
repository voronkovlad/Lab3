package ds;


public class CharacterBig {

    private String name;
    private int hp;
    private String race;
    private int level;
    private Boolean status;
    private double attack;
    private int xp;

    public CharacterBig() {
        this.name = "";
        this.hp = 0;
        this.race = Race.HUMAN.value();
        this.level = 0;
        this.status = CharacterStatus.ALIVE.value();
        this.attack = 0;
        this.xp = 0;
    }

    public CharacterBig(String name, int hp, String race) {
        this.name = name;
        this.hp = hp;
        this.race = Race.HUMAN.value();
        this.level = 1;
        this.status = CharacterStatus.ALIVE.value();
        this.attack = 10;
        this.xp = 0;
    }

    
    
    /** 
     * @return String
     */
    public String getName() {
        return this.name;
    }

    
    /** 
     * @return double
     */
    public double getAttack() {
        return this.attack;
    }

    
    /** 
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    
    /** 
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    
    /** 
     * @return int
     */
    public int getHp() {
        return this.hp;
    }
    
    
    /** 
     * @return Boolean
     */
    public Boolean getStatus() {
        return this.status;
    }

    
    /** 
     * @param xp
     */
    public void addXp(int xp) {
        this.xp += xp;
    }

    public void checkStatus() {
        if (this.hp <= 0) {
            this.hp = 0;
            this.status = CharacterStatus.DEAD.value();
        }
    }

    
    /** 
     * @param damage
     */
    public void takeDamage(Double damage){
        this.hp -= damage;
        this.checkStatus();
    }

    
    /** 
     * @param value
     */
    public void restoreHp(int value) {
        this.hp += value;
    }

    public void levelUp(){
    if ((this.status == CharacterStatus.DEAD.value()) || (this.xp < 10)){
        return;
    }
        this.xp -= 10;
        this.level += 1;
        this.attack += 2;
        this.levelUp();
    }
    
}
