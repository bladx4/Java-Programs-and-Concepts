//5. Write a java program to add two matrices
class five{
	public static void main(String args[]){
	int [][] matrixA= { {1,2,3},{4,5,6},{7,8,9}};
	int [][] matrixB = {{9,8,7},{6,5,4},{3,2,1}};
	
	int rows= matrixA.length;
	int cols = matrixB[0].length;
	int [][]sumMatrix= new int[rows][cols];
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			sumMatrix[i][j]= matrixA[i][j]+matrixB[i][j];
		}}

	System.out.println("sum of two matrices is :");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.print(sumMatrix[i][j] + " ");
		}
		System.out.println();
	}
}}