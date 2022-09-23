import java.util.Scanner;

public class Latihan_06 {
	public static void main(String[] args) {
		
		System.out.print("Masukkan Usia : ");
		Scanner input = new Scanner(System.in);
		String usia = input.nextLine();
		
		System.out.print("Masukkan Nama Depan : ");
		Scanner input_nama_depan = new Scanner(System.in);
		String nama_depan = input_nama_depan.nextLine();
		
		System.out.print("Masukkan Nama Belakang : ");
		Scanner input_nama_belakang = new Scanner(System.in);
		String nama_belakang = input_nama_belakang.nextLine();
		
		System.out.print("Masukkan NPM : ");
		Scanner input_npm = new Scanner(System.in);
		String npm = input_npm.nextLine();
		
		input.close();
		
		System.out.println(usia.concat(nama_depan).concat(nama_belakang).concat(npm));
	}
}
