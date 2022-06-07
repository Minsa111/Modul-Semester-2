package Modul4.Kegiatan3;

public class Tank extends Hero{

    public String name = "Tank";
    public double healthPoint = 7000;
    public double defense = 500;
    public double attackDamage = 500;

    final public double lvlhp = 200, lvldef = 15, lvlatt = 20;


    @Override
    public void spawnIntro(int level) {
        setHealthPoint(healthPoint);
        setAttackDamage(attackDamage);
        setDefense(defense);
        setName(name);

        setLevel(level);
        if(level>0){
            setHealthPoint(getHealthPoint()+lvlhp*level);
            setAttackDamage(getAttackDamage()+lvlatt*level);
            setDefense(getDefense()+lvldef*level);
        }
        System.out.println("Tank\t\t\t: TRY ME!!!");
    }
}
