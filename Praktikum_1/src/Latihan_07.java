
public class Latihan_07 {
	public static void main(String[] args) {
		String data = "Ferdy Apriliyanto";

		data = data.replaceAll("[A,a,i,u,e,o]", "X");

		System.out.println("Ferdy Apriliyanto ==>" + data);
	}
}
