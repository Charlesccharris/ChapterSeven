class Homework7_16{
	public static void main(String[] args){
	/*(Execution time)
	Write a program that randomly generates an array of 100,000 integers and a key.
	Estimate the execution time of invoking the linearSearch method in Listing 7.6.
	Sort the array and estimate the execution time of invoking the binarySearch method in Listing 7.7.
	You can use the following code template to obtain the execution time:
	long startTime = System.currentTimeMillis();
	perform the task;
	long endTime = System.currentTimeMillis();
	long executionTime = endTime - startTime;*/

	long startTime = System.currentTimeMillis();

	int[] bigArray = createArray();
	int key = (int)(Math.random()*10000);

//	int[] bigArray = {10, 4, 3, 6, 8, 5, 9};
//	int key = 9;

//	printArray(bigArray);

	int match = linearSearch(bigArray, key);

	long endTime = System.currentTimeMillis();
	long executeTime = endTime - startTime;

	System.out.println("The number we are looking for is: " + key);
	System.out.println(match + " Was the corrisponding square");
	System.out.println("It took " + executeTime + " milliseconds, for the linear search to find it.");

	bubbleSort(bigArray);

//	selectionSort(bigArray);

//	printArray(bigArray);

//	match = linearSearch(bigArray, key);

	System.out.println("The number we are looking for is: " + key);
	System.out.println(match + " Was the corrisponding square");
	System.out.println("It took " + executeTime + " milliseconds, for the linear search to find it.");

	}

	public static int[] createArray(){

		int[] array = new int[100_000];

		for(int count = 0; count < array.length; count++){
			array[count] = (int)(Math.random()*10000);
		}

	return array;

	}


	public static int linearSearch(int[] bigArray, int key){
		int count = 0;


		for(count = 0; count < bigArray.length; count++){
			if(key == bigArray[count])
			return count;
		}

		return -1;
	}

	public static void selectionSort(int[] bigArray){
		for(int count = 0; count < bigArray.length - 1; count++){
			int currentMin = bigArray[count];
			int currentMinIndex = count;

			for(int round = count + 1; round < bigArray.length; round++){
				if(currentMin > bigArray[round]){
					currentMin = bigArray[count];
					currentMinIndex = round;
				}
			}
			if(currentMinIndex != count){
				bigArray[currentMinIndex] = bigArray[count];
				bigArray[count] = currentMin;
			}
			System.out.println("Current min is: " + currentMin);
		}
	}

	public static void printArray (int[] bigArray){
		for(double value: bigArray)
			System.out.printf("%.2f ", value);
	}

        public static void bubbleSort(int[] list){
        int temp;
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
}
