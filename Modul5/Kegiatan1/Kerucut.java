package Modul5.Kegiatan1;

import java.util.Scanner;

import static java.lang.Math.pow;

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
        Scanner in = new Scanner(System.in);
        System.out.print("Input Radius\t\t: ");
        r = in.nextDouble();
        System.out.print("Input Tinggi\t\t: ");
        t = in.nextDouble();
        System.out.print("Input Tinggi Samping: ");
        s = in.nextDouble();

        Volume  = 1/3 * 22/7 * pow(r, 2) * t;
        setVolume(Volume);
        Luas    = 22/7 * r * (r+s);
        setLuas(Luas);

    }
}
