import java.util.Scanner;
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Scanner scanner = new Scanner(System.in);
		 
            double nb;
    
            System.out.print("Enter rational number: ");
            nb = scanner.nextDouble();
            Fraction fraction = new Fraction(nb);

            assert fraction.nb_rationnel > 10  : "le nombre est superieur a 10"; 

            System.out.printf( "Fraction => %s", fraction.nb_rationnel);
            scanner.close();
     
	}

}
