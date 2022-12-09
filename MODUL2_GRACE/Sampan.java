public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int JumlahKursi, int biaya, int layar){
        super(JumlahKursi,biaya,layar);
        this.layar = layar;
    }
    @Override
    public void  informasi(){
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah"+JumlahKursi+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan sedang berlayar menggunakan"+layar+"layar");
    }
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Trasportasi Air jenis Sampan berlabuh di pantai menggunakan"+jangkar);
    }
}
    

