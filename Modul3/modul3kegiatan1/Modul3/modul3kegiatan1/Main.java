package Modul3.modul3kegiatan1;


public class Main{
    public static void main(String[] args) {
        Jett jett = new Jett();
        Sage sage = new Sage();
        Omen omen = new Omen("Omen","Controller", "Teleport", "Ghost");
        jett.Profile("Jett", "Duelist", "Knives", "Sheriff");
        sage.Profile("Sage", "Sentinel", "Revive", "Classic");
        jett.NameofGame();
    }
}
