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

		int[] bigArray = createArray();
		int key = createKey();

//		int[] bigArray = {10, 9, 3, 6, 8, 5, 8, 5, 7, 8, 1, 2, 4, 6, 1, 0, 6};
//		int key = 9;

		timedLS(bigArray, key);

		timedSort(bigArray);

		timedBinarySearch(bigArray, key);
	}

	public static int[] createArray(){
		int[] array = new int[100_000];

			for(int count = 0; count < array.length; count++){
				array[count] = (int)(Math.random()*10000);
			}

		return array;
	}

	public static int createKey(){

		int key = (int)(Math.random()*10000);
		System.out.println("The key you are looking for is: " + key);
		return key;
	}

	public static void timedLS(int[] array, int key){

		long startTime = System.nanoTime();
		linearSearch(array, key);
		long endTime = System.nanoTime();
		long executeTime = endTime - startTime;
			if(executeTime < 1_000_000){
				System.out.println("It took " + executeTime + " nanoseconds, for the linear search to find it.");
			}
			else if(executeTime > 1_000_000){
				executeTime /= 1_000_000;
				System.out.println("It took " + executeTime + " milliseconds, for the linear search to find it.");
			}
	}

	public static void linearSearch(int[] array, int key){
		int count = 0;
		boolean lookingForKey = true;
		while (lookingForKey){
			for(count = 0; count < array.length; count++){
				if(key == array[count]){
					System.out.println("The key is in box " + count);
					lookingForKey = false;
					break;
				}
			}
			if(lookingForKey)
				System.out.println("The array didn't contain the key");
		}
	}

	public static void timedSort(int[] array){

		long startTime = System.nanoTime();
		java.util.Arrays.sort(array);
		long endTime = System.nanoTime();
		long executeTime = endTime - startTime;
			if(executeTime < 1_000_000){
				System.out.println("It took " + executeTime + " nanoseconds to sort the array.");
			}
			else if(executeTime > 1_000_000){
				executeTime /= 1_000_000;
				System.out.println("It took " + executeTime + " milliseconds to sort the array.");
			}
	}


	public static void timedBinarySearch(int[] array, int key){

		long startTime = System.nanoTime();
		binarySearch(array, key);
		long endTime = System.nanoTime();
		long executeTime = endTime - startTime;
			if(executeTime < 1_000_000){
				System.out.println("It took " + executeTime + " nanoseconds, for the binary search to find it.");
			}
			else if(executeTime > 1_000_000){
				executeTime /= 1_000_000;
				System.out.println("It took " + executeTime + " milliseconds, for the binary search to find it.");
			}
	}


	public static void binarySearch (int[] array, int key){
		int max = (array.length - 1);
		int min = 0;
		int middle = (max + min)/2;
		boolean keepGoing = true;
		int oldMid = 0;
		while(keepGoing){
			if(array[middle] > key){
//				System.out.println("The key is less than the value in box " + middle);
				oldMid = middle;
				max = middle;
				middle = (max + min)/2;
			}
			else if(array[middle] < key){
//				System.out.println("The key is greater than the value in box " + middle);
				oldMid = middle;
				min = middle;
				middle = (max + min)/2;
			}
			else if(array[middle] == key){
				System.out.println("The key is in square: " + middle);
				keepGoing = false;
			}
			if(oldMid == middle){
				System.out.println("The array didn't contain the key");
				keepGoing = false;
			}
		}
	}
}
