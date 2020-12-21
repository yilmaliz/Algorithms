package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		// I have create a while loop which will run for 12 times for 12 rounds.
		
		// This while loop starts with selection of the random numbers. I have created the 'createRondomNum()' method to create random numbers.
			// sNumber, dNumber and numDigit are created by this method. sNumber means the 5 cards number, dNumber means the different card number, and numDigit is the different card's number.
			// dNumber and sNumber must be different numbers, so I called 'createRondomNum()' method for them in a while loop, if they are same while loop runs again.
		
		
		// I have create a list to start game. This list is [0,0,0,0,0,0] and name is gameList. I have crate a list with 0's, because this game does not contain number 0.
			// 0's in the gameList means, this card is not opened yet
			// I have create a boolean variable 'founded = false' and I create a while loop. When the founded is false, this while loop runs again.
			// When player enter a card number, if the card has different number, gameList changes and founded changes to true and while loop ends. 
			// if the card has not different number, gameList changes again but founded does not change to true and while loop continue(for 5 tries).
			// Method 'printNumbers' run with gameList in each loop.
			// I have create points list to save round points for each loop.
			
		
		
		// I have create method 'printNumbers' to print the game list. In this method, I used for loops switch-case. 
			// I have create 6 methods to print lines of digits.
				//printType0: '********' 
				//printType1: '       *' 
				//printType2: '*       ' 
				//printType3: '*      *' 
				//printType4: '* ******' 
				//printType5: '* *    *'
			
		// At the end, I have create method 'printResult' to print, game points.
			// I have used points list to print points.
		
		System.out.println("****Welcome to Number Guess Name****\r\n"
				+ "We generate 6 cards. 5 cards have same number. But only one card different number.\r\n"
				+ "Your task is finding the card that differs in the least attempts\r\n"
				+ "Let's start game.\r\n");
		
		int tPoint = 0;
		int round = 1;
		
		ArrayList points = new ArrayList();
		
		
		while(round <= 12) {
			int rPoint = 5;
			int sNumber = 0;
			int dNumber = 0;
			int numDigit = createRondomNum(6);
			boolean sameNumber = true;
	
			while(sameNumber == true) {
				sNumber = createRondomNum(10);
				dNumber = createRondomNum(10);
				
				if(sNumber != dNumber) {
					sameNumber = false;
				}
			}
			
			//System.out.println(num1+" "+num2+" "+num3);

			System.out.println("ROUND "+round+":\n");
			ArrayList  gameList = new ArrayList();
			
			for(int i = 0 ; i < 6;i++) {
				gameList.add(0);
			}
			
			ArrayList  usedNumbers = new ArrayList();
			
			boolean founded = false;
			while (founded == false & rPoint > 0) {
				
				printNumbers(gameList);
				Scanner scan = new Scanner(System.in);
				System.out.println("Which card has different number:");
				int num = scan.nextInt();
				
				
				if(usedNumbers.contains(num)) {
					System.out.println("You have already enter " + num+".\n");
					continue;
				}
				
				if(num < 1 || num>6) {
					System.out.println("The cart number can be 1,2,3,4,5,6. Try again...");
					continue;
				}
				
				if (num == numDigit) {
					gameList.set(num-1, dNumber);
					//System.out.println("The new list : "+gameList);
					System.out.print("Congratulations, you find the different card. ");
					founded = true;
					
				}
				
				else {
					gameList.set(num-1, sNumber);
					//System.out.println("The new list : "+gameList);
					System.out.println("Sorry, card "+ num +" does not have different number.\n");
					rPoint--;
					usedNumbers.add(num);
				}	
			}
			
			System.out.print("You get "+rPoint+" point(s) in round"+round+"\n\n");
			
			points.add(rPoint);
			printNumbers(gameList);
			tPoint = tPoint + rPoint;
			round++;
			System.out.println("\n\n\n");
			
		}
		
		printResult(points,tPoint);
		
	}

	private static void printResult(ArrayList points, int tPoint) {
		System.out.println("Game is finished\nYou score is: "+tPoint+"\nRound #		Score"+"\n--------	-----");
		for (int i = 0; i < points.size();i++) {
			int point = (int) points.get(i);
			System.out.println((i+1)+". Round	"+point);
		}
	}
	private static void printNumbers(ArrayList gameList) {

		String cards="";
		for(int i = 1; i<7;i++) {
			cards = cards + "Card"+i+"     ";
		}
		
		System.out.println(cards);
		for(int i =0; i < 8;i++) {
			for(int j = 0; j < gameList.size();j++) {
				
				int num = (int) gameList.get(j) ;
				
				switch(num) {

					case 1:
						System.out.print(printType1());
						System.out.print("  ");	
						break;
					case 2:
						if(i == 0 || i == 4 || i ==7) {
							System.out.print(printType0());
						}
						else if(i == 5 || i == 6) {
							System.out.print(printType2());
						}else {
							System.out.print(printType1());
						}
						System.out.print("  ");
						break;
					case 3:
						if(i == 0 || i == 4 || i ==7) {
							System.out.print(printType0());
						}else {
							System.out.print(printType1());
						}
						System.out.print("  ");
						break;
					case 4:
						if(i == 4) {
							System.out.print(printType0());
						}else if(i > 4 ) {
							System.out.print(printType1());
						}else {
							System.out.print(printType3());
						}
						System.out.print("  ");
						break;
					case 5:
						if(i == 0 || i == 4 || i ==7) {
							System.out.print(printType0());
						}
						else if(i == 5 || i == 6) {
							System.out.print(printType1());
						}else {
							System.out.print(printType2());
						}
						System.out.print("  ");
						break;
					case 6:
						if(i == 0 || i == 4 || i ==7) {
							System.out.print(printType0());
						}
						else if(i == 5 || i == 6) {
							System.out.print(printType3());
						}else {
							System.out.print(printType2());
						}
						System.out.print("  ");
						break;
					case 7:
						if(i == 0) {
							System.out.print(printType0());
						}else if(i == 1 || i ==2) {
							System.out.print(printType3());
						}else {
							System.out.print(printType1());
						}
						System.out.print("  ");
						break;
					case 8:
						if(i == 0 || i == 4 || i ==7) {
							System.out.print(printType0());
						}else {
							System.out.print(printType3());
						}
						System.out.print("  ");
						break;
					case 9:
						if(i == 0 || i == 4 || i ==7) {
							System.out.print(printType0());
						}
						else if(i == 5 || i == 6) {
							System.out.print(printType1());
						}else {
							System.out.print(printType3());
						}
						System.out.print("  ");
						break;
					case 10:
						if(i == 0 || i == 7) {
							System.out.print(printType4());
						}else {
							System.out.print(printType5());
						}
						System.out.print("  ");
						break;			
					default:
						System.out.print(printType0());
						System.out.print("  ");	
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
	}
	private static String printType5() {
		String p = "";
		for(int i = 0 ; i<8;i++) {
			if(i == 0 || i == 2 || i == 7) {
				p = p + "*";
			}else {
				p = p + " ";
			}
		}
		return p;
		
	}
	private static String printType4() {
		String p = "";
		
		for(int i = 0 ; i<8;i++) {
			if(i == 1) {
				p = p + " ";
			}else {
				p = p + "*";
			}
		}
		return p;
		
	}
	private static String printType3() {
		String p = "";
		for(int i =0 ;i<8;i++) {
			if(i==0 || i == 7) {
				p = p + "*";
			}else {
				p = p + " ";
			}
		}
		return p;
		
	}
	private static String printType2() {
		String p = "";
		for(int i =0 ;i<8;i++) {
			if(i==0) {
				p = p + "*";
			}else {
				p = p + " ";
			}
		}
		return p;
		
	}
	private static String printType1() {
		String p = "";
		for(int i =0 ;i<8;i++) {
			if(i==7) {
				p = p + "*";
			}else {
				p = p + " ";
			}
		}
		return p;
		
	}
	private static String printType0() {
		String p = "";
		for(int i = 0; i<8;i++) {
			p = p + "*"; 
		}
		return p;
		
	}

	private static int createRondomNum(int i) {
		int number = (int) ( i*Math.random()) + 1;
		return number;
	}
}
