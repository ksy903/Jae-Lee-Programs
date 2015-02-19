import java.util.*;
import java.io.*;

public class hexical{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("hexiral.dat"));
		ArrayList<String> listofWord = new ArrayList<String>();
		char[][] grid = new char[11][16];
		for(int j =0; j<grid.length; j++){
			if(j == 0 || j == grid.length-1)
				for(int i =0; i<grid[j].length; i++)
					if(i < 5 || i >10)
						grid[j][i] = '0';
			if(j==1 || j == grid.length-2)
				for(int z =0; z<grid[j].length; z++)
					if(z < 4 || z >11)
						grid[j][z] = '0';
			if(j==2 || j == grid.length-3)
				for(int x =0; x<grid[j].length; x++)
					if(x < 3 || x >12)
						grid[j][x] = '0';
			if(j==3 || j == grid.length-4)
				for(int c =0; c<grid[j].length; c++)
					if(c < 2 || c >13)
						grid[j][c] = '0';
			if(j==4 || j == grid.length-5)
				for(int v =0; v<grid[j].length; v++)
					if(v < 1 || v >14)
						grid[j][v] = '0';
		}
		for(char[] p:grid)
			System.out.println(Arrays.toString(p));
		while(scan.hasNext()){
			listofWord.add(scan.nextLine().trim());
		}
		System.out.println(listofWord);
		int top = 0;
		int bottom = 10;
		int left = 0;
		int right = 0;
		int counter = 0;
		for(int i=0; i<listofWord.size(); i++){
			for(int r = 0; r<grid.length; r++){
				for(int c =0; c<grid[r].length; c++){
					if(grid[r][c] != '0' && r == top){
						grid[r][c] = listofWord.get(i).charAt(counter%listofWord.get(i).length());
						counter++;
					}
				}
				top++;
			}
		}
		for(char[] p:grid)
			System.out.println(Arrays.toString(p));
	}
}