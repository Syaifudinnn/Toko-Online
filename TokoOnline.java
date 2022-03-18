
package TokoOnline;

public class TokoOnline {
    
    public static void main(String[] args) {
        
        Barang barang = new Barang();
        Karyawan karyawan = new Karyawan();
        Laporan laporan = new Laporan();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
    
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi,barang);

        transaksi.prosesTransaksi(member, transaksi, barang);
        
    }
    
}
