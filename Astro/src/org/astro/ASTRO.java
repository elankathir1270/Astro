package org.astro;

import java.util.LinkedList;
import java.util.Scanner;

public class ASTRO {
	
	Scanner sc=new Scanner(System.in);
	LinkedList<String> box1 =new LinkedList<>(); LinkedList<String> box2 =new LinkedList<>();
	LinkedList<String> box3 =new LinkedList<>(); LinkedList<String> box4 =new LinkedList<>();
	LinkedList<String> box5 =new LinkedList<>(); LinkedList<String> box6 =new LinkedList<>();
	LinkedList<String> box7 =new LinkedList<>(); LinkedList<String> box8 =new LinkedList<>();
	LinkedList<String> box9 =new LinkedList<>(); LinkedList<String> box10 =new LinkedList<>();
	LinkedList<String> box11 =new LinkedList<>(); LinkedList<String> box12 =new LinkedList<>();
	
	
	public ASTRO() {
	
	System.out.println("sun = sun"+"\n"+"moon = moon"+"\n"+"sevvai = sev"
	+"\n"+"budhan = bud"+"\n"+"guru = guru"+"\n"+"sukran = suk"
	+"\n"+"sani = sani"+"\n"+"ragu = ragu"+"\n"+"kethu = kethu"
	+"\n"+"lakanam = la"+"\n"+"null = null"+"\n");
	
	
	System.out.println("======================================");
	System.out.println("consider lakanam='la' as your box1"+"\n"+"mention your lakanam as 'la'");
	System.out.println("======================================");				
	System.out.println("\n"+"fill your planetary positions"+"\n");
	
	System.out.println("box1 must contain lakanam = 'la'"+"\n"+"enter no of planets at your box1 (0-9)");
	int bc1 = sc.nextInt();
	System.out.println("enter 'la' and the planets at your box1");
	for(int i=0;i<=bc1;i++) {
	box1.add(sc.next());
	}	
	System.out.println("enter no of planets at your box2 (0-9)");
	int bc2 = sc.nextInt();
	System.out.println("enter the planets at your box2 or null");
	if(bc2==0) {
		bc2=1;
	}
	for(int i=0;i<bc2;i++) {
	box2.add(sc.next());
	}
	System.out.println("enter no of planets at your box3 (0-9)");
	int bc3 = sc.nextInt();
	System.out.println("enter the planets at your box3 or null");
	if(bc3==0) {
		bc3=1;
	}
	for(int i=0;i<bc3;i++) {
	box3.add(sc.next());
	}
	System.out.println("enter no of planets at your box4 (0-9)");
	int bc4 = sc.nextInt();
	System.out.println("enter the planets at your box4 or null");
	if(bc4==0) {
		bc4=1;
	}
	for(int i=0;i<bc4;i++) {
	box4.add(sc.next());
	}
	System.out.println("enter no of planets at your box5 (0-9)");
	int bc5 = sc.nextInt();
	System.out.println("enter the planets at your box5 or null");
	if(bc5==0) {
		bc5=1;
	}
	for(int i=0;i<bc5;i++) {
	box5.add(sc.next());
	}
	System.out.println("enter no of planets at your box6 (0-9)");
	int bc6 = sc.nextInt();
	System.out.println("enter the planets at your box6 or null");
	if(bc6==0) {
		bc6=1;
	}
	for(int i=0;i<bc6;i++) {
	box6.add(sc.next());
	}
	System.out.println("enter no of planets at your box7 (0-9)");
	int bc7 = sc.nextInt();
	System.out.println("enter the planets at your box7 or null");
	if(bc7==0) {
		bc7=1;
	}
	for(int i=0;i<bc7;i++) {
	box7.add(sc.next());
	}
	System.out.println("enter no of planets at your box8 (0-9)");
	int bc8 = sc.nextInt();
	System.out.println("enter the planets at your box8 or null");
	if(bc8==0) {
		bc8=1;
	}
	for(int i=0;i<bc8;i++) {
	box8.add(sc.next());
	}
	System.out.println("enter no of planets at your box9 (0-9)");
	int bc9 = sc.nextInt();
	System.out.println("enter the planets at your box9 or null");
	if(bc9==0) {
		bc9=1;
	}
	for(int i=0;i<bc9;i++) {
	box9.add(sc.next());
	}
	System.out.println("enter no of planets at your box10 (0-9)");
	int bc10 = sc.nextInt();
	System.out.println("enter the planets at your box10 or null");
	if(bc10==0) {
		bc10=1;
	}
	for(int i=0;i<bc10;i++) {
	box10.add(sc.next());
	}
	System.out.println("enter no of planets at your box11 (0-9)");
	int bc11 = sc.nextInt();
	System.out.println("enter the planets at your box11 or null");
	if(bc11==0) {
		bc11=1;
	}
	for(int i=0;i<bc11;i++) {
	box11.add(sc.next());
	}
	System.out.println("enter no of planets at your box12 (0-9)");
	int bc12 = sc.nextInt();
	System.out.println("enter the planets at your box12 or null");
	if(bc12==0) {
		bc12=1;
	}
	for(int i=0;i<bc12;i++) {
	box12.add(sc.next());
	}
	
	}
	
