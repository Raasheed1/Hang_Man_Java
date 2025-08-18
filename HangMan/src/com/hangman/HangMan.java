package com.hangman;

import java.util.Random;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		
		visusl lives = new visusl(); //create obj for visual
		Random number = new Random();//Generating random number
		
		
		int ran = 4;
		int Chance=6;//Chance for play
		int rannum = number.nextInt(9);
//		lives.RemaingLives(Chance);
		System.out.println(rannum);
//		System.out.println(ntos.length());
		
		for(int i=Chance;i>=0;i--) {
			int num= user.nextInt();
			if(num!=rannum) {
				lives.RemaingLives(i);
				
				System.out.println("\n"+ (i-1)+"Chance left");
			}
			else{
				System.out.println("You saved the person");
			}
		}	
	}
}
