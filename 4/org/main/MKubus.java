
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)


package org.main;

import org.bangunruang.*;
import org.bangundatar.Persegi;



public class MKubus{
	public static void main(String[] args) {
		Persegi prsg = new Persegi(10,6);
		Kubus kubus = new Kubus(prsg);
		//prsg.printInfo();
		//Kubus.printInfo();
		System.out.println("Luas Persegi : "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubus Dengan Panjang Sisi 10 Satuan : " + kubus.hitungVolume());
	}
}