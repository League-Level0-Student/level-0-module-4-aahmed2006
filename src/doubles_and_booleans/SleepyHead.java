package doubles_and_booleans;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?");
		if (weekday == 0) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}
		int vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?");
		if (vacation == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		if (isVacation == true || isWeekday == false) {
			System.out.println("Sleep in.");
		}
		if (isWeekday == true) {
			System.out.println("Get up lazybones!");
		}
		if (isWeekday == true && isVacation == true) {
			System.out.println("Sleep in.");
		}
		/*
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * 4 in�?.
		 */
	}
}
