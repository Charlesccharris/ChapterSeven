class ArrayTesting{
	public static void main(String[] args){
	double total = 0;
	int count = 0;

	int[] newArray = new int[2];
	newArray[0] = 10;
	newArray[1] = 12;

	System.out.println(newArray[0]);


	int[] secondArray = new int[10];

		for(count = 0; count < secondArray.length; count++){
			secondArray[count] = (int)(Math.random()*100);
		}

		for(count = 0; count < secondArray.length; count++){
			System.out.print(secondArray[count] + " + ");
			total += secondArray[count];
		}

			System.out.println(total);

	}
}
