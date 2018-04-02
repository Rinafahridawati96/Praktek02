package praktek02;
public class kecepatanberaksi {
    public static void main(String[] args) {
        kecepatan kec1 = new kecepatan ();
        kec1.jarak = 10;
        kec1.waktu = 22;
        
        
        kec1.cetakInfo();
        System.out.println("kecepatan = "+kec1.hitungkecepatan());
    }
    
}
