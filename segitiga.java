public class segitiga {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public segitiga(double a, double b, double c){
        alas = a;
        tinggi = b;
        sisiMiring = c;
    }
    public void cetakProperti(){
        System.out.println("Alas Segitiga : "+alas);
        System.out.println("Tinggi Segitiga : "+tinggi);
        System.out.println("Sisi Miring Segitiga : "+sisiMiring);
    }
    public void ubahProperti(double a, double b, double c){
        alas = a;
        tinggi = b;
        sisiMiring=c;
    }
    public double hitungLuas(){
        double Luas;
        Luas=0.5*alas*tinggi;
        return Luas;
    }
    public double hitungKeliling(){
        double Kell;
        Kell=alas+tinggi+sisiMiring;
        return Kell;
    }
}
