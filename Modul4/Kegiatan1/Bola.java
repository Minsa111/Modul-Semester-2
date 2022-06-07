package Modul4.Kegiatan1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Bola extends BangunRuang {

double Volume, Luas, r;
    public void setVolume(double Volume){
        this.Volume = Volume;
    }
    @Override
    double getVolume() {
        return Volume;
    }

    public void setLuas(double Luas){
        this.Luas = Luas;
    }
    @Override
    double getLuas() {
        return Luas;
    }
    public void main(){

        System.out.println("\n\n===Bola===\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input Radius\t\t: ");
        r = in.nextDouble();


        Volume  = (double)4/3 * 22/7 * pow(r,3);
        setVolume(Volume);
        Luas    = (double)4* 22/7 * pow(r,2);
        setLuas(Luas);

    }
}
