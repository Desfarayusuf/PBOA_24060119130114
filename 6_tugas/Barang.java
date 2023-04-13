public class Barang {
    // TODO 1
	private String id;
	private String nama;
	private int stok;

    public Barang(String id, String nama, int stok) {
        // TODO 2
		this.id = id;
		this.nama = nama;
		this.stok = stok;
    }

    // TODO 3 Buat Getter

    public void kurangiStok(int jumlah) {
        // TODO 4
		stok -= jumlah;
    }
	
	public String getId() {
		return id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getStok() {
		return stok;
	}
}