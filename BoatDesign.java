//Juan Jose Morales
//Print boat based on mast height
import java.util.Scanner;
public class BoatDesign {

	public static void main(String[] args) {
	int m;	
Scanner kbd = new Scanner(System.in);
do {
	   System.out.println("Please enter the height of the mast");
       m = kbd.nextInt();
//formulas	
int width = 2 * m + 1; //width of the boat
int height = 4/3 * m + 1; // height of the boat
int hull = m/3; // hull of the boat

//test
//comment insert test

for (int i = 1; i<=m ; i++) {  //Print background left side	
    for ( int j = 1; j<=((width-1)/2 - (i-1)); j++) {
                System.out.print("."); 
    }
    if (i > 1) {           
    	System.out.print("/");  //Print sail
   }
       if( i> 2 ) {
           for (int k = (3 + (width-1)/2 - i); k<=(width-1)/2; k++) {
                 	System.out.print(" ");
                  }  
    }
       
    System.out.print("|"); //Print mast
    
    if ( i > 2) {
        for (int k = ((width-1)/2 +1);k<=((width-1)/2 + (i-2)) ; k++) {
                    	System.out.print(" "); //space between mast and sails
                    }
    }
       if(i > 1) {
        	System.out.print("\\"); //Print sail
        }
         for (int j = ((width-1)/2 + i); j<= width-1 ; j++) {
        	System.out.print("."); // Print background right side
        }
       
    
    System.out.println();
    
}
	
//PrintDeck
for ( int i = 1;i<= width; i++) {
	System.out.print("-");
}

System.out.println();
//left background side
for ( int i = 1; i<=hull ; i++ ){
    for (int j = 1; j<= i; j++) {
    	System.out.print(".");
    }
    //PrintSail
    for (int k = i+1; k<=(width-1)/2 ; k++) {
    	System.out.print("\\");
    }
    //PrintCenterOfHull
    System.out.print("V");
    
                    
    for ( int k = ((width-1)/2) +1; k<=(width-1)-i; k++) {
    	System.out.print("/");
    }
    //PrintBackgroud right side
    for ( int j = 1 ; j<=i ; j++){
    	System.out.print(".");
    
    }
    System.out.println();
    
} 

System.out.println();



} while ( m != -1);
System.out.println("Finished");
		}

}
