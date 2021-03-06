package Modul4.Kegiatan3;

public abstract class Hero {
    private String name;
    private double healthPoint,attackDamage, defense, realDamage, damageDealt;
    private int level;
    private boolean lifeStatus = false;

    public void attack(String p1_name, String p2_name,
                       double p1_damage, double p2_hp, double p2_defense){
        System.out.printf("\n\n===%s Turn ===" ,p1_name);
        reviewDamage(p1_damage, p2_defense);
        setDamageDealt( p2_hp - getRealDamage());
        if (getDamageDealt()<=0){
            setDamageDealt(0);
        }
        System.out.printf("\n\n%s Real damage \t\t:%.1f", p1_name, getRealDamage());
        System.out.printf("\n\n%s HP remaining \t\t: %.1f",p2_name, getDamageDealt());
        setRealDamage(0);
    }
    public void checkStatus(String name){

        System.out.println("\n\n=== "+ name +" ====");
        System.out.println("Level \t= "+getLevel());
        System.out.printf("\nAttack Damage\t= %.1f\t\t\tLife Status\t= %b",getAttackDamage(), isLifeStatus());
        System.out.printf("\nHealth Point\t= %.1f\t\t\tDefense\t= %.1f",getHealthPoint(), getDefense());

    }

    public void reviewDamage(double damage, double defense){
        setRealDamage((double)damage-defense);
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

    public void setDamageDealt(double damageDealt) {
        this.damageDealt = damageDealt;
    }

    public double getDamageDealt() {
        return damageDealt;
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
