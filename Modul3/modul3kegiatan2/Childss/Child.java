package Childss;


import Parentss.Parent;

public class Child extends Parent{


    public Child(){
        System.out.println();
    }

    public Child(String Map){
        super("Valorant");
        System.out.println("==="+Map+"===");
    }
    public Child(String Map, String Sign){
        super("Bind", "Valorant");
    }
    public void idk(){
        System.out.println();
    }
    public void idk(String a, String b,  int Num){
        System.out.println("Map\t: " +a);
        System.out.println("Agents\t: "+b);
        System.out.println("Rounds\t: "+Num);
    }
}