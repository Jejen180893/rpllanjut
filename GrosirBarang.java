import java.util.Scanner;
class GrosirBarang{
	public static int jumBeli;
	public static double bayar=0;
	public static String kdB, kdP;
	
	public static void main(String[] args){
		Scanner iHuruf=new Scanner(System.in);
		Scanner iAngka=new Scanner(System.in);
		Kustomer kus=new Kustomer();
	System.out.println("_____________________________________");	
	System.out.println("\t [Wahyudin Zaelani]");
	System.out.println("\t    [1127050167]");
	System.out.println("_____________________________________");
	System.out.print("ID Kustomer ");
	System.out.println("\t\tNama Kustomer ");
	kdP=iHuruf.nextLine();
	if(kdP.equalsIgnoreCase(kus.getKustomer(kdP,0)))
	{
	System.out.println("\t\t\t"+kus.getKustomer(kdP,1));
	System.out.print("\nKode Barang\t\t");
	kdB=iHuruf.nextLine();
	Transaksi tar=new Transaksi(kdB);
	System.out.print("Nama Barang \t\t");
	System.out.println(tar.getNama());
	System.out.print("Harga Barang \t\t");
	System.out.println(tar.getHarga());
	System.out.print("Jumlah Beli \t\t");
	jumBeli=iAngka.nextInt();
	System.out.print("Total Harga \t\t");
	System.out.println(tar.getTotalHarga(getJumBeli()));
	System.out.print("Diskon \t\t\t");
	System.out.println(tar.getDiskon(getJumBeli()));
	System.out.print("Total Bayar \t\t");
	System.out.println(tar.getTotalBayar(getJumBeli()));
	System.out.print("Bayar\t\t\t");
	bayar=iAngka.nextInt();
	if(bayar<=tar.getTotalBayar(getJumBeli())){
	System.out.println("Maaf, Uang anda kurang!!!");
	}else{	
	System.out.print("Kembalian \t\t");
	System.out.println(tar.getKembalian(bayar,getJumBeli()));}
	}
	else{
	System.out.println("Maaf, kode tidak sesuai dalam menu");}
}
public static int getJumBeli(){
	return jumBeli;
	}
}