//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package modulo;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

/**
 * Fizz Buzz
 * 
 * In this project, we're going to build FizzBuzz. It's a children's game where
 * you count from 1 to 20. Easy, right? Here's the catch: instead of saying
 * numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
 * by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
 * 
 * So the rules are: Any number divisible by 3 is replaced by the word fizz Any
 * number divisible by 5 is replaced by the word buzz. Numbers divisible by both
 * 3 and 5 become fizzbuzz.
 * 
 * Print your results to the console, or using JOptionPane if you like.
 * 
 * If your code is correct, the output will be:
 * 
 * 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
 * 
 **/

public class FizzBuzz {
	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog("How high do you want to count to?");
		int i3 = Integer.parseInt(i);
		for (int i2 = 1; i2 < i3; i2++) {
			if (i2 % 3 == 0&&i2% 5==0) {
				System.out.println("nothin'");
			} else if (i2 % 3 == 0) {
				System.out.println("fizz");
			} else if (i2 % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i2);
			}
		}
	}
}
