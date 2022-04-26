package Parentss;

import Childss.Child;

public class Main {
    public static void main(String[] args) {
        Child b = new Child();;
        String Title ="Valorant";
        String AgentName = "Jett";
        String Ultimate = "Knives";
        
        b.setNum(20);
        new Child("Bind");
        b.IsaImplementation(AgentName, Ultimate, Title);
        System.out.println("\n\nAcces modifier implementation");
        b.idk("Bind", "Jett", b.getNum());
    }
}