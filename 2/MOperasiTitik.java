/* 
	MOperasiTitik.java 1/3/2023
	Nama : Desfara Dyabi Yusuf
	Deskripsi : Kelas Titik

 */
 
 public class MOperasiTitik{
	 public static void main(String[] arg){
		 Titik t = new Titik();
		 t.setAbsis (4);
		 t.setOrdinat (4);
		 OperasiTitik o = new OperasiTitik();
		 System.out.println("Titik : (" + t.getAbsis()+ "," + t.getOrdinat()+ ")");
		 o.refleksiX(t);
		 System.out.println("Titik : (" + t.getAbsis()+ "," + t.getOrdinat()+ ")");
		 o.refleksiY(t);
		 System.out.println("Titik : (" + t.getAbsis()+ "," + t.getOrdinat()+ ")");
		 
	 }
	 
 }