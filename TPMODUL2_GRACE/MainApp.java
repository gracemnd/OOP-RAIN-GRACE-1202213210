package TPMODUL_GRACE;

public class MainApp {
    public static void main(String[]args){
        Perangkat device = new Perangkat("Adata" ,2, 1.80);
        Laptop laptop1 = new Laptop("Seagate",8,2.40,true);
        Handphone ponsel = new Handphone("Sandisk",3,2.20,false);

        device.informasi();

        laptop1.informasi();
        laptop1.bukaGame("Dota 2");
        laptop1.kirimEmail("niceyuk@gmail.com");
        laptop1.kirimEmail("aanarji@gmail.com","rusmangc@gmail.com");

        ponsel.informasi();
        ponsel.telfon(628122122);
        ponsel.kirimSMS(62852112);
        ponsel.kirimSMS(628121212,629292211);
    }
}
