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
		int orderChoice;

		getList(list, input);

		orderChoice = getOrder(input);

		sortTheArray(list, orderChoice);

	}

	public static double[] createList(Scanner input){
		int numberInList;
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

	public static int getOrder(Scanner input){
		char choice;

		System.out.print("Do you want to sort it in asxending or descending order: ");
		choice = input.next().charAt(0);
		choice = Character.toUpperCase(choice);
		if(choice == 'A')
			return 0;
		else if(choice == 'D');
			return 1;

	}

	public static void sortTheArray(double[] array, int choice){

		System.out.print("\nThe original order is: ");
		displayOrder(array);

		switch(choice){
			case 0:
				bubbleSortUp(array);
				System.out.print("\nThe sorted list In ascending order: ");
				displayOrder(array);
				break;
			case 1:
				bubbleSortDown(array);
				System.out.print("\nThe sorted list in descending order: ");
				displayOrder(array);
				break;
		}
	}

	public static void bubbleSortUp(double[] list){
		double temp;
		boolean outOfOrder = true;

		int rounds = 0;
		int totalCount = list.length - 1;
		while(outOfOrder){
			outOfOrder = false;
			for(int count = 0; count < totalCount - rounds; count++){
				if(list[count] > list[count + 1]){
					temp = list[count];
					list[count] = list[count + 1];
					list[count + 1] = temp;
					outOfOrder = true;
				}
			}
			rounds++;
		}
	}

	public static void bubbleSortDown(double[] list){
		double temp;
		boolean outOfOrder = true;

		int rounds = 0;
		int totalCount = list.length - 1;
		while(outOfOrder){
			outOfOrder = false;
			for(int count = totalCount; count > 0; count--){
				if(list[count] > list[count - 1]){
					temp = list[count];
					list[count] = list[count - 1];
					list[count - 1] = temp;
					outOfOrder = true;
				}
			}
			rounds++;
		}
	}

	public static void displayOrder(double[] list){

		for(double value : list)
			System.out.printf(" %.2f", value);
		System.out.println("");
	}
}
