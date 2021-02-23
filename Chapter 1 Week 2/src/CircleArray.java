import java.util.Scanner;

public class CircleArray {
        public static void main(String[] args) {
                Circle array[]=new Circle[3];
                Scanner input = new Scanner(System.in);
                //iterating and creating circle objects with user given radius
                for(int i=0;i<3;i++) {
                        System.out.println("Enter radius for circle "+(i+1)+": ");
                        array[i] = new Circle(input.nextDouble());
                }
                //printing circle radius
                
                for(int i=0;i<3;i++) {
                	System.out.println("Enter radius for circle "+ (i+1)+":" );
                	
                	System.out.println( "Area is: \n" + array[i].getArea());
                        
                    
                }
                
        }
}