package com.alpabit.exercise.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpabit.exercise.dto.AppsReq;
import com.alpabit.exercise.dto.AppsRes;

@Service
public class DecimalToStringImpl implements DecimalToString{
	
	@Autowired
	ConvertNumberToLatin convertNumberToLatin;
	
	@Autowired
	UbahAngkaKeLatin angkaKeLatin;
  	
	@Override
	public AppsRes convertToString(AppsReq request) {
		
		AppsRes response = new AppsRes();
		
		String bigDec = request.getAmount().toString();
		double num = Double.valueOf(bigDec);
		
		response.setEn(convertNumberToLatin.convertNumber(num));
		response.setId(angkaKeLatin.ubahAngka(num));
		
		return response;
	}

}
