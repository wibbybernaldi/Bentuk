public class testBentuk {
    public static void main(String[] args) {
        lingkaran ling1 = new lingkaran(12);

        System.out.println("Ligkaran :");
        ling1.cetakProperti();
        ling1.ubahProperti(15);
        System.out.println("\nProperti Baru :");
        ling1.cetakProperti();
        System.out.println("\nLuas lingkaran : "+ling1.hitungLuas()+"\nKeliling lingkaran : "+ling1.hitungKeliling()+"\n");

        segitiga segti1 = new segitiga(12, 4, 15);

        System.out.println("\nSegitiga :");
        segti1.cetakProperti();
        segti1.ubahProperti(16, 13, 12);
        System.out.println("\nProperti Baru :");
        segti1.cetakProperti();
        System.out.println("\nLuas segitiga : "+segti1.hitungLuas()+"\nKeliling segitiga : "+segti1.hitungKeliling());
    }
}
