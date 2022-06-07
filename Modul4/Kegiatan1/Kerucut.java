package Modul4.Kegiatan1;

import java.util.Scanner;

public class Kerucut extends BangunRuang{
    double Volume, Luas;
    double r, t, s;

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

        System.out.println("===Kerucut===\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input Radius\t\t: ");
        r = in.nextDouble();
        System.out.print("Input Tinggi\t\t: ");
        t = in.nextDouble();
        System.out.print("Input Tinggi Samping: ");
        s = in.nextDouble();

        Volume  = (double)1/3 * 22/7 * r * r * t;
        setVolume(Volume);
        Luas    = (double)22/7 * r * (r+s);
        setLuas(Luas);

    }
}
