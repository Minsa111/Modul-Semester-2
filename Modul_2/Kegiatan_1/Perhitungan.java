package Kegiatan_1;
import java.util.Scanner;

public class Perhitungan{
    private int NilaiProgdas;
    private int NilaiKalkulus;
    private int NilaiOrkom;
    private double Hasil;

    public void setNilaiProgdas(int NilaiProgdas){
        this.NilaiProgdas = NilaiProgdas;
    }
    public int getNilaiProgdas(){
        return NilaiProgdas;
    }
    public void setNilaiKalkulus(int NilaiKalkulus){
        this.NilaiKalkulus = NilaiKalkulus;
    }
    public int getNilaiKalkulus(){
        return NilaiKalkulus;
    }
    public void setNilaiOrkom(int NilaiOrkom){
        this.NilaiOrkom = NilaiOrkom;
    }
    public int getNilaiOrkom(){
        return NilaiOrkom;
    }
    public void hitungRata(){
        Hasil = (double)(getNilaiKalkulus() + getNilaiOrkom() + getNilaiProgdas()) / 3;
        System.out.println("\n\nAverage : " + Hasil);
    }
    public void cekNilai(){
        if (Hasil>70){
            System.out.println("Ayy congrats, you passed\n");
        }else{
            System.out.println("I am sorry but, you failed.\n");
        }
    }
    public void main(){
        Perhitungan calculate = new Perhitungan();
        Scanner in = new Scanner(System.in);

        System.out.print("\n\nProgdas Score : ");
        NilaiProgdas = in.nextInt();
        System.out.print("Calculus Score: ");
        NilaiKalkulus = in.nextInt();
        System.out.print("Orkom Score   : ");
        NilaiOrkom = in.nextInt();
        setNilaiProgdas(NilaiProgdas);
        setNilaiKalkulus(NilaiKalkulus);
        setNilaiOrkom(NilaiOrkom);
        System.out.println("\n\nProgdas score\t: " +getNilaiProgdas());
        System.out.println("Calculus score\t: " +getNilaiKalkulus());
        System.out.println("Orkom score\t: " +getNilaiOrkom());
        hitungRata();
        cekNilai();
        in.close();
    }

}