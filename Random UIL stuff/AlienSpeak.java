import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class AlienSpeak{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("alienspeak.dat"));
		int caseNum = scan.nextInt();
		for(int i=0; i<caseNum; i++){
			String a = scan.next();
			String b = scan.next();
			int ans = solve(a.toCharArray(), b.toCharArray());
			System.out.println(ans);
		}
	}
	public static int solve(char[] A, char[] B){
		int[][] grid = new int[A.length+1][B.length+1];
		int ans = 0;
		for(int i = 1; i < grid.length; i++){
			for(int j = 1; j<grid[i].length; j++){
				if(A[i-1] == B[j-1]){
					grid[i][j] = grid[i-1][j-1] + 1;
				}
				else{
					grid[i][j] = Math.max(grid[i-1][j], grid[i][j-1]);
				}
			}
		}
		return grid[grid.length-1][grid[0].length-1];
	}
}