	public void astro() {
	
	System.out.println("\n"+"At box1/lakanam"+"\n");
	for(String b1: box1) {
		
	switch(b1) {
	case "la":
	System.out.println("Lakanam");
	break;
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b1m:box7){
	System.out.println("=>"+b1m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b1s:box7){
	System.out.println("=>"+b1s);	
	}
	break;
	case "guru":
	System.out.println("................");		
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b1g:box5){
	System.out.println("=>"+b1g);
	}
	System.out.println("husband/wife/career/partnership");
	for(String b1g:box7){
	System.out.println("=>"+b1g);
	}
	System.out.println();
	System.out.println("privilege/father");
	for(String b1g:box9){
	System.out.println("=>"+b1g);
	}
	break;
	case "sani":
	System.out.println("................");		
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b1g:box3){
	System.out.println("=>"+b1g);
	}
	System.out.println("husband/wife/career/partnership");
	for(String b1g:box7){
	System.out.println("=>"+b1g);
	}
	System.out.println("karma/business");
	for(String b1g:box10){
	System.out.println("=>"+b1g);
	}
	break;
	case "suk":
	System.out.println("................");		
	System.out.println("sukran sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b1su:box7){
	System.out.println("=>"+b1su);
	}
	break;
	case "sev":
	System.out.println("................");		
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b1se:box4){
	System.out.println("=>"+b1se);
	}
	System.out.println("husband/wife/career/partnership");
	for(String b1se:box7){
	System.out.println("=>"+b1se);
	}
	System.out.println("life durability");
	for(String b1se:box8){
	System.out.println("=>"+b1se);
	}
	break;
	case "bud":
	System.out.println("................");		
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b1bu:box7){
	System.out.println("=>"+b1bu);	
	}
	break;
	case "ragu":
	System.out.println("................");		
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b1ra:box7){
	System.out.println("=>"+b1ra);	
	}
	break;
	case "kethu":
	System.out.println("................");		
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b1ke:box7){
	System.out.println("=>"+b1ke);	
	}
	break;
	default:
	System.out.println("no planets at box1");
	break;
	}	
	}
	
	System.out.println("\n"+"At box2/prosperity/family/vocal ability"+"\n");
	for(String b2: box2) {
	
	switch(b2) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b2m:box8){
	System.out.println("=>"+b2m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b2s:box8){
	System.out.println("=>"+b2s);	
	}
	break;
	case "guru":
	System.out.println("................");		
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b2g:box6){
	System.out.println("=>"+b2g);
	}
	System.out.println("life durability");
	for(String b2g:box8){
	System.out.println("=>"+b2g);
	}
	System.out.println("karma/business");
	for(String b2g:box10){
	System.out.println("=>"+b2g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b2g:box4){
	System.out.println("=>"+b2g);
	}
	System.out.println("life durability");
	for(String b2g:box8){
	System.out.println("=>"+b2g);
	}
	System.out.println("profit/elder siblings");
	for(String b2g:box11){
	System.out.println("=>"+b2g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");	
	System.out.println("................");	
	System.out.println("life durability");
	for(String b2su:box8){
	System.out.println("=>"+b2su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b2se:box5){
	System.out.println("=>"+b2se);
	}
	System.out.println("life durability");
	for(String b2se:box8){
	System.out.println("=>"+b2se);
	}
	System.out.println("privilege/father");
	for(String b2se:box9){
	System.out.println("=>"+b2se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b2bu:box8){
	System.out.println("=>"+b2bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b2ra:box8){
	System.out.println("=>"+b2ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b2ke:box8){
	System.out.println("=>"+b2ke);	
	}
	break;
	default:
	System.out.println("no planets at box2");
	break;
	}
	}
	
	System.out.println("\n"+"At box3/young siblings/courage"+"\n");
	for(String b3: box3) {
		
	switch(b3) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b3m:box9){
	System.out.println("=>"+b3m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b3s:box9){
	System.out.println("=>"+b3s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b3g:box7){
	System.out.println("=>"+b3g);
	}
	System.out.println("privilege/father");
	for(String b3g:box9){
	System.out.println("=>"+b3g);
	}
	System.out.println("profit/elder siblings");
	for(String b3g:box11){
	System.out.println("=>"+b3g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b3g:box5){
	System.out.println("=>"+b3g);
	}
	System.out.println("privilege/father");
	for(String b3g:box9){
	System.out.println("=>"+b3g);
	}
	System.out.println("spending/motcha/ending");
	for(String b3g:box12){
	System.out.println("=>"+b3g);
	}
	break;
	case "suk":
	System.out.println("................");		
	System.out.println("sukran sight on:");	
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b3su:box9){
	System.out.println("=>"+b3su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b3se:box6){
	System.out.println("=>"+b3se);
	}
	System.out.println("privilege/father");
	for(String b3se:box9){
	System.out.println("=>"+b3se);
	}
	System.out.println("karma/business");
	for(String b3se:box10){
	System.out.println("=>"+b3se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b3bu:box9){
	System.out.println("=>"+b3bu);	
	}
	break;
	case "ragu":
	System.out.println("................");		
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b3ra:box9){
	System.out.println("=>"+b3ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b3ke:box9){
	System.out.println("=>"+b3ke);	
	}
	break;
	default:
	System.out.println("no planets at box3");
	break;
	}
	}
	
	System.out.println("\n"+"At box4/pleasure/mother"+"\n");
	for(String b4: box4) {
		
	switch(b4) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b4m:box10){
	System.out.println("=>"+b4m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b4s:box10){
	System.out.println("=>"+b4s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b4g:box8){
	System.out.println("=>"+b4g);
	}
	System.out.println("karma/business");
	for(String b4g:box10){
	System.out.println("=>"+b4g);
	}
	System.out.println("spending/motcha/ending");
	for(String b4g:box12){
	System.out.println("=>"+b4g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b4g:box6){
	System.out.println("=>"+b4g);
	}
	System.out.println("karma/business");
	for(String b4g:box10){
	System.out.println("=>"+b4g);
	}
	System.out.println("lakanam/about you");
	for(String b4g:box1){
	System.out.println("=>"+b4g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b4su:box10){
	System.out.println("=>"+b4su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b4se:box7){
	System.out.println("=>"+b4se);
	}
	System.out.println("karma/business");
	for(String b4se:box10){
	System.out.println("=>"+b4se);
	}
	System.out.println("profit/elder siblings");
	for(String b4se:box11){
	System.out.println("=>"+b4se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b4bu:box10){
	System.out.println("=>"+b4bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b4ra:box10){
	System.out.println("=>"+b4ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b4ke:box10){
	System.out.println("=>"+b4ke);	
	}
	break;
	default:
	System.out.println("no planets at box4");
	break;
	}
	}
	
	System.out.println("\n"+"At box5/previous birth blessings/children"+"\n");
	for(String b5: box5) {
	switch(b5) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b5m:box11){
	System.out.println("=>"+b5m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b5s:box11){
	System.out.println("=>"+b5s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b5g:box9){
	System.out.println("=>"+b5g);
	}
	System.out.println("profit/elder siblings");
	for(String b5g:box11){
	System.out.println("=>"+b5g);
	}
	System.out.println("lakanam/about you");
	for(String b5g:box1){
	System.out.println("=>"+b5g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("husband/wife/career/partnership");
	for(String b5g:box7){
	System.out.println("=>"+b5g);
	}
	System.out.println("profit/elder siblings");
	for(String b5g:box11){
	System.out.println("=>"+b5g);
	}
	System.out.println("prosperity/vocal ability");
	for(String b5g:box2){
	System.out.println("=>"+b5g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b5su:box11){
	System.out.println("=>"+b5su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b5se:box8){
	System.out.println("=>"+b5se);
	}
	System.out.println("profit/elder siblings");
	for(String b5se:box11){
	System.out.println("=>"+b5se);
	}
	System.out.println("spending/motcha/ending");
	for(String b5se:box12){
	System.out.println("=>"+b5se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b5bu:box11){
	System.out.println("=>"+b5bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b5ra:box11){
	System.out.println("=>"+b5ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b5ke:box11){
	System.out.println("=>"+b5ke);	
	}
	break;
	default:
	System.out.println("no planets at box5");
	break;
	}
	
	}
	
	System.out.println("\n"+"At box6/debt/disease/enemy"+"\n");
	for(String b6: box6) {
	switch(b6) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b6m:box12){
	System.out.println("=>"+b6m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b6s:box12){
	System.out.println("=>"+b6s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b6g:box10){
	System.out.println("=>"+b6g);
	}
	System.out.println("spending/motcha/ending");
	for(String b6g:box12){
	System.out.println("=>"+b6g);
	}
	System.out.println("prosperity/vocal ability");
	for(String b6g:box2){
	System.out.println("=>"+b6g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("life durability");
	for(String b6g:box8){
	System.out.println("=>"+b6g);
	}
	System.out.println("spending/motcha/ending");
	for(String b6g:box12){
	System.out.println("=>"+b6g);
	}
	System.out.println("young siblings/courage");
	for(String b6g:box3){
	System.out.println("=>"+b6g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b6su:box12){
	System.out.println("=>"+b6su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b6se:box9){
	System.out.println("=>"+b6se);
	}
	System.out.println("spending/motcha/ending");
	for(String b6se:box12){
	System.out.println("=>"+b6se);
	}
	System.out.println("lakanam/about you");
	for(String b6se:box1){
	System.out.println("=>"+b6se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b6bu:box12){
	System.out.println("=>"+b6bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b6ra:box12){
	System.out.println("=>"+b6ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b6ke:box12){
	System.out.println("=>"+b6ke);	
	}
	break;
	default:
	System.out.println("no planets at box6");
	break;
	}
	
	}
	
	System.out.println("\n"+"At box7/husband/wife/career/partnership"+"\n");
	for(String b7: box7) {
		
	switch(b7) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b7m:box1){
	System.out.println("=>"+b7m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b7s:box1){
	System.out.println("=>"+b7s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b7g:box11){
	System.out.println("=>"+b7g);
	}
	System.out.println("lakanam/about you");
	for(String b7g:box1){
	System.out.println("=>"+b7g);
	}
	System.out.println("young siblings/courage");
	for(String b7g:box3){
	System.out.println("=>"+b7g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("privilege/father");
	for(String b7g:box9){
	System.out.println("=>"+b7g);
	}
	System.out.println("lakanam/about you");
	for(String b7g:box1){
	System.out.println("=>"+b7g);
	}
	System.out.println("pleasure/mother");
	for(String b7g:box4){
	System.out.println("=>"+b7g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");	
	System.out.println("................");	
	for(String b7su:box1){
	System.out.println("=>"+b7su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b7se:box10){
	System.out.println("=>"+b7se);
	}
	System.out.println("lakanam/about you");
	for(String b7se:box1){
	System.out.println("=>"+b7se);
	}
	System.out.println("prosperity/vocal ability");
	for(String b7se:box2){
	System.out.println("=>"+b7se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b7bu:box1){
	System.out.println("=>"+b7bu);	
	}
	break;
	case "ragu":
	System.out.println("................");		
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b7ra:box1){
	System.out.println("=>"+b7ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b7ke:box1){
	System.out.println("=>"+b7ke);	
	}
	break;
	default:
	System.out.println("no planets at box7");
	break;
	}
	
	}
	
	System.out.println("\n"+"At box8/life durability"+"\n");
	for(String b8: box8) {
		
	switch(b8) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b8m:box2){
	System.out.println("=>"+b8m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b8s:box2){
	System.out.println("=>"+b8s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b8g:box12){
	System.out.println("=>"+b8g);
	}
	System.out.println("prosperity/vocal ability");
	for(String b8g:box2){
	System.out.println("=>"+b8g);
	}
	System.out.println("pleasure/mother");
	for(String b8g:box4){
	System.out.println("=>"+b8g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("karma/business");
	for(String b8g:box10){
	System.out.println("=>"+b8g);
	}
	System.out.println("prosperity/vocal ability");
	for(String b8g:box2){
	System.out.println("=>"+b8g);
	}
	System.out.println("previous birth blessings/children");
	for(String b8g:box5){
	System.out.println("=>"+b8g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");	
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b8su:box2){
	System.out.println("=>"+b8su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b8se:box11){
	System.out.println("=>"+b8se);
	}
	System.out.println("prosperity/vocal ability");
	for(String b8se:box2){
	System.out.println("=>"+b8se);
	}
	System.out.println("young siblings/courage");
	for(String b8se:box3){
	System.out.println("=>"+b8se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b8bu:box2){
	System.out.println("=>"+b8bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b8ra:box2){
	System.out.println("=>"+b8ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b8ke:box2){
	System.out.println("=>"+b8ke);	
		}
	break;
	default:
	System.out.println("no planets at box8");
	break;
	}
	
	}
	
	System.out.println("\n"+"At box9/privilege/father"+"\n");
	for(String b9: box9) {
	switch(b9) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b9m:box3){
	System.out.println("=>"+b9m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b9s:box3){
	System.out.println("=>"+b9s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b9g:box1){
	System.out.println("=>"+b9g);
	}
	System.out.println("young siblings/courage");
	for(String b9g:box3){
	System.out.println("=>"+b9g);
	}
	System.out.println("previous birth blessings/children");
	for(String b9g:box5){
	System.out.println("=>"+b9g);
	}
	break;
	case "sani":
	System.out.println("................");		
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("profit/elder siblings");
	for(String b9g:box11){
	System.out.println("=>"+b9g);
	}
	System.out.println("young siblings/courage");
	for(String b9g:box3){
	System.out.println("=>"+b9g);
	}
	System.out.println("debt/disease/enemy");
	for(String b9g:box6){
	System.out.println("=>"+b9g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");	
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b9su:box3){
	System.out.println("=>"+b9su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b9se:box12){
	System.out.println("=>"+b9se);
	}
	System.out.println("young siblings/courage");
	for(String b9se:box3){
	System.out.println("=>"+b9se);
	}
	System.out.println("pleasure/mother");
	for(String b9se:box4){
	System.out.println("=>"+b9se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b9bu:box3){
	System.out.println("=>"+b9bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b9ra:box3){
	System.out.println("=>"+b9ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b9ke:box3){
	System.out.println("=>"+b9ke);	
		}
	break;
	default:
	System.out.println("no planets at box9");
	break;
	}
	
	}
	
	System.out.println("\n"+"At box10/karma/business"+"\n");
	for(String b10: box10) {
		
	switch(b10) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b10m:box4){
	System.out.println("=>"+b10m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b10s:box4){
	System.out.println("=>"+b10s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b10g:box2){
	System.out.println("=>"+b10g);
	}
	System.out.println("pleasure/mother");
	for(String b10g:box4){
	System.out.println("=>"+b10g);
	}
	System.out.println("debt/disease/enemy");
	for(String b10g:box6){
	System.out.println("=>"+b10g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("spending/motcha/ending");
	for(String b10g:box12){
	System.out.println("=>"+b10g);
	}
	System.out.println("pleasure/mother");
	for(String b1g:box4){
	System.out.println("=>"+b1g);
	}
	System.out.println("husband/wife/career/partnership");
	for(String b10g:box7){
	System.out.println("=>"+b10g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b10su:box4){
	System.out.println("=>"+b10su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b10se:box1){
	System.out.println("=>"+b10se);
	}
	System.out.println("pleasure/mother");
	for(String b10se:box4){
	System.out.println("=>"+b10se);
	}
	System.out.println("previous birth blessings/children");
	for(String b10se:box5){
	System.out.println("=>"+b10se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b10bu:box4){
	System.out.println("=>"+b10bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b10ra:box4){
	System.out.println("=>"+b10ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b10ke:box4){
	System.out.println("=>"+b10ke);	
	}
	break;
	default:
	System.out.println("no planets at box10");
	break;
	}
	
	}
	
	System.out.println("\n"+"At box11/profit/elder siblings"+"\n");
	for(String b11: box11) {
		
	switch(b11) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b11m:box5){
	System.out.println("=>"+b11m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b11s:box5){
	System.out.println("=>"+b11s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b11g:box3){
	System.out.println("=>"+b11g);
	}
	System.out.println("previous birth blessings/children");
	for(String b11g:box5){
	System.out.println("=>"+b11g);
	}
	System.out.println("husband/wife/career/partnership");
	for(String b11g:box7){
	System.out.println("=>"+b11g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("lakanam/about you");
	for(String b11g:box1){
	System.out.println("=>"+b11g);
	}
	System.out.println("previous birth blessings/children");
	for(String b11g:box5){
	System.out.println("=>"+b11g);
	}
	System.out.println("life durability");
	for(String b11g:box8){
	System.out.println("=>"+b11g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");	
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b11su:box5){
	System.out.println("=>"+b11su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b11se:box2){
	System.out.println("=>"+b11se);
	}
	System.out.println("previous birth blessings/children");
	for(String b11se:box5){
	System.out.println("=>"+b11se);
	}
	System.out.println("debt/disease/enemy");
	for(String b11se:box6){
	System.out.println("=>"+b11se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b11bu:box5){
	System.out.println("=>"+b11bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b11ra:box5){
	System.out.println("=>"+b11ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("previous birth blessings/children");
	for(String b11ke:box5){
	System.out.println("=>"+b11ke);	
	}
	break;
	default:
	System.out.println("no planets at box11");
	break;
	
	}
	
	}
	
	System.out.println("\n"+"At box12/spending/motcha/ending"+"\n");
	for(String b12: box12) {
		
	switch(b12) {
	case "moon":
	System.out.println("................");	
	System.out.println("moon sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b12m:box6){
	System.out.println("=>"+b12m);	
	}
	break;
	case "sun":
	System.out.println("................");	
	System.out.println("sun sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b12s:box6){
	System.out.println("=>"+b12s);	
	}
	break;
	case "guru":
	System.out.println("................");	
	System.out.println("guru sight on:");
	System.out.println("................");	
	System.out.println("pleasure/mother");
	for(String b12g:box4){
	System.out.println("=>"+b12g);
	}
	System.out.println("debt/disease/enemy");
	for(String b12g:box6){
	System.out.println("=>"+b12g);
	}
	System.out.println("life durability");
	for(String b12g:box8){
	System.out.println("=>"+b12g);
	}
	break;
	case "sani":
	System.out.println("................");	
	System.out.println("sani sight on:");
	System.out.println("................");	
	System.out.println("prosperity/vocal ability");
	for(String b12g:box2){
	System.out.println("=>"+b12g);
	}
	System.out.println("debt/disease/enemy");
	for(String b12g:box6){
	System.out.println("=>"+b12g);
	}
	System.out.println("privilege/father");
	for(String b12g:box9){
	System.out.println("=>"+b12g);
	}
	break;
	case "suk":
	System.out.println("................");	
	System.out.println("sukran sight on:");	
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b12su:box6){
	System.out.println("=>"+b12su);
	}
	break;
	case "sev":
	System.out.println("................");	
	System.out.println("sevvai sight on:");
	System.out.println("................");	
	System.out.println("young siblings/courage");
	for(String b12se:box3){
	System.out.println("=>"+b12se);
	}
	System.out.println("debt/disease/enemy");
	for(String b12se:box6){
	System.out.println("=>"+b12se);
	}
	System.out.println("husband/wife/career/partnership");
	for(String b12se:box7){
	System.out.println("=>"+b12se);
	}
	break;
	case "bud":
	System.out.println("................");	
	System.out.println("budhan sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b12bu:box6){
	System.out.println("=>"+b12bu);	
	}
	break;
	case "ragu":
	System.out.println("................");	
	System.out.println("ragu sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b12ra:box6){
	System.out.println("=>"+b12ra);	
	}
	break;
	case "kethu":
	System.out.println("................");	
	System.out.println("kethu sight on:");
	System.out.println("................");	
	System.out.println("debt/disease/enemy");
	for(String b12ke:box6){
	System.out.println("=>" +b12ke);	
	}
	break;
	default:
	System.out.println("no planets at box12");
	break;
	}
	
	}
	System.out.println();
		
	}	
		
	}
	
	


