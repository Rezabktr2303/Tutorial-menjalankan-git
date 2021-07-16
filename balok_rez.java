import java.util.Scanner;

public class balok_rez extends PPanjang_rez implements UI2_rez{
	
	double t;
	Scanner scn =  new Scanner(System.in);
	
	balok_rez(double p, double l, double t)
	{
		super(p,l);//warisan atribut
		this.t = t;
	}
	
	void input(){
		System.out.println("---------inputan balok----------");
		System.out.println("Masukkan Panjang");
		p = scn.nextInt();
		System.out.println("Masukkan Lebar");
		l = scn.nextInt();
		System.out.println("Masukkan Tinggi");
		t = scn.nextInt();
	}
	
	public double LP()
	{
		double LP;
		LP=2*((p*l)+(p*t)+(l*t));
		return LP;
	}
	
	public double V()
	{
		double V;
		V=p*l*t;//warisan method
		return V;
	}
	
	void cetak(){
		System.out.println("------------balok------------");
		System.out.println("Diketahui : \npanjang = "+p+"\nlebar = "+l+"\ntinggi = "+t+"\n");
		// LP();
		// V();
		System.out.println("Hasil : \nLuas Permukaan = "+LP()+"\nVolume = "+V());
		
	}
}