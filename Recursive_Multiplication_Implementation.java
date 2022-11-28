import java.util.Scanner;

public class HW1 {
	
static int product(int x,int y){
	    int a=0;
        int b=0;
        int i=0;
        int j=0;
      for(a=x;a<0;a++){
         i++; 
       }
       for(b=y;b<0;b++){
         j++;
       }
       if(x==0|y==0){
	     return 0;//Base case
       } else if((x>0&&y>0)||(x>0&&y<0)){
	     return (y+product(x-1,y));
       } else if((x<0&&y>0)){
	     return (x+product(x,y-1));
       }	
	     return product(i,j);
 }




	// the main function will automatically run tests using the github classroom autotesting functionality
	// please keep it as it is when you push your code
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int numTests = 10; numTests > 0; numTests--){
			int x = scan.nextInt();
			int y = scan.nextInt();

			System.out.println(product(x, y));
		}
		
		scan.close();
	}

}

