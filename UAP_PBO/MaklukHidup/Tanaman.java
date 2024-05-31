package MaklukHidup;

public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private double perkembangan;
    private double prosesBerbuah;


    public void perkembangan (){

    }

    public String status (){
        return "Tanaman [masaHidup=" + masaHidup + ", lamaHidup=" + lamaHidup + ", masaHidup" + "]";
    }

    @Override
    public String toString() {
        return "Tanaman [masaHidup=" + masaHidup + ", lamaHidup=" + lamaHidup + ", berbuah=" + berbuah
                + ", perkembangan=" + perkembangan + ", prosesBerbuah=" + prosesBerbuah + "]";
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    

    
}
