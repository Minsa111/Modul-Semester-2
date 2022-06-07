package Modul4.Kegiatan2;

public class Hero {
    private String profile;
    private int height;
    public static void main(String[] args) {

        Hero agent= new Hero();
        WindGirl Jett = new WindGirl();
        agent.setProfile("Human");
        agent.setHeight(175);

        agent.agentInfo();

        Jett.profile(agent.getHeight(), agent.getProfile());

        Jett.readHero();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getHeight() {
        return height;
    }

    public String getProfile() {
        return profile;
    }

    public void agentInfo(){
        System.out.println("Agent Profile:");

    }
}
