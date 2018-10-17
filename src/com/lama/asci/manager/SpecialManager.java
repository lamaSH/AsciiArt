package com.lama.asci.manager;

import com.lama.asci.alphabets.SpecialAlphabet;

public class SpecialManager {
	SpecialAlphabet specialAlphabet;
	public SpecialManager(SpecialAlphabet specialAlphabet)
	{
		this.specialAlphabet = specialAlphabet;
	}
	
	public String[] getAsciiTranslation(String message) {
		int w = specialAlphabet.getW();
		int H = specialAlphabet.getH();

		String T = message;
		//T = T.toUpperCase();
		
		String[] ROW = this.specialAlphabet.getDatas();
		String[] result = new String[H];
		for (int i = 0; i < H; i++) {

		result[i] = new String();

			// char maj 65 => 90
			for (char letter : T.toCharArray()) {
				if (letter >= 32 && letter <= 126) {
					result[i]+=(ROW[i].substring((letter - 32) * w,(letter - 32) * w + w));
				}// else {
					//result[i]+=(ROW[i].substring(w * 26, (w * 26) + w));
				//}
				

			}
			
		}

		return result;
	}

}
