package bridgelabz.com.day5;
/*
 * Author: Swapnil
 * Program to check year is leap year or not
 */
import java.util.Scanner;

import utility.Util;

public class LeapYear {

	public static void main(String[] args) {
		
		int year = Util.check();
		if(Util.leapYear(year)) {
			System.out.println(year + "is leap year");
		}
		else {
			System.out.println(year + "is not leap year");
		}
	}


}