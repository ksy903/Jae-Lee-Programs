class sqare{
	public static void main(String[] args){
		int sq[][] = {{16,5,9,4},{3,10,6,15},{2,11,7,14},{13,8,12,1}};
		int hor = 0, ver = 0, dia1 = 0, dia2 = 0, h=0,v=0;
		boolean fail  = false;
		for(int r=0; r<sq.length; r++){
			for(int c=0; c<sq[0].length; c++){
				if(r==0){
					ver += sq[r][c];
					hor += sq[c][r];
				}
				else{
					h += sq[c][r];
					v += sq[r][c];
				}
				if(r==c)
					dia1 += sq[r][c];
				if(r+c == 3)
					dia2 += sq[r][c];
			}
			if(r != 0 && (ver != v || hor != h)){
				fail = true;
			}
			if(r > 0){
				v=0;
				h=0;
			}
		}
		if((dia1 != hor || dia2 != hor) || fail)
			System.out.println("not magic square");
		else{
			System.out.println("magic square with the value: " + hor);
		}
	}
}