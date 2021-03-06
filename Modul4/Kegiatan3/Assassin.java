package Modul4.Kegiatan3;

public class Assassin extends Hero implements CriticalDamage{

    public String name = "Assassin";
    public double healthPoint = 3000;
    public double defense = 300;
    public double attackDamage = 800;

    final public double lvlhp = 90, lvldef = 15, lvlatt = 30;

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
        System.out.println("Assassin\t\t: Silence as a shadow, Fast as the lightning...");
    }
}
