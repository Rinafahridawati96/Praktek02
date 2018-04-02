package praktek02;
public class kecepatanberaksi {
    public static void main(String[] args) {
        kecepatan kec1 = new kecepatan ();
        kec1.jarak = 10;
        kec1.waktu = 22;
        
        
        kec1.cetakInfo();
        System.out.println("kecepatan = "+kec1.hitungkecepatan());
        kec1.cetakkecepatan();
        
        
        kecepatan kec2 = new kecepatan ();
        kec2.cetakInfo();
        
        kecepatan kec3 = new kecepatan (20,5);
        kec3.cetakInfo();
    }
    
}
