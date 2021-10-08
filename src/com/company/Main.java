package com.company;
import java.util.Scanner;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("how old are you?");
	int age = input.nextInt();

	int lifeExpectancy = 81-age;
	int daysLeft = (int) Math.round(lifeExpectancy*365.25);
	int hoursLeft = randNum(24,1);
	int minutesLeft = randNum(60,1);

		System.out.println("how many hours of exercise do you do a week?");
		int userInput = input.nextInt();
		if (userInput < 0){
			userInput = 0;
		}
		if (userInput != 0){
			daysLeft = daysLeft - Math.round((((age*52)*userInput)/24)*7);
		}

		System.out.println("how many units of alcohol do you drink a week?");
		userInput = input.nextInt();
		if (userInput < 0){
			userInput = 0;
		}
		if (userInput != 0){
			minutesLeft = minutesLeft - (Math.round(age*52)*userInput)*15;
		}

		System.out.println("how many cigarettes do you smoke a week?");
		userInput = input.nextInt();
		if (userInput < 0){
			userInput = 0;
		}
		if (userInput != 0){
			minutesLeft = minutesLeft - (Math.round(age*52)*userInput)*15;
		}


		while (minutesLeft < 0){
			minutesLeft += 60;
			hoursLeft -= 1;
		}
		while (hoursLeft < 0){
			hoursLeft += 24;
			daysLeft -= 1;
		}

	System.out.println("You have "+daysLeft+" days,");
		System.out.println(hoursLeft+" hours,");
		System.out.println(minutesLeft+" minutes,");
		System.out.println("and "+randNum(60,1)+" seconds left to live");
    }
    public static int randNum(int max, int min){
    	Random rn = new Random();
    	int randNum = rn.nextInt((max-min)+1)+min;
    	return randNum;
	}
}
