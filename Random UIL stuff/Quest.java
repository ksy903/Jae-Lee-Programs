import java.util.*;
import java.io.*;
import static java.lang.System.out;

class Quest{
	public static Cell[][] map;
	public static Cell grail;
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("jojo.txt"));
		int caseN = scan.nextInt();scan.nextLine();
		while(caseN-- > 0){
			map = new Cell[10][10];
			char[][]copy = new char[10][10];
			Cell arthur = null;
			Cell wabbit = null;
			for(int r=0; r<10; r++){
				String line = scan.nextLine();
				for(int c=0; c<10; c++){
					map[r][c] = new Cell();
					copy[r][c] = line.charAt(c);
				}
			}
			for(int r=0; r<10; r++){
				for(int c=0; c<10; c++){
					if(r-1 >= 0)
						map[r][c].up = map[r-1][c];
					if(r+1 < 10)
						map[r][c].down = map[r+1][c];
					if(c-1 >= 0)
						map[r][c].left = map[r][c-1];
					if(c+1 < 10)
						map[r][c].right = map[r][c+1];
					map[r][c].symbol = copy[r][c];	
					if(copy[r][c] == 'A')
						arthur = map[r][c];
					if(copy[r][c] == 'H')
						grail = map[r][c];
					if(copy[r][c] == 'K')
						wabbit = map[r][c];
				}
			}
			
			if(wabbit != null){
				if(wabbit.up != null)
					wabbit.up.symbol = '#';
				if(wabbit.down != null)
					wabbit.down.symbol = '#';
				if(wabbit.left != null)
					wabbit.left.symbol = '#';
				if(wabbit.right != null)
					wabbit.right.symbol = '#';
				wabbit.symbol = '#';	
			}
			
			arthur.symbol = '.';
			grail.symbol = '.';
			arthur.value = 0;
			while(grail.value == 1000){
				for(int r=0; r<10; r++){
					for(int c=0; c<10; c++){
						if(map[r][c].symbol == '.')
							Cell.search(map[r][c]);
					}
				}
			}
			Cell.back(grail);
			arthur.symbol = 'A';
			grail.symbol = 'H';
			for(int r=0; r<10; r++){
				for(int c=0; c<10; c++){	
					if(map[r][c].symbol == 'O')
						out.print(map[r][c].symbol);
					else
						out.print(copy[r][c]);
				}
				out.println();
			}
			out.println();
			if(caseN > 0)
				scan.nextLine();
		}
	}
}
class Cell{
	public Cell up;
	public Cell down;
	public Cell left;
	public Cell right;
	public char symbol;
	public int value = 1000;
	public Cell(){}
	public static void search(Cell s){
		if(s.up != null && s.up.symbol == '.' && s.value + 2 < s.up.value)
			s.up.value = s.value + 1;
		if(s.down != null && s.down.symbol == '.' && s.value + 2 < s.down.value)
			s.down.value = s.value + 1;
		if(s.left != null && s.left.symbol == '.' && s.value + 2 < s.left.value)
			s.left.value = s.value + 1;
		if(s.right != null && s.right.symbol == '.' && s.value + 2 < s.right.value)
			s.right.value = s.value + 1;
	}
	public static void back(Cell s){
		if(s==null)
			return;
		s.symbol = 'O';
		if(s.up != null && s.up.value+1 == s.value){
			back(s.up);
			return;
		}
		if(s.down != null && s.down.value+1 == s.value){
			back(s.down);
			return;
		}
		if(s.left != null && s.left.value+1 == s.value){
			back(s.left);
			return;
		}
		if(s.right != null && s.right.value+1 == s.value){
			back(s.right);
			return;
		}
	}
}