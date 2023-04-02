
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}
	
	public double hitungVolume(){
		return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
	}
}