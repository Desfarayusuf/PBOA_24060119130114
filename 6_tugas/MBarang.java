public class MBarang {
    public static void beliBarang(Barang barang, int jumlah) throws StokException {
        if (jumlah > barang.getStok()) {
            // TODO 6
			throw new StokException(barang);
        } else {
            // TODO 7
			barang.kurangiStok(jumlah);
            // TODO 8
			System.out.println("Anda berhasil membeli " + jumlah + " " + barang.getNama());
        }
    }
    
    public static void main(String[] args) {
        // TODO 9 Barang barang = new Barang("B001", "Celana", 10);
		Barang barang = new Barang("B001","Celana",5);
        try {
            // TODO 10
			beliBarang(barang, 7);
        } catch (StokException e) {
            // TODO 11
			System.out.println(e.getMessage());
			System.out.println("Mohon maaf, stok barang tidak mencukupi.");
        }
    }

}
