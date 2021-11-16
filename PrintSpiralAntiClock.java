package dsa1week;

public class PrintSpiralAntiClock {
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		  int top=0;
		  int bottom=3;
		  int left=0;
		  int right=3;
		  int direction=0;
		  
		  while(top<=bottom && left<=right) {
			  
			  if(direction==0) {
				  for(int i=top; i<=bottom; i++){
					  System.out.print(a[i][left] + " ");
				  }
				  left++;
			  }
			  
		  else if(direction==1) {
				  for(int i=left; i<=right; i++) {
					  System.out.print(a[bottom][i] + " ");
				  }
				  bottom--;
			  }
			  
		  else if(direction==2) {
			  for(int i=bottom; i>=top; i--){
				  System.out.print(a[i][right] +" ");
			  }
			  right--;
	  }
			   
			  else if(direction==3) {
				  for(int i=right; i>=left; i--){
					  System.out.print(a[top][i] + " ");
				  }
				  top++;
		  }
			  
			  System.out.println();
			  
			  direction=(direction+1)%4;
			
	}
	}
}
