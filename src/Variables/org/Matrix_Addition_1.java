package Variables.org;

public class Matrix_Addition_1 {
	public static void main(String[] args) {
		System.out.println("  Matrix Addition  ");
		int arr[][] = new int[2][2];
		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 10;
		arr[1][1] = 20;
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[1][0] = 10;
		arr1[1][1] = 20;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr2[i][j] = arr[i][j] + arr1[i][j];
				System.out.println(arr2[i][j] + "  ");
			}
			System.out.println();

		}
	}

}
