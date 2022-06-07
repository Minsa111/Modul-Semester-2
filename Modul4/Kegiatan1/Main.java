package Modul4.Kegiatan1;

public class Main{

    public static void main(String[] args) {
        Kerucut kerucut = new Kerucut();
        Bola    bola    = new Bola();

        kerucut.main();
        bola.main();
        System.out.println("Volume dari Kerucut adalah  = " +kerucut.getVolume());
        System.out.println("Luas dari Kerucut adalah    = " +kerucut.getLuas());
        System.out.println("Volume dari Bola adalah     = " +bola.getVolume());
        System.out.println("Luas dari Bola adalah       = " +bola.getLuas());
    }

}
