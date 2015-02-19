import java.util.*;

public class Switch{
	public static void main(String[] args){
		int i = 3;
		int y = 0;
		switch(i){
			case 2:
				y = 3;
			case 3:
				y = 3;
			case 4:
				y = 4;
			default:
				y = 6;
		}
		System.out.println(y);
	}
}