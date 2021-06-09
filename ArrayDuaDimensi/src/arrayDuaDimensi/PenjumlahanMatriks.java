package arrayDuaDimensi;

public class PenjumlahanMatriks {

	public static void main(String[] args) {
		int a[][] = {{1,3,4}, {3,4,5}};
		int b[][] = {{1,3,4}, {3,4,5}};
		int c[][] = {{0,0,0}, {0,0,0}};

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				
				if(i == 1 && j == 0) //untuk ke garis baru
					System.out.println("");
				
				System.out.print(c[i][j] + " ");
			}
		}
	}

}
