
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.main;

import org.bangunruang.*;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main (String[] args){
		BujurSangkar persegi = new BujurSangkar(4);
		Kubus kubus = new Kubus(persegi);
		System.out.println("Luas Permukaan Kubus Dengan Panjang Sisi 4 Satuan : " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus Dengan Panjang Sisi 4 Satuan : " + kubus.hitungVolume());
	}
}