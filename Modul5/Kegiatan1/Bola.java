package Modul5.Kegiatan1;

public class Bola extends BangunRuang {


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
}
