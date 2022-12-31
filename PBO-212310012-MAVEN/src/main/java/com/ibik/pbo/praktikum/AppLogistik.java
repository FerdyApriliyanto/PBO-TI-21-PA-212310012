package com.ibik.pbo.praktikum;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppLogistik {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();

		ArrayList<Integer> pengiriman = new ArrayList<Integer>();
		
		int berat = Integer.parseInt(jop.showInputDialog(null,"Masukkan Berat"));
		int jarak = Integer.parseInt(jop.showInputDialog(null,"Masukkan Jarak"));
		
		int total_harga = harga_Pengiriman(berat,jarak);
	
		jop.showMessageDialog(null,"Total Harga = " + total_harga + "\nNomor Resi = 123");
		
		pengiriman.add(123);
		pengiriman.add(total_harga);
		
		int resi = Integer.parseInt(jop.showInputDialog(null,"Masukkan Resi","Lacak Resi",jop.QUESTION_MESSAGE));
			
		if(resi == pengiriman.get(0)) {
			jop.showMessageDialog(null, "No Resi = " + pengiriman.get(0) + "\nTotal Harga = " + pengiriman.get(1));
		}
	}
	
	static int harga_Pengiriman(int paramBerat,int paramJarak) {
		int harga_Berat,harga_Jarak;
		
		if (paramBerat < 100) {
			harga_Berat = 5000;
		}else {
			harga_Berat = (paramBerat / 100) * 5000;
		}
		
		if (paramJarak < 10) {
			harga_Jarak = 8000;
		}else {
			harga_Jarak = (paramJarak / 10) * 8000;
		}
		
		return harga_Berat + harga_Jarak;
	}

}
