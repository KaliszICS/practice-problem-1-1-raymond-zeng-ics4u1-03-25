public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int sum2D(int numArray[][]){
	int sum = 0;
		for (int row = 0; row < numArray.length; row++) {
			for (int col = 0; col < numArray[row].length; col++) {
				sum += numArray[row][col];
		}
	}
	return sum;
}
	public static int sumRow(int numArray[][], int rowNum){
		int sum = 0;
		for (int col = 0; col < numArray[rowNum].length;col++)
		{sum += numArray[rowNum][col];}
		return sum;
	}
	public static int sumColumn(int numArray[][], int colNum){
		int sum = 0;
		for (int row = 0; row < numArray.length;row++)
		{sum += numArray[row][colNum];}
		return sum;
}
}
