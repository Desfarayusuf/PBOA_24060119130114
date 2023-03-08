
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.main;

import org.bangundatar.*;

// public class MPoligon{
	// public static void main(String[] args) {
		// PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		// persegi.printInfo();
		// System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
	// }
// }


public class MPoligon{
	public static void main(String[] args) {
		SegiTiga segitiga = new SegiTiga(10,10,4);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}