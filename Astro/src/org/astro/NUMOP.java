package org.astro;

import java.util.Scanner;

public class NUMOP {
	
	String firstName;
	String middletName;
	String lastName;
	
	Scanner sc=new Scanner(System.in);
	public NUMOP() {
	
	System.out.println("enter your first name/ DOB / vehicle number |or| put '0'");
	firstName=sc.nextLine();
	
	System.out.println("enter your middle name/ DOB / vehicle number |or| put '0'");	
	middletName=sc.nextLine();
	
	System.out.println("enter your last name/ DOB / vehicle number |or| put '0'");	
	lastName=sc.nextLine();
	}
	
	
	public boolean input() {
			String usrFirstName = firstName;
			char[] ch = usrFirstName.toCharArray();
			
		for (int i = 0; i < usrFirstName.length(); i++) {
			
			if(ch[i]=='a'||ch[i]=='i'||ch[i]=='j'||ch[i]=='q'||ch[i]=='y') {
				ch[i]='1';
			}
			if(ch[i]=='b'||ch[i]=='k'||ch[i]=='r') {
				ch[i]='2';
			}
			if(ch[i]=='c'||ch[i]=='g'||ch[i]=='l'||ch[i]=='s') {
				ch[i]='3';
			}
			if(ch[i]=='d'||ch[i]=='m'||ch[i]=='t') {
				ch[i]='4';
			}
			if(ch[i]=='e'||ch[i]=='h'||ch[i]=='n'||ch[i]=='x') {
				ch[i]='5';
			}
			if(ch[i]=='u'||ch[i]=='v'||ch[i]=='w') {
				ch[i]='6';
			}
			if(ch[i]=='o'||ch[i]=='z') {
				ch[i]='7';
			}
			if(ch[i]=='f'||ch[i]=='p') {
				ch[i]='8';
			}
			if(!Character.isLetterOrDigit(ch[i])) {
				System.out.println("Pls enter valid input: " + ch[i]);
				return false;
			}
		}
		
		System.out.println("Firstname equivalent numbers:");
		System.out.println(usrFirstName);
		System.out.println(ch);
		System.out.println("\n"+"Total size of your Firstname: "+ch.length+"\n");
		
		String numFormat = String.copyValueOf(ch);
		long outPut = Long.parseLong(numFormat);
		
		int numA=0;
		int numB=0;
		int numC=0;
		
		while(outPut>0) {
		int temp= (int) (outPut %10);
		numA= temp+numA;
		outPut=outPut/10;
		}
		
		while(numA>0) {
		int temp1= numA %10;
		numB=temp1+numB;
		numA=numA/10;
		}
		
		while(numB>0) {
		int temp2= numB %10;
		numC=temp2+numC;
		numB=numB/10;
		}
		//firstNameOP
		//System.out.println(numC);
		
		String usrMiddletName = middletName;
		
		char[] ch1 = usrMiddletName.toCharArray();
		
		for (int j = 0; j < usrMiddletName.length(); j++) {
			
			if(ch1[j]=='a'||ch1[j]=='i'||ch1[j]=='j'||ch1[j]=='q'||ch1[j]=='y') {
				ch1[j]='1';
			}
			if(ch1[j]=='b'||ch1[j]=='k'||ch1[j]=='r') {
				ch1[j]='2';
			}
			if(ch1[j]=='c'||ch1[j]=='g'||ch1[j]=='l'||ch1[j]=='s') {
				ch1[j]='3';
			}
			if(ch1[j]=='d'||ch1[j]=='m'||ch1[j]=='t') {
				ch1[j]='4';
			}
			if(ch1[j]=='e'||ch1[j]=='h'||ch1[j]=='n'||ch1[j]=='x') {
				ch1[j]='5';
			}
			if(ch1[j]=='u'||ch1[j]=='v'||ch1[j]=='w') {
				ch1[j]='6';
			}
			if(ch1[j]=='o'||ch1[j]=='z') {
				ch1[j]='7';
			}
			if(ch1[j]=='f'||ch1[j]=='p') {
				ch1[j]='8';
			}
			if(!Character.isLetterOrDigit(ch1[j])) {
				System.out.println("Pls enter valid input: " + ch1[j]);
				return false;
			}
			
		}
		System.out.println("Middlename equivalent numbers:");
		System.out.println(usrMiddletName);
		System.out.println(ch1);
		System.out.println("\n"+"Total size of your Middlename: "+ch1.length+"\n");
		
		String numFormat2 = String.copyValueOf(ch1);
		long outPut2 = Long.parseLong(numFormat2);
		
		int numA1=0;
		int numB1=0;
		int numC1=0;
		
		while(outPut2>0) {
		int temp= (int) (outPut2 %10);
		numA1= temp+numA1;
		outPut2=outPut2/10;
		}
		
		while(numA1>0) {
		int temp1= numA1 %10;
		numB1=temp1+numB1;
		numA1=numA1/10;
		}
		
		while(numB1>0) {
		int temp2= numB1 %10;
		numC1=temp2+numC1;
		numB1=numB1/10;
		}
		//secondNameOP
		//System.out.println(numC1);
		
		String userLastName = lastName;
		char[] ch2 = userLastName.toCharArray();
		
		for (int k = 0; k < userLastName.length(); k++) {
			
			if(ch2[k]=='a'||ch2[k]=='i'||ch2[k]=='j'||ch2[k]=='q'||ch2[k]=='y') {
				ch2[k]='1';
			}
			if(ch2[k]=='b'||ch2[k]=='k'||ch2[k]=='r') {
				ch2[k]='2';
			}
			if(ch2[k]=='c'||ch2[k]=='g'||ch2[k]=='l'||ch2[k]=='s') {
				ch2[k]='3';
			}
			if(ch2[k]=='d'||ch2[k]=='m'||ch2[k]=='t') {
				ch2[k]='4';
			}
			if(ch2[k]=='e'||ch2[k]=='h'||ch2[k]=='n'||ch2[k]=='x') {
				ch2[k]='5';
			}
			if(ch2[k]=='u'||ch2[k]=='v'||ch2[k]=='w') {
				ch2[k]='6';
			}
			if(ch2[k]=='o'||ch2[k]=='z') {
				ch2[k]='7';
			}
			if(ch2[k]=='f'||ch2[k]=='p') {
				ch2[k]='8';
			}
			if(!Character.isLetterOrDigit(ch2[k])) {
				System.out.println("Pls enter valid input: " + ch2[k]);
				return false;
			}
		}
		System.out.println("Lastname equivalent numbers:");
		System.out.println(userLastName);
		System.out.println(ch2);
		System.out.println("\n"+"Total size of your Laststname: "+ch2.length+"\n");
		
		String numFormat3 = String.copyValueOf(ch2);
		long outPut3 = Long.parseLong(numFormat3);
		
		int numA2=0;
		int numB2=0;
		int numC2=0;
		
		while(outPut3>0) {
		int temp= (int) (outPut3 %10);
		numA2= temp+numA2;
		outPut3=outPut3/10;
		}
		
		while(numA2>0) {
		int temp1= numA2 %10;
		numB2=temp1+numB2;
		numA2=numA2/10;
		}
		
		while(numB2>0) {
		int temp2= numB2 %10;
		numC2=temp2+numC2;
		numB2=numB2/10;
		}
		//thirdNameOP
		//System.out.println(numC2);
		System.out.println();
		System.out.println("for first name: "+numC+" "+"for middle name: "+numC1+" "+"for last name: "+numC2);
		
		
		int sum=numC+numC1+numC2;
		
		int total=0;
		while(sum>0) {
		int tem= sum%10;
		total=tem+total;
		sum=sum/10;
		}
		System.out.println("calculated numerology number for your full name is: "+ total+"\n");
		
		return true ;
}

}
