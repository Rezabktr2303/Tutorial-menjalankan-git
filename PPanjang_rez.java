import java.util.Scanner;

class PPanjang_rez extends info_rez implements UI_rez{
	
	double p;
	double l;
	Scanner scn = new Scanner(System.in);
	
	PPanjang_rez(double p, double l)
	{
		this.p=p;
		this.l=l;
	}

	void input(){
		System.out.println("----inputan Persegi Panjang----");
		System.out.println("Masukkan Panjang");
		p = scn.nextInt();
		System.out.println("Masukkan Lebar");
		l = scn.nextInt();
	}
	
	public double K()
	{
		double K;
		K=2*(p+l);
		return K;
	}
	
	public double L()
	{
		double L;
		L=p*l;
		return L;
	}
		
	void cetak(){
		System.out.println("-------Persegi Panjang-------");
		System.out.println("Diketahui :\npanjang = "+p+"\nlebar = "+l+"\n");
		L();
		K();
		System.out.println("Hasil :\nLuas = "+L()+"\nKeliling = "+K());
	}
}