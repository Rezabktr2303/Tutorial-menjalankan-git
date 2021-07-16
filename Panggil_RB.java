import java.util.Scanner;

public class Panggil_RB{
	public static void main(String[]args){
		int key=0;
		
		Scanner scn =  new Scanner(System.in);
		
		PPanjang_rez PersegiP = new PPanjang_rez(5,4);
		ling_rez Lingkaran = new ling_rez(14);
		balok_rez Balok = new balok_rez(5,3,4);
		tabung_rez Tabung = new tabung_rez(10,10);
		
		System.out.println();
		PersegiP.cetak();
		System.out.println();
		Lingkaran.cetak();
		System.out.println();
		Balok.cetak();
		System.out.println();
		Tabung.cetak();
		System.out.println();
		
		if(!(key>5||key<0)){
			do{
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("------------------------------");
				System.out.println("------------------------------");
				System.out.println("Pilih : \n1.Persegi Panjang \n2.Balok \n3.Lingkaran \n4.Tabung \n5.Keluar");
				System.out.println("\n------------------------------");
				System.out.println("Masukkan pilihan anda :");
				key=scn.nextInt();
				
				switch(key){
					case 1:
					System.out.println("\n*Anda memilih Persegi Panjang (1)*");
					System.out.println("------------------------------\n");
					PersegiP.input();
					System.out.println();
					PersegiP.cetak();
					break;
				
					case 2:
					System.out.println("\n*Anda memilih Balok (2)* ");
					System.out.println("------------------------------\n");
					Balok.input();
					System.out.println();
					Balok.cetak();
					break;
				
					case 3:
					System.out.println("\n*Anda memilih Lingkaran (3)* ");
					System.out.println("------------------------------\n");
					Lingkaran.input();
					System.out.println();
					Lingkaran.cetak();
					break;
				
					case 4:
					System.out.println("\n*Anda memilih Tabung (4)* ");
					System.out.println("------------------------------\n");
					Tabung.input();
					System.out.println();
					Tabung.cetak();
					break;
					
				}
			}while(key<5);
		}System.out.println("------------------------------\n");
		System.out.println("Prgram diakhiri");
	}
}