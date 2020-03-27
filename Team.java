package ds;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Team {
    private String name;
    List<Character> members;
    Character [] finalArray;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<Character>(); 
    }

    
    /** 
     * @param character
     */
    public void addMember(Character character) {
        members.add(character);
    }

    public void goToRaid() {
        double luck = new Random().nextDouble();
        Character [] array = members.toArray(new Character[members.size()]);
        if (luck < 0.5) {

            System.out.println("Everyone died.");

            for(int i = 0; i < array.length; i++) {
                array[i].setStatus(CharacterStatus.DEAD.value());
                array[i].setHp(0);
            }

        }
        else {
            for(int i = 0; i < array.length; i++) {
                array[i].restoreHp((int)java.lang.Math.round(array[i].getHp() * luck));
                array[i].checkStatus();
                if (array[i].getStatus() == CharacterStatus.ALIVE.value()) {
                    array[i].addXp((int)luck * 10);
                }
            }
        }
        this.finalArray = array;
    }

    
    /** 
     * @param array
     * @param search
     * @return int
     */
    public static int indexOf(Character[] array, Character search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }

    
    /** 
     * @param member
     * @param hp
     */
    public void healMember(Character member, int hp) {
        Character [] array = members.toArray(new Character[members.size()]);
        array[indexOf(array, member)].restoreHp(hp);
        this.finalArray = array;
    }

    
    /** 
     * @param member
     * @param hp
     */
    public void damageMember(Character member, int hp) {
        Character [] array = members.toArray(new Character[members.size()]);
        array[indexOf(array, member)].restoreHp(hp);
        array[indexOf(array, member)].checkStatus();
        this.finalArray = array;
    }

    public void levelUpEveryone() {
        Character [] array = members.toArray(new Character[members.size()]);
        for(int i = 0; i < array.length; i++) {
            array[i].levelUp();
        }
        this.finalArray = array;
    }

}
