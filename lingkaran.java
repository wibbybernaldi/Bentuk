public class lingkaran {
    private double diameter;

    public lingkaran(double a){
        diameter = a;
    }
    public void cetakProperti(){
        System.out.println("Diameter dari lingkaran : "+diameter);
    }
    public void ubahProperti(double b){
        diameter = b;
    }
    public double hitungLuas(){
        double Luas;
        Luas=(0.5*diameter)*(0.5*diameter)*Math.PI;
        return Luas;
    }
    public double hitungKeliling(){
        double Kell;
        Kell=diameter*Math.PI;
        return Kell;
    }
}
