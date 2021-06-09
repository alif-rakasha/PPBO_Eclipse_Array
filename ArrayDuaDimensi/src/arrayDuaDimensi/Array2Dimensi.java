package arrayDuaDimensi;

public class Array2Dimensi {

	public static void main(String[] args) {
		
		String[][] myBouquet = {{"Red", "Peach", "Yellow"},
								{"Yellow", "White", "Blue"},
								{"Green", "Blue", "Purple"},
								{"White", "White", "White"},
								{"Purple", "Pink", "Violet"},
								{"Pink", "Orange", "White"}};

		for(int i = 0; i < myBouquet.length; i++) {
			for(int j = 0; j < myBouquet[i].length; j++) {
				System.out.println(myBouquet[i][j]);
			}
		}
	}
}