public class Kapal extends TransportasiAir{
    protected int JumlahKursi,biaya,String mesin

    public kapal(int JumlahKursi, int biaya, String mesin){
        super(JumlahKursi,biaya,mesin);
        this.Kapal = Kapal;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah"+JumlahKursi+"ditetapkan dengan biaya sebesar Rp"+biaya);
    }

    @Override 
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran"+kecepatan+"knot");
    }
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }
}
