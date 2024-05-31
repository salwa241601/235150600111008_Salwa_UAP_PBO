public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private double perkembangan;
    private double prosesBerbuah;

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
    
    public abstract void berkembang();

    public String status(){
        if (getLamaHidup() >= getMasaHidup()) {
            System.out.println("Mati");
        } return "Hidup";
    }
    public String toString(){
        System.out.println("Masa Hidup : " + masaHidup);
        System.out.println("Lama Hidup : " + getLamaHidup());
        System.out.println("Buah yang dihasilkan : " + getBerbuah());
        System.out.println( "Status tanaman : " + status());
        return toString();
    }
}
