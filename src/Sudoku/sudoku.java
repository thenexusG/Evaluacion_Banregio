package Sudoku;

public class sudoku {

	public static void main(String[] args) {
		sudoku q = new sudoku();
		System.out.println(q.resolver(tablero));
	
	}

	static int tablero[][] = { 
			{5,3,4,6,7,8,9,1,2},
			{6,7,2,1,9,5,3,4,8},
			{1,9,8,3,4,2,5,6,7},
			{8,5,9,7,6,1,4,2,3},
			{4,2,6,8,5,3,7,9,1},
			{7,1,3,9,2,4,8,5,6},
			{9,6,1,5,3,7,2,8,4},
			{2,8,7,4,1,9,6,3,5},
			{3,4,5,2,8,6,1,7,9}
			};

	public static boolean resolver(int tablero[][]) {
		
		for (int i = 0; i < 9; i++) {
			boolean[] check_fila = new boolean[9];
			boolean[] check_columna = new boolean[9];
		
			for (int j = 0; j < 9; j++) {
				int valF = tablero[i][j];
				int valC = tablero[j][i];
				
				if (check_fila[valF-1] == true || check_columna[valC-1] == true ) {
					return false;
				}
				check_fila[valF-1] = true;
				check_columna[valC-1] = true;
			}
		}
		return true;
		
	}
}