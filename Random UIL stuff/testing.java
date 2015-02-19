import java.util.*;
import java.io.*;
import static java.lang.System.out;

class saghsad{
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args){
		list.add(1);
		list.add(7);
		list.add(6);
		list.add(3);
		list.add(2);
		for(int i=0;i<6;i++){
			out.println(removeRandomFoo());
		}
	}
	public static int removeRandomFoo(){
		int choice = (int)(Math.random() * list.size());
		int copy = list.remove(choice);
		return copy;
	}
}