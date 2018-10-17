package com.lama.asci.manager;

import com.lama.asci.alphabets.DefaultAlphabet;

public class AscciManager {
	private DefaultAlphabet alphabet;

	public String[] getAsciiTranslation(String message) {
		int w = alphabet.getW();
		int H = alphabet.getH();

		String T = message;
		T = T.toUpperCase();
		
		String[] ROW = this.alphabet.getDatas();
		String[] result = new String[H];
		for (int i = 0; i < H; i++) {

		result[i] = new String();

			// char maj 65 => 90
			for (char letter : T.toCharArray()) {
				if (letter >= 65 && letter <= 90) {
					result[i]+=(ROW[i].substring((letter - 65) * w,(letter - 65) * w + w));
				} else {
					result[i]+=(ROW[i].substring(w * 26, (w * 26) + w));
				}
				//System.err.println(result[i]);

			}
			
		}

		return result;
	}

	public AscciManager(DefaultAlphabet alphabet) {
		this.alphabet = alphabet;
	}
}