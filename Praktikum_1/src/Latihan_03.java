class Layang {
	public double luas_layang (int d1, int d2) {	
		return 0.5 * d1 * d2;
	}
		
	public void keliling_layang (int a,int b,int c,int d) {
		int keliling;
			
		keliling = a + b + c + d;
		System.out.println("Keliling Layang Layang = " + keliling);
	}
}

class Prisma_Segitiga {
	public void luas_prisma (int la, int ka, int tp) {	
		double luas;
		
		luas = (2 * la) + (ka * tp);
		System.out.println("Luas Prisma Segitiga = " + luas);
	}
		
	public void keliling_prisma (int a,int t,int l,int p) {
		int keliling;
			
		keliling =  2 * (a + t + l) + (3*p);
		System.out.println("Keliling Prisma Segitiga = " + keliling);
	}
}
	
public class Latihan_03 {

	public static void main(String[] args) {
		double luas;
	
		Layang layangObj1 = new Layang();
		luas = layangObj1.luas_layang(2, 10);
		
		System.out.println("Luas Layang-Layang = " + luas);
		layangObj1.keliling_layang(1,2,3,4);
		
		Prisma_Segitiga prismaObj1 = new Prisma_Segitiga();
		prismaObj1.luas_prisma(1, 2, 3);
		prismaObj1.keliling_prisma(1, 2, 3, 4);
	}
}
