package com.alpabit.exercise.Service;

import org.springframework.stereotype.Service;

@Service
public class UbahAngkaKeLatinImpl implements UbahAngkaKeLatin{

	public static final String[] satuanKeRatusan = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas",
			"Dua Belas", "Tiga Belas", "Empat Belas", "Lima Belas", "Enam Belas", "Tujuh Belas", "Delapan Belas", "Sembilan Belas"};
	
	public static final String[] puluhan = {"", "", "Dua Puluh", "Tiga Puluh", "Empat Puluh", "Lima Puluh", "Enam Puluh", "Tujuh Puluh", "Delapan Puluh", "Sembilan Puluh"};
	
	public static final String seratus = "Seratus";
	
	public static final String seribu = "Seribu";
	
	@Override
	public String ubahAngka(double angka) {
		
		String bigDec = ubahAngkaJadiKalimat(angka);
		
		return bigDec;
	}
	
	private static String ubahAngkaJadiKalimat(double angka) {
		
		// Batas Puluhan Miliyar
		Double divide1 = 10000000000d;
		Double d1 = 20000000000d;
		Double d2 = 30000000000d;
		Double d3 = 40000000000d;
		Double d4 = 50000000000d;
		Double d5 = 60000000000d;
		Double d6 = 70000000000d;
		Double d7 = 80000000000d;
		Double d8 = 90000000000d;
		Double d9 = 100000000000d;
		
		// Triliun
		Double divide2 = 1000000000000d;
		Double divide3 = 10000000000000d;
		Double mod1 = 1000000000000d;
		Double d10 = 1000000000000d;
		Double d11 = 20000000000000d;
		Double d12 = 30000000000000d;
		Double d13 = 40000000000000d;
		Double d14 = 50000000000000d;
		Double d15 = 60000000000000d;
		Double d16 = 70000000000000d;
		Double d17 = 80000000000000d;
		Double d18 = 90000000000000d;
		Double d19 = 100000000000000d;
		
		// Ratusan Triliun
		Double divide4 = 1000000000000d;
		Double mod2 = 1000000000000d;
		Double d20 = 200000000000000d;
		Double d21 = 1000000000000000d;
		
		if (angka < 0) {
			return "Minus" + ubahAngkaJadiKalimat(angka);
		}
		if (angka < 20) {			
			return satuanKeRatusan[(int) angka];
		}
		if (angka < 100) {			
			return " " + puluhan[(int) (angka / 10)] + " " + ubahAngkaJadiKalimat(angka % 10);
		}
		if (angka < 200) {			
			return seratus + ubahAngkaJadiKalimat(angka % 100);
		}
		if (angka < 1000) {			
			return satuanKeRatusan[(int) (angka / 100)] + " Ratus" + ubahAngkaJadiKalimat(angka % 100);
		}
		if (angka < 2000) {			
			return seribu + " " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 20000) {			
			return satuanKeRatusan[(int) (angka / 1000)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 30000) {			
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 20)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 40000) {			
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 30)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 50000) {			
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 40)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 60000) {
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 50)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 70000) {
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 60)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 80000) {			
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 70)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 90000) {			
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 80)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 100000) {			
			return puluhan[(int) (angka / 10000)] + " " + satuanKeRatusan[(int) (angka / 1000 - 90)] + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 200000) {			
			return seratus + " Ribu " + ubahAngkaJadiKalimat(angka % 100000); 
		}
		if (angka < 1000000) {			
			return ubahAngkaJadiKalimat(angka / 1000) + " Ribu " + ubahAngkaJadiKalimat(angka % 1000);
		}
		if (angka < 20000000) {			
			return satuanKeRatusan[(int) (angka / 1000000)] + "Juta " + ubahAngkaJadiKalimat(angka % 1000000);
		}
		if (angka < 30000000) {			
			return puluhan[(int) (angka / 10000000)] + " " + satuanKeRatusan[(int) (angka / 1000000 - 20)] + " Juta " + ubahAngkaJadiKalimat(angka % 1000000); 
		}
		if (angka < 40000000) {
			return puluhan[(int) (angka / 10000000)] + " " + satuanKeRatusan[(int) (angka / 1000000 - 30)] + " Juta " + ubahAngkaJadiKalimat(angka % 1000000);
		}
		if (angka < 50000000) {
			return puluhan[(int) (angka / 10000000)] + " " + satuanKeRatusan[(int) (angka / 1000000 - 40)] + " Juta " + ubahAngkaJadiKalimat(angka % 1000000);
		}
		if (angka < 60000000) {
			return puluhan[(int) (angka / 10000000)] + " " + satuanKeRatusan[(int) (angka / 1000000 - 50)] + " Juta " + ubahAngkaJadiKalimat(angka % 1000000);
		}
		if (angka < 70000000) {			
			return puluhan[(int) (angka / 10000000)] + " " + satuanKeRatusan[(int) (angka / 1000000 - 60)] + " Juta " + ubahAngkaJadiKalimat(angka % 1000000);
		}
		if (angka < 80000000) {
			return puluhan[(int) (angka / 10000000)] + " " + satuanKeRatusan[(int) (angka / 1000000 - 70)] + " Juta " + ubahAngkaJadiKalimat(angka % 1000000);
		}
		if (angka < 90000000) {
			return puluhan[(int) (angka / 10000000)] + " " + satuanKeRatusan[(int) (angka / 1000000 - 80)] + " Juta " + ubahAngkaJadiKalimat(angka % 1000000);
		}
		if (angka < 1000000000) {			
			return ubahAngkaJadiKalimat(angka / 1000000) + " Juta " + ubahAngkaJadiKalimat(angka % 1000000) ;
		}
		if (angka < d1) {			
			return satuanKeRatusan[(int) (angka / 1000000000)] + " Miliyar " + ubahAngkaJadiKalimat(angka % 1000000000); 
		}
		if (angka < d2) {			
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 20)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000); 
		}
		if (angka < d3) {
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 30)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000);
		}
		if (angka < d4) {
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 40)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000);
		}
		if (angka < d5) {
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 50)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000);
		}
		if (angka < d6) {
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 60)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000);
		}
		if (angka < d7) {
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 70)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000);
		}
		if (angka < d8) {
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 80)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000);
		}
		if (angka < d9) {
			return puluhan[(int) (angka / divide1)] + " " + satuanKeRatusan[(int) (angka / 1000000000 - 90)] + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000);
		}
		if (angka < d10) {			
			return ubahAngkaJadiKalimat(angka / 1000000000) + " Miliar " + ubahAngkaJadiKalimat(angka % 1000000000); 
		}
		if (angka < d11) {			
			return satuanKeRatusan[(int) (angka / divide2)] + " Triliun " + ubahAngkaJadiKalimat(angka % divide2);
		}
		if (angka < d12) {			
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 20)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d13) {			
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 30)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d14) {
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 40)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d15) {
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 50)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d16) {
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 60)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d17) {
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 70)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d18) { 
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 80)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d19) {
			return puluhan[(int) (angka / divide3)] + " " + satuanKeRatusan[(int) (angka / divide2 - 90)] + " Triliun " + ubahAngkaJadiKalimat(angka % mod1);
		}
		if (angka < d20) {			
			return ubahAngkaJadiKalimat(angka / divide2) + " Triliun " + ubahAngkaJadiKalimat(angka % mod2);
		} else if (angka < d21){			
			return ubahAngkaJadiKalimat(angka / divide4) + " Triliun " + ubahAngkaJadiKalimat(angka % mod2);
		}
		
		return "Telah Melebihi Batas Angka Maksimal, Maksimal Digit = 15 Digit";
	}

}
