/* 
 *	File : Vahicle.java
 *	Deskripsi : 
 */
 
 public class Vehicle{
	 void calRent(int distance,float price) {
		 float fare=distance * price;
		 System.out.println("Vehicle price = "+fare);
	 }
 }
 
 
 
/*  public class Car extends Vehicle{
	 void callRent(int jarak,float harga){
		 float fare=jarak*harga;
		 fare=fare-100.00f;
		 System.out.println("Harga sewa mobil ="+fare);
	 }
 }
 
 
 
 public class Bus extends Vehicle{
	 
	 
 }
 
 
 public class Sewa{
	 public static void main(String[] args){
		 Vehicle kendaraan = new Vehicle();
		 Vehicle mobil = new Car();
		 Vehicle bis = new Bus();
		 kendaraan.calRent(50, 1000);
		 mobil.calRent(50, 1000);
		 bis.calRent(50, 1000);
	 }
 } */