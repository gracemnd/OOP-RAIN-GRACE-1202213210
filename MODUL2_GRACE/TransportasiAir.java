public class TransportasiAir{
    protected int JumlahKursi, biaya;

    public TransportasiAir(int JumlahKursi, int biaya){
        this.JumlahKursi = JumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah"+JumlahKursi+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui berlabuh dipantai");
    }
}