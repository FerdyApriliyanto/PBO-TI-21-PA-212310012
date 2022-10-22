import javax.swing.JOptionPane;

public class Latihan02 {
	public static void main(String[] args) {
		Biodata siswaObj1 = new Biodata();
		JOptionPane jop = new JOptionPane();
		
		String Fullname = jop.showInputDialog(null, "Masukkan Nama Lengkap");
		siswaObj1.setFullname(Fullname);
		
		String Alamat = jop.showInputDialog(null, "Masukkan Alamat");
		siswaObj1.setAlamat(Alamat);
		
		String Usia = jop.showInputDialog(null, "Masukkan Usia");
		siswaObj1.setUsia(Usia);
		
		jop.showMessageDialog(null, siswaObj1.getFullname() + "\n" + siswaObj1.getAlamat() + "\n" + siswaObj1.getUsia());

	}
}
