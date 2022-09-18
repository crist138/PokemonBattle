import pokemones.Pokemon;
import pokemones.Pikachu;
import java.util.*;
public class index {

	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	Random ran = new Random();

	int i;
	String[] atks = new String[] {"Chispazo","Impactrueno","Rayo","Llamarada"}; 

	Pikachu pikachu = new Pikachu("Pikachu",2,100,atks);
	pikachu.mostrarDatos();

	System.out.println("Sus ataques son: ");
		for(i=0;i<4;i++){
			System.out.print(i+1+".-"+pikachu.ataques[i]+"\n");
		}



	}
}