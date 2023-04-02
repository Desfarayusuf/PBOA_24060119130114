
// File : MLingkaran.java 01/04/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi : Implementasi cara menghitung luas lingkaran

import java.util.Scanner;

public class MLingkaran{
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.print("Masukkan jari jari lingkaran : ");
			double r = scan.nextDouble();
			Lingkaran l = new Lingkaran(r);
			
			System.out.println("Luas lingkaran dengan " + "Jejari " + r + " satuan adalah " + l.hitungLuas());
		}
}