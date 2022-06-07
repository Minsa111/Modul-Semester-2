package Modul4.Kegiatan3;

public abstract class Hero {
    private String name;
    private double healthPoint,attackDamage, defense, realDamage;
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

    public void reviewDamage(double damage, double defense){
        realDamage = damage - defense;
    }

    public void setRealDamage(double realDamage) {
        this.realDamage = realDamage;
    }

    public double getRealDamage() {
        return realDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
    public abstract void summonHero(int level);

}
