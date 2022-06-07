package Modul4.Kegiatan2;

public class Hero {
    private String profile;
    private int height;
    WindGirl Jett = new WindGirl();
    public static void main(String[] args) {

        Hero agent= new Hero();

        agent.setProfile("Human");
        agent.setHeight(175);

        agent.agentInfo();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void agentInfo(){
        System.out.println("Agent Profile:");

        System.out.print("\nName\t= ");
        Jett.Name();
        System.out.println("Height\t= "+height +"\nProfile\t= "+profile);
        Jett.readHero();
    }

}
