import java.util.Scanner;

class Homework7_21{
	public static void main(String[] args){
	/*(Game: bean machine)
	The bean machine, also known as a quincunx or the Galton box,
	is a device for statistics experiments named after English scientist Sir Francis Galton.
	It consists of an upright board with evenly spaced nails (or pegs) in a triangular form,
	Balls are dropped from the opening of the board.
	Every time a ball hits a nail, it has a 50% chance of falling to the left or to the right.
	The piles of balls are accumulated in the slots at the bottom of the board.
	Write a program that simulates the bean machine.
	Your program should prompt the user to enter the number of the balls and the number of the slots in the machine.
	Simulate the falling of each ball by printing its path.
	Display the final buildup of the balls in the slots in a histogram.
	Here is a sample run of the program:
	Enter the number of balls to drop: 5;
	Enter the number of slots in the bean machine: 8;
	LRLRLRR;
	RRLLLRR;
	LLRLLRR;
	RRLLLLL;
	LRLRRLR;
	   O;
	   O;
	  OOO
*/
	Scanner input = new Scanner(System.in);
	String finalBoard = "";
	System.out.print("Enter the number of slots: ");
	int numberOfSlots = input.nextInt();

	System.out.print("\nEnter the number of balls: ");
	int numberOfBalls = input.nextInt();

	int[] nailBoard = new int[numberOfSlots];

	fillArray(nailBoard);

	hitNail(nailBoard, numberOfBalls);

	finalBoard = printArray(nailBoard, finalBoard, numberOfBalls);

	System.out.print(finalBoard);
	}

	public static void fillArray(int[] array){

		for(int count = 0; count < array.length; count++){
			array[count] = 0;
		}

	}
	public static void hitNail(int[] array, int numberOfBalls){


		for(int balls = 0; balls < numberOfBalls; balls++){
			String nailList = "";
			int selection = 0;
			for(int count = 0; count < array.length - 1; count++){
				double direction = (double)(Math.random());
				if(direction >= .5){
					nailList += "R";
					selection += 1;
				}
				else{
					nailList += "L";
					selection += 0;
				}
			}
		if(numberOfBalls < 10)
			System.out.println(nailList);
		array[selection]++;
		}
	}

        public static String printArray(int[] list, String finalBoard, int numberOfBalls){
/*	    String[] ball = new String[9];
    		for (int i = 1; i > 0; i--) {
        		for (int j = 0; j <= 8; j++) {
            			if (i == list[j]) {
                			ball[j] = "O";
                			list[j]--;
            			}
				else
                			ball[j] = " ";
            			System.out.print(ball[j]);
        		}
        	System.out.println();
    		}

	return finalBoard;
*/
	for(int times = numberOfBalls; times > 0; times--){
                for(int value = 0; value < list.length; value++){
				if(list[value] == times){
					finalBoard += "O";
					list[value] -= 1;
				}
				else if(list[value] != times)
					finalBoard += " ";
		}
                finalBoard += "\n";
	}
	return finalBoard;


	}
}
