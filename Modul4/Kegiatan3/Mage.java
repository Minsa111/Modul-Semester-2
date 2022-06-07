package Modul4.Kegiatan3;

public class Mage extends Hero implements MagicalDamage {

    public String name = "Mage";
    public double healthPoint = 2500;
    public double defense = 200;
    public double attackDamage = 700;

    final public double lvlhp = 85, lvldef = 10, lvlatt = 35;

    @Override
    public void spawnIntro(int level) {
        setName(name);
        setHealthPoint(healthPoint);
        setAttackDamage(attackDamage);
        setDefense(defense);
        setName(name);

        if (level > 0) {
            setLevel(level);
            setHealthPoint(getHealthPoint() + lvlhp * level);
            setAttackDamage(getAttackDamage() + lvlatt * level);
            setDefense(getDefense() + lvldef * level);
            setAttackDamage(getAttackDamage() + bonusDamage * getAttackDamage());
        }else if (level==0){
            setAttackDamage(getAttackDamage() + bonusDamage * getAttackDamage());
        }
        System.out.println("Mage\t\t\t: Feel the wrath of my magic...");
    }

}

