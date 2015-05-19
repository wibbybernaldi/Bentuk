public class segitiga {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public segitiga(double a, double b, double c, double d, double e){
        alas = a;
        tinggi = b;
        sisiA = c;
        sisiB = d;
        sisiC = e;
    }
    public void cetakProperti(){
        System.out.println("Alas Segitiga : "+alas);
        System.out.println("Tinggi Segitiga : "+tinggi);
        System.out.println("Sisi A Segitiga : "+sisiA);
        System.out.println("Sisi B Segitiga : "+sisiB);
        System.out.println("Sisi C Segitiga : "+sisiC);
    }
    public void ubahProperti(double a, double b, double c, double d, double e){
        alas = a;
        tinggi = b;
        sisiA = c;
        sisiB = d;
        sisiC = e;
    }
    public double hitungLuas(){
        double Luas;
        Luas=0.5*alas*tinggi;
        return Luas;
    }
    public double hitungKeliling(){
        double Kell;
        Kell=sisiA+sisiB+sisiC;
        return Kell;
    }
}
