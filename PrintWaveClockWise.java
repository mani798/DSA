package dsa1week;

public class PrintWaveClockWise {
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		  int top=0;
		  int bottom=3;
		  int left=0;
		  int right=3;
		  int direction=0;
		  
          while(left<=right) {
			  
			  if(direction==0) {
				  for(int i=top; i<=bottom; i++){
					  System.out.print(a[i][left] + " ");
				  }
				  left++;
			  }
          
			  else if(direction==1) {
				  for(int i=bottom; i>=top; i--) {
					  System.out.print(a[i][left] + " ");
				  }
				  left++;
			  }
			   direction=(direction+1)%2;
			
	}
	}
}
