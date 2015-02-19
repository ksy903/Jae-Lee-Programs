import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class punch{
	public static void main(String[] args) throws IOException{
		char[][] grid = new char[9][12];
		int let  = 65;
		for(int i =0; i<grid.length; i++){
			for(int j = 0; j<grid[0].length; j++){
				if(i < 3){
					grid[i][j] = '0';
				}
				else{
					grid[i][j] = (char)let;
				}
			}
			if(i > 2)
				let++;
		}
		/*
		for(char[] c:grid)
			out.println(c);
		*/

		Scanner scan= new Scanner(new File("punch.dat"));
		int m = 0;
		while(scan.hasNext()){
			String line = scan.nextLine();
			String[] holdNums = line.split(" ");
			//System.out.println(Arrays.toString(holdNums));
			char[][] holdDigits = new char[9][3];
			for(int r = 0; r < holdNums.length; r++){
				for( int c =0 ; c < holdNums[r].length(); c++){
					holdDigits[r][c] = holdNums[r].charAt(c);
				}
			}
			/*
			for(char[] v: holdDigits){
				out.println(Arrays.toString(v));
			}
			*/
			int value = 0;
			String[][] holdBin = new String[9][3];
			for(int p = 0; p < holdDigits.length; p++){
				for(int q =0; q<holdDigits[p].length; q++){
					if(holdDigits[p][q] != '0'){
						value = Integer.valueOf(String.valueOf(holdDigits[p][q]), 16);
						holdBin[p][q] = Integer.toBinaryString(value);
					}
				}
			}
			out.println(Arrays.toString(holdBin[0]));
			for(int h = 0; h < holdBin.length; h++){
				for(int g = 0; g < holdBin[0].length; g++){
					if(holdBin[h][g] == "null")
						holdBin[h][g] = "0000";
					else if(holdBin[h][g].length() < 4 && !holdBin[h][g].equals("null")){
						String hold = "";
						for(int qw = 0; qw < 4 - holdBin[h][g].length(); qw++)
							hold += "0";
						holdBin[h][g] = hold + holdBin[h][g];
					}
				}
			}
			for(int last1 = 0; last1 < holdBin.length; last1++){
				for(int last2 = 0; last2 < holdBin[last1].length; last2++){
					String reverse = holdBin[last1][last2].substring(3, 4) + holdBin[last1][last2].substring(2, 3) +
					holdBin[last1][last2].substring(1, 2) + holdBin[last1][last2].substring(0, 1);
					holdBin[last1][last2] = reverse;
					for(int last3 = 0; last3 < holdBin[last1][last2].length(); last3++){
						if(holdBin[last1][last2].charAt(last3) == '1'){
							grid[last1][last2] = '*';
							m++;
						}
						if(m > 1) {

							break;
						}
					}
				}
			}
			String[] num = new String[3];
			ArrayList<String> name = new ArrayList<String>();
			int namep = 0;
			int index = 0;
			boolean bubbled = false;
			for(int ver = 0; ver < grid.length; ver++){
				bubbled  = false;
				for(int hor = 0; hor < grid[0].length; hor++){
					if(ver < 3 && grid[ver][hor] == '*'){
						if(index >= 0)
							num[ver] = "*";
						else
							num[ver] = String.valueOf(9 - hor);
						bubbled  = true;
					}
					else if(ver > 2 && grid[ver][hor] == '*'){
						if(index >= 0){
							if(9-hor > namep){
								name.add(0, String.valueOf(grid[ver][11]));
								namep = (9-hor);
							}
							else
								name.add(String.valueOf(grid[ver][11]));
							bubbled  = true;
						}
						else{
							if(9-hor > namep){
								name.add(0, String.valueOf(grid[ver][11]));
								namep = (9-hor);
							}
							else
								name.add(String.valueOf(grid[ver][11]));
							bubbled  = true;
						}
					}
					if(!bubbled && ver < 3)
						num[ver] = "*";
					else if(!bubbled && ver > 2)
						name.add("*");

				}
			}
		}
	}
}