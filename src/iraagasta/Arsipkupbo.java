
package iraagasta;

public class Arsipkupbo implements Biodata, Nilai{
    public static void main(String[] args) {
 Arsipkupbo ps = new Arsipkupbo();
 ps.nama();
 ps.tempatLahir();
 ps.hobi();
 ps.agama();
 ps.BahasaIndonesia();
 ps.matematika();
    }
    public void nama(){
        System.out.println("Nama Saya = ");
       }
       public void tempatLahir(){
           System.out.println("Tepat Lahir Saya = ");
       }
       public void hobi(){
           System.out.println("Hobi Saya = ");
       }
       public void agama(){
           System.out.println("Agama = ");
       }
       public void BahasaIndonesia(){
          System.out.println("Bahasa Indonesia = ");
       }
       public void matematika(){
           System.out.println("matematika = ");
       }

    @Override
    public void bahasaIndonesia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }

