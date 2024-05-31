public class Persik extends Tanaman implements Perawatan{
    public Persik(int masaHidup, int berbuah, double perkembangan){
        masaHidup = 180;
        berbuah = 250;
        perkembangan = 0.15;
    }

    @Override
    public void treatment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'treatment'");
    }

    @Override
    public void berkembang() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'berkembang'");
    }
}
