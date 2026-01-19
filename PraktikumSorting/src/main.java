public class main {
  public static int binarySearch(int[] data, int cari) {
    int awal = 0;
    int akhir = data.length - 1;
    int tengah;

    while (awal <= akhir) {
      tengah = (awal + akhir) / 2;
      if (data[tengah] == cari) {
        return tengah;
      } else if (data[tengah] < cari) {
        awal = tengah + 1;
      } else {
        akhir = tengah - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = data.length;
    int[] dataDicari = { 4, 7, 2, 10, 5 }; // Array data yang ingin dicari

    System.out.println("Data array:");
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println("\n");

    // Mencari setiap data dalam array dataDicari
    for (int i = 0; i < dataDicari.length; i++) {
      int cari = dataDicari[i];
      System.out.println("Mencari data: " + cari);

      int posisi = binarySearch(data, cari);

      if (posisi == -1) {
        System.out.println("Data tidak ditemukan");
      } else {
        System.out.println("Data ditemukan pada indeks ke: " + posisi);
      }
      System.out.println();
    }
  }
}
