import java.util.*;
import java.io.*;
import static java.lang.System.out;

class Data{
	int Weight;
	int Value;
	int Position;
	public Data(int v, int w, int p){
		Value = v;
		Weight = w;
		Position = p;
	}
	public String toString(){
		return String.format("Item #%d - v=%d: w=%d", Position, Value, Weight);
	}
}

public class Knapsack{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("knapsack.dat"));
		int caseNum = scan.nextInt();
		for(int i = 0; i < caseNum; i++){
			int BAGSIZE = scan.nextInt();
			int ITEMNUM = scan.nextInt();
			ArrayList<Data> list = new ArrayList<Data>();
			for(int j=0; j<ITEMNUM; j++){
				list.add(new Data(scan.nextInt(), scan.nextInt(), j+1));
			}
			int[][] Value = new int[ITEMNUM+1][BAGSIZE+1];
			int[][] Keep = new int[ITEMNUM+1][BAGSIZE+1];

			for(int r = 1; r<Value.length; r++){
				for(int c  = 1; c<Value[0].length; c++){
					if(list.get(r-1).Weight > c){
						Value[r][c] = 0;
						Keep[r][c] = 0;
					}
					else
					if(list.get(r-1).Weight == c && list.get(r-1).Value < Value[r-1][c]){
						Value[r][c] = Value[r-1][c];
						Keep[r][c] = 1;
					}
					else
					if(list.get(r-1).Weight == c){
						Value[r][c] =list.get(r-1).Value;
						Keep[r][c] = 1;
					}
					else
					if(list.get(r-1).Value + Value[r-1][c-list.get(r-1).Weight] > Value[r-1][c]){
						Value[r][c] = list.get(r-1).Value + Value[r-1][c-list.get(r-1).Weight];
						Keep[r][c] = 1;
					}
					else{
						Value[r][c] = Value[r-1][c];
						Keep[r][c] = 0;
					}
				}
			}

			int BagC = BAGSIZE;
			int I = list.size();
			ArrayList<Data> finList = new ArrayList<Data>();
			int MaxV = 0;
			int MaxW = 0;
			for(int g = I; g > 0; g--){
				if(Keep[g][BagC] == 1 && BagC > 0){
					finList.add(0, list.get(g-1));
					MaxV += list.get(g-1).Value;
					MaxW += list.get(g-1).Weight;
					BagC -= list.get(g-1).Weight;
				}
			}
			out.println("knapsack capacity = " + BAGSIZE);;
			out.println("total weight = " + MaxW);
			out.println("total value = " + MaxV);
			for(Data d:finList){
				out.println(d);
			}
			out.println();
		}
	}
}