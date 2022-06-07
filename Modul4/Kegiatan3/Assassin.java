package Modul4.Kegiatan3;

public class Assassin extends Hero implements CriticalDamage{

    public String Name = "Assassin";
    public double healthPoint = 3000.0;
    public double defense = 300.0;
    public double attackDamage = 800.0;

    final public double lvlhp = 90.0, lvldef = 15.0, lvlatt = 30.0;

    @Override
    public void spawnIntro(int level) {
        setHealthPoint(healthPoint);
        setAttackDamage(attackDamage);
        setDefense(defense);

        setHealthPoint(getHealthPoint()+lvlhp*level);
        setAttackDamage(getAttackDamage()+lvlatt*level);
        setDefense(getDefense()+lvldef*level);
        System.out.println(getDefense()+" "+getAttackDamage()+" "+getHealthPoint());
        System.out.println("Silence as a shadow, Fast as the lightning...");

    }
}
