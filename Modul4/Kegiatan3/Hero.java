package Modul4.Kegiatan3;

public abstract class Hero {
    private double healthPoint,attackDamage, defense;
    private int level;
    private boolean lifeStatus;

    public void attack(String p1_name, String p2_name,double p1_damage, double p2_hp, double p2_defense){

    }
    public void checkStatus(String name){

        System.out.println("\n=== "+ name +" ====");
        System.out.println("Level \t= "+getLevel());
        System.out.printf("\nAttack Damage\t= %.1f\t\tLife Status\t= %b",getAttackDamage(), isLifeStatus());
        System.out.printf("\nHealth Point\t= %.1f\t\tDefense\t= %.1f",getHealthPoint(), getDefense());

    }

    public void reviewDamage(double damage){
        this.attackDamage = damage;
    }

    public void setHealthPoint(double healthPoint){
        this.healthPoint = healthPoint;
    }

    public double getHealthPoint(){
        return healthPoint;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAttackDamage(){
        return attackDamage;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getDefense(){
        return defense;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLifeStatus(boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
    }
    public boolean isLifeStatus() {
        return lifeStatus;
    }
    public abstract void spawnIntro(int level);

}
