package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika rijal = new Matematika(4,8);
        
        System.out.println("Hasil Penjumlahan : "+rijal.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+rijal.setPengurangan());
        System.out.println("Hasil Perkalian : "+rijal.setPerkalian());
        System.out.println("Hasil Pembagian : "+rijal.setPembagian());
    }
}
