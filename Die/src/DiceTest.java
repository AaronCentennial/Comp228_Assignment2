/**
 * Created by Aaron Feranndes
 */

import java.util.Scanner;

public class DiceTest {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int option;
		int total;

		System.out.println("Welcome to the Dice game");
		System.out.println("The game will work by you first making a guess");
		System.out.println("between 2 and 12 I (the computer) will roll the dice 3 times");
		System.out.println("if any of those choices are equal to your selection then you win");
		System.out.println("If not then I win");
		System.out.println("\nLets start this game");
		while (true){
			System.out.print("Enter a number between 2 and 12: ");
			option=Integer.parseInt(scanner.nextLine());
			if(option<1 || option<13){
				break;
			}//if
		}//while

		for (int i = 0; i < 3; i++) {
			total=(new Die().get_dieValue())+(new Die().get_dieValue());
			System.out.println(i);
			//System.out.println(total);
			if(total==option){
				System.out.println("You win!!!");
				break;
			}
			else {
				if(i==2){
					System.out.println("Sucker! I win!!!");
				}
			}
		}//for

	}
}
