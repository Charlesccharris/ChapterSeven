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
	String finalBoard = "";
	String[] nailBoard = new String[8];

	fillArray(nailBoard);

	hitNail(nailBoard);

	finalBoard = printArray(nailBoard, finalBoard);
	hitNail(nailBoard);

	finalBoard = printArray(nailBoard, finalBoard);

	System.out.print(finalBoard);
	}

	public static void fillArray(String[] array){

		for(int count = 0; count < array.length; count++){
			array[count] = " ";
		}

	}
	public static void hitNail(String[] nailBoard){
	int selection = 0;

	String nailList = "";
		for(int count = 0; count < 8; count++){
			double direction = (double)(Math.random());
			if(direction >= .5){
				nailList += "R";
				selection += 1;
			}
			else{
				nailList += "L";
			}
		}
	System.out.println(nailList);
	nailBoard[selection] += "O";

	}

/*	public static void printArray(int[] array){

		for(int print : array);
			System.out.printf("%.0f ", print);
		System.out.println("");
	}
*/
        public static String printArray(String[] list, String finalBoard){

                for(int value = 0; value < list.length; value++){
                        finalBoard += list[value];
		}
                finalBoard += "\n";
	return finalBoard;
        }
}
