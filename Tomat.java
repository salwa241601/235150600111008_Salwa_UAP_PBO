public class Tomat extends Tanaman implements Perawatan{
    
    public Tomat(int masaHidup, int berbuah, double perkembangan){
        masaHidup = 100;
        berbuah = 100;
        perkembangan = 0.25;
    }

    @Override
    public void berkembang() {
 
    }

    @Override
    public void treatment() {
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
