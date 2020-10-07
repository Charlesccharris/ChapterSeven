import java.util.Scanner;

class Homework7_18{
	public static void main(String[] args){
	/*(Bubble sort)
	Write a sort method that uses the bubble-sort algorithm.
	The bubblesort algorithm makes several passes through the array.
	On each pass, successive neighboring pairs are compared.
	If a pair is not in order, its values are swapped; otherwise, the values remain unchanged.
	The technique is called a bubble sort or sinking sort
	because the smaller values gradually “bubble” their way to the top and the larger values “sink” to the bottom.
	Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.*/

	Scanner input = new Scanner(System.in);
	double[] list = createList(input);
//	double[] list = {1.3, 5.7, 90, 9.2, 5.6, 30.1, 63.4, 9, 8.01, 8.02};
	getList(list, input);
	System.out.print("The original order is: ");

	displayOrder(list);
	bubbleSort(list);
	System.out.print("The sorted order is: ");
	displayOrder(list);
	}

	public static double[] createList(Scanner input){
	int numberInList = 10;
	System.out.print("How many numbers you want to sort: ");
	numberInList = input.nextInt();
	double[] list = new double[numberInList];
	return list;
	}

	public static void getList(double[] list, Scanner input){
	System.out.println("\nYou will need to enter " + list.length + " numbers");

		for(int count = 0; count < list.length; count++){
			System.out.print("Enter number #" + (count + 1) + ": ");
			list[count] = input.nextDouble();
		}
	}

	public static void bubbleSort(double[] list){
	int number1;
	int number2;
	double temp;
	int rounds = 0;
	int totalCount = list.length - 1;
		while(rounds < list.length){
			number1 = 0;
			number2 = 1;
			for(int count = 0; count < totalCount; count++, number1++, number2++){
				if(list[number1] > list[number2]){
					temp = list[number1];
					list[number1] = list[number2];
					list[number2] = temp;
				}

			}

			rounds++;
		}
	}

	public static void displayOrder(double[] list){

		for(int count = 0; count < list.length; count++){
			System.out.print(list[count] + ", ");
		}
		System.out.println("");
	}

}
