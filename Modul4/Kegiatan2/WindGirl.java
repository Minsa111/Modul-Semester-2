package Modul4.Kegiatan2;

public class WindGirl {

    public void readHero() {
        JettAbility ability = new JettAbility();
        Mobility mobility = new Mobility();
        System.out.println("\n===Jett's Abilities===");
        ability.Smoke();
        ability.Dash();
        ability.Windblade();
        ability.Windfall();
        System.out.println("\n===Jett's basic mobilities===");
        mobility.Walk();
        mobility.Jump();
        mobility.Crouch();
    }
    public void Name(){
        System.out.println("Jett");
    }
}
