package com.alpabit.exercise.Service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class ConvertNumberToLatinImpl implements ConvertNumberToLatin{

	public static final String[] unitToTens = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
			"Twelve", "Thirteen", "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	
	public static final String[] dozens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	@Override
	public String convertNumber(double num) {
		
		String bigDec = numberToWord(num);
		
		return bigDec;
		
	}

	public static String numberToWord(double num) {
		
		// Tens of Bilions
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
		
		// Hundred of Billions
		Double divide2 = 1000000000d;
		
		// Trillion
		Double divide3 = 10000000000000d;
		Double divide4 = 1000000000000d;
		Double mod1 = 1000000000000d;
		Double limit = 1000000000000d;
		Double d10 = 20000000000000d;
		Double d11 = 30000000000000d;
		Double d12 = 40000000000000d;
		Double d13 = 50000000000000d;
		Double d14 = 60000000000000d;
		Double d15 = 70000000000000d;
		Double d16 = 80000000000000d;
		Double d17 = 90000000000000d;
		Double d18 = 100000000000000d;
		
		// Hundred Trillion
		Double divide5 = 1000000000000d;
		Double mod2 = 1000000000000d;
		Double d19 = 1000000000000000d;
		
		if(num < 0) {
			return "Minus" + numberToWord(-num);
		}
		if (num < 20) {
			return unitToTens[(int) num];
		} 
		if (num < 100) {
			return " " +dozens[(int) (num / 10)] + " " + unitToTens[(int) (num % 10)];
		}
		if (num < 1000) {			
			return unitToTens[(int) (num / 100)] + " Hundred" + numberToWord(num % 100);
		}
		if (num < 20000) {			
			return unitToTens[(int) (num / 1000)] + " Thousand " + numberToWord(num % 1000); 
		}
		if (num < 30000) {			
			return dozens[(int) (num / 10000)] + " "+ unitToTens[(int) (num / 1000 - 20)] + " Thousand " + numberToWord(num % 1000) ;
		}
		if (num < 40000) {
			return dozens[(int) (num / 10000)] + " "+ unitToTens[(int) (num / 1000 - 30)] + " Thousand " + numberToWord(num % 1000) ;
		}
		if (num < 50000) {
			return dozens[(int) (num / 10000)] + " "+ unitToTens[(int) (num / 1000 - 40)] + " Thousand " + numberToWord(num % 1000) ;
		}
		if (num < 60000) {
			return dozens[(int) (num / 10000)] + " "+ unitToTens[(int) (num / 1000 - 50)] + " Thousand " + numberToWord(num % 1000) ;
		}
		if (num < 70000) {
			return dozens[(int) (num / 10000)] + " "+ unitToTens[(int) (num / 1000 - 60)] + " Thousand " + numberToWord(num % 1000) ;
		}
		if (num < 80000) {
			return dozens[(int) (num / 10000)] + " "+ unitToTens[(int) (num / 1000 - 70)] + " Thousand " + numberToWord(num % 1000) ;
		}
		if (num < 90000) {
			return dozens[(int) (num / 10000)] + " "+ unitToTens[(int) (num / 1000 - 80)] + " Thousand " + numberToWord(num % 1000) ;
		}
		if (num < 1000000) {			
			return numberToWord(num / 1000) + " Thousand " + numberToWord(num % 1000);
		}
		if (num < 20000000) {			
			return unitToTens[(int) (num / 1000000)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 30000000) {			
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 20)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 40000000) {
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 30)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 50000000) {
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 40)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 60000000) {
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 50)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 70000000) {
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 60)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 80000000) {
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 70)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 90000000) {
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 80)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 100000000) {			
			return dozens[(int) (num / 10000000)] + " " + unitToTens[(int) (num / 1000000 - 90)] + " Million " + numberToWord(num % 1000000);
		}
		if (num < 1000000000) {		
//			return unitToTens[(int) (num / 100000000)] + " Miliion " + numberToWord(num % 100);
			return numberToWord(num / 1000000) + " Million " + numberToWord(num % 1000000);
		}
		if (num < d1) {			
			return unitToTens[(int) (num / 1000000000)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < d2) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 20)] + " Billion " +  numberToWord(num % 1000000000);
		}
		if (num < d3) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 30)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < d4) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 40)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < d5) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 50)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < d6) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 60)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < d7) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 70)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < d8) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 80)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < d9) {			
			return dozens[(int) (num / divide1)] + " " + unitToTens[(int) (num / 1000000000 - 90)] + " Billion " + numberToWord(num % 1000000000);
		}
		if (num < limit) {			
			return numberToWord(num / divide2) + " Billion " + numberToWord(num % 1000000000); 
		}
		if (num < d10) {
			return unitToTens[(int) (num / limit)] + " Trillion " + numberToWord(num % mod1);			
		}
		if (num < d11) {			
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 20)] + " Trillion " + numberToWord(num % mod1);
		}
		if (num < d12) {			
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 30)] + " Trillion " + numberToWord(num % mod1);
		}
		if (num < d13) {
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 40)] + " Trillion " + numberToWord(num % mod1);
		}
		if (num < d14) {			
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 50)] + " Trillion " + numberToWord(num % mod1);
		}
		if (num < d15) {
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 60)] + " Trillion " + numberToWord(num % mod1);
		}
		if (num < d16) {
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 70)] + " Trillion " + numberToWord(num % mod1);
		}
		if (num < d17) {			
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 80)] + " Trillion " + numberToWord(num % mod1);
		}
		if (num < d18) {			
			return dozens[(int) (num / divide3)] + " " + unitToTens[(int) (num / divide4 - 90)] + " Trillion " + numberToWord(num % mod1);
		} else if (num < d19) {			
			return numberToWord(num / divide5) + " Trillion " + numberToWord(num % mod2);
		}
		
		return "It Has Max Number, Maximal Digit is 15 Digit";
		
		
	}
	
}
