package org.astro;

import java.util.Scanner;

public class INITIAL {
	
String getInitial;
	
	Scanner sc=new Scanner(System.in);
	public INITIAL() {
		
	System.out.println("enter 1 to know numerology number"+"\n"
	+"enter 2 to know first letter for your star"+"\n"
	+"enter 3 to know your horoscope");
	getInitial= sc.next();
	
	}
	
	public void ininput() {
	
	switch (getInitial) {
	
	case "1":
		NUMOP userInput = new NUMOP();
		boolean res = userInput.input();
		break;
	case "2":
		System.out.println("1.Aswini"+"\n"+"2.Barani"+"\n"+"3.Karthikai"+"\n"+"4.Rohini"+"\n"+"5.Mirugasirisam"+"\n"
		+"6.Thiruvathirai"+"\n"+"7.Punarpoosam"+"\n"+"8.Poosam"+"\n"+"9.Ayilyam"+"\n"+"10.Magam"+"\n"
		+"11.Pooram"+"\n"+"12.Uthiram"+"\n"+"13.Astham"+"\n"+"14.Chithirai"+"\n"+"15.Swathi"+"\n"
		+"16.Visakam"+"\n"+"17.Anusham"+"\n"+"18.Kettai"+"\n"+"19.Moolam"+"\n"+"20.Pooradam"+"\n"
		+"21.Uthraadam"+"\n"+"22.Thiruvoam"+"\n"+"23.Avittam"+"\n"+"24.Sadayam"+"\n"+"25.Poorattadhi"+"\n"
		+"26.Uthrattathi"+"\n"+"27.Revathi");
					
		System.out.println();
				
		ALPHABETOP userInput1=new ALPHABETOP();
		userInput1.input2();
		break;
	case "3":
		ASTRO userInput2=new ASTRO();
		userInput2.astro();
		break;
	default:
		System.out.println("enter valid input");
		break;
						
	}
	}
	

}
