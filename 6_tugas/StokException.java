public class StokException extends Exception {
    public StokException(Barang barang) {
        // TODO 5
		super("Stok" + barang.getNama() + " " + barang.getId() + " tidak cukup!");
    }
}

