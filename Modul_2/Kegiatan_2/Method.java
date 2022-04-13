package Kegiatan_2;

import java.util.Scanner;

public class Method {
    private double diagonal1;
    private double diagonal2;
    private double sisi;
    private int ans;
    private double result;

    public void setDiag1(double diagonal1){
        this.diagonal1 = diagonal1;
    }
    public void setDiag2(double diagonal2){
        this.diagonal2 = diagonal2;
    }
    public void setSide(double sisi){
        this.sisi = sisi;
    }

    public double getDiag1(){
        return diagonal1;
    }
    public double getDiag2(){
        return diagonal2;
    }
    public double getSide(){
        return sisi;
    }

    public void main() {
        Scanner in = new Scanner(System.in);
        Method method = new Method();

        System.out.println("Calculate rhomb\n\n");
        System.out.print("First Diagonal\t:");
        diagonal1 = in.nextDouble();
        method.setDiag1(diagonal1);
        System.out.print("Second Diagonal\t:");
        diagonal2 = in.nextDouble();
        method.setDiag2(diagonal2);
        System.out.print("Side\t\t:");
        sisi = in.nextDouble();
        method.setSide(sisi);

        System.out.print("How do you want it to be calculated?\n1. Area\n2. Perimeter\n\nAnswer it by the number:");
        ans = in.nextInt();
        
        switch(ans){
            case 1:
                result = getDiag1()*getDiag2()/2;
                System.out.println("\n\nThe area of the rhomb is: " + result);
            break;
            case 2:
                result = getSide()*4;
                System.out.println("\n\nThe parimeter of the rhomb is: "+ result );
            break;
            default:
                System.out.println("Please enter a valid answer!");
            break;
        }
    in.close();
    }
}
