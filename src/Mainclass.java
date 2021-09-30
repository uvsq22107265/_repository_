import java.util.Scanner;
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Scanner scanner = new Scanner(System.in);
		 
            int nominateur;
            int denominateur;
    
            System.out.print("Enter nominateur: ");
            nominateur = scanner.nextInt();
            System.out.print("Enter denominateur: ");
            denominateur = scanner.nextInt();
            Fraction fraction = new Fraction(nominateur,denominateur);

            assert fraction.denominateur != 0  : "Exception lancee"; 

            System.out.printf( "Fraction => %s", fraction.nominateur/fraction.denominateur);
            scanner.close();
     
	}

}
