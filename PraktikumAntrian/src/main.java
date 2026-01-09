public class main {
public static void main(String[] args) {
  Antrian at = new Antrian(5);
  at.masuk(10);
  at.masuk(20);
  at.masuk(40);
  at.masuk(50);
  at.keluar();

  while (!at.isEmpty()){
    long n = at.keluar();
    System.out.println(n);
  }
  System.out.println();
}
}
