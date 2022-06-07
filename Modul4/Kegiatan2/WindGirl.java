package Modul4.Kegiatan2;

public class WindGirl extends Hero{

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
    public void profile(int a, String b){
        System.out.println("\nName\t: Jett");
        System.out.println("Height\t= "+a +"\nProfile\t= "+b);
    }
}
