
package LaundryApllication;

public class Result {
int cuci, bedcoverbiasa,bedcoverking,baju,celana,jas, gordentipis,gordentebal,jasa;

void isicuci(int kg){
    this.cuci = kg *25000 ;
}
void isijas(int jas){
    this.jas = jas *12000 ;
}
void isibedbiasa(int bedbiasa){
    this.bedcoverbiasa = bedbiasa*20000;
}
void isibedking(int bedking){
    this.bedcoverking = bedking*30000;
}
void isibaju(int bj){
    this.baju = bj*12000;
}
void isicelana(int cln){
    this.celana = cln*12000;
}
void isigortipis(int gtp){
    this.gordentipis = gtp*4000;
}
void isigortebal(int gtb){
    this.gordentebal = gtb*5000;
}
void isijasa(int js){
    this.jasa = js;
}
int perhitungan(){
    int hitung = (this.cuci + this.jas +this.bedcoverbiasa+this.bedcoverking+this.baju+this.celana+this.gordentebal+this.gordentipis+this.jasa);
    return hitung;

}

    
}
