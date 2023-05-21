/* File : ArrayListTest.java */
/* Deskripsi : Program penggunaan objek ArrayList sebagai collection class */

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//Inisiasi Arraylist yang hanya dapat berisi objek string
		ArrayList<String> string = new ArrayList<String>();
		//menambah elemen
		string.add("praktikum");
		string.add("collection");
		string.add("dan generic");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}