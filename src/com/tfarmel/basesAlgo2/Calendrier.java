package com.tfarmel.basesAlgo2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendrier {
	
	private static Date date;
	private static String dateInit = "15/31/1582";
	private static int anneeInit = 1582;

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dfAn = new SimpleDateFormat("yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer une date au format dd/MM/yyyy : ");
		
		try {
			date = df.parse(sc.nextLine());
			DateFormat df1 = DateFormat.getDateInstance();
			int currentYear = c.get(Calendar.YEAR);
			String message;
			System.out.println("Current year : " + currentYear);
			c.setTime(date);
			int year = c.get(Calendar.YEAR);
			if((year % 4 == 0) && (year % 400 == 0)) {
				System.out.println(year + " est une année bissextile");
			}else {
				System.out.println(year + " est une année non bissextile");
				System.out.println(c.get(Calendar.DAY_OF_WEEK) + "° year of week");
			}
			System.out.println(df.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
