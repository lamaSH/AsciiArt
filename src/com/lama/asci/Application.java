package com.lama.asci;

import java.util.Scanner;

import com.lama.asci.alphabets.DefaultAlphabet;
import com.lama.asci.alphabets.MyAlphabet;
import com.lama.asci.alphabets.MySpecialAlphabet;
import com.lama.asci.alphabets.SpecialAlphabet;
import com.lama.asci.manager.AscciManager;
import com.lama.asci.manager.SpecialManager;
import com.lama.asci.utils.ScannerProvider;

public class Application {

	public static void main(String[] args) {
		
		while(true)
		{
		//DefaultAlphabet alphabet = new MyAlphabet() ;
		//AscciManager manager = new AscciManager(alphabet);
		//Scanner sc = new Scanner(System.in);
		//String message =sc.nextLine();
			
		System.out.println("Saisez votre message");
		
		
		SpecialAlphabet alphabet = new MySpecialAlphabet();
		SpecialManager manager = new SpecialManager(alphabet);
		
		String[] result = manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		for(int i = 0; i< alphabet.getH(); i++)
		{
		 System.out.println(result[i]);
		}
		//sc.close();
		}
	}

}
