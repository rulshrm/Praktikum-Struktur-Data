public class Antrian {
private int ukuran;
private long[] antrian;
private int depan;
private int belakang;
private int nitem;

public Antrian(int s) {
    ukuran = s;
    antrian = new long[ukuran];
    depan = 0;
    belakang = -1;
    nitem = 0;
}

public void masuk(long j){
  if(depan==ukuran -1) {
    belakang = -1;
  }
  antrian[++belakang] = j;
  nitem++;
}

public long keluar(){
  long temp = antrian[depan++];
  if(depan==ukuran)
    depan=0;
  nitem--;
  return temp;
}

public long peekDepan(){
  return antrian[depan];
}

public boolean isEmpty(){
  return (nitem==0);
}

public boolean isFull(){
  return (nitem==ukuran);
}

public int ukuran(){
  return nitem;
}
}
