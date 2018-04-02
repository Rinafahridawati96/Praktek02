package praktek02;

public class kecepatan {
    double waktu;
    double jarak;
    
    void cetakInfo (){
    System.out.println("===================");
    System.out.println("Waktu : "+jarak);
    System.out.println("Jarak : "+waktu);
    System.out.println("===================");
    }
    
    double hitungkecepatan(){
    double kecepatan;
    kecepatan=jarak/waktu;
    return kecepatan;
    
    }
    
    void cetakkecepatan(){
    System.out.println("kecepatannya adalah"+hitungkecepatan());
    }
}
