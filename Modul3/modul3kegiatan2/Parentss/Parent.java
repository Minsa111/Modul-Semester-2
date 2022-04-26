package Parentss;


public class Parent{
    String Agent, Judul = "Valorant";
    protected String Ulti;
    private int Num;

    public void setNum(int Num){
        this.Num=Num;
    }
    public int getNum(){
        return Num;
    }
    
    public Parent(){
        System.out.println();
    }
    
    public Parent(String Judul){
        System.out.println("Name of game is\t: "+ Judul);
    }

    public Parent(String Map, String Sign){
        System.out.println("Name of game is "+Sign);
        System.out.println("Map is "+Map);
    }


    public void IsaImplementation(String Agent, String Ulti, String Judul){
        System.out.println("Game name\t: "+Judul);
        System.out.println("Agents\t\t: "+Ulti);
        System.out.println("Ultimate\t: "+Agent);
    }
}
