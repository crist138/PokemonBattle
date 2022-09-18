import pokemones.*;
import java.util.*;
public class index {

	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	Random ran = new Random();

//Variables
	int i,option;
	String[] atksPikachu = new String[] {"Chispazo","Impactrueno","Rayo","Llamarada"}; 
	String[] atksPorygon = new String[] {"Tri-Ataque","Llamarada","Terremoto","Psiquico"};
	Boolean win = true;

//Pikachu
	Pikachu pikachu = new Pikachu("Pikachu",2,100,atksPikachu);
	pikachu.mostrarDatos();

//Porygon
	Porygon porygon = new Porygon("Porygon",2,100,atksPorygon);
	porygon.mostrarDatos();

//Combate
		System.out.println("===================================================");
		System.out.println("|\t\t\t\t\t\t  |");
		System.out.println("|\t\t      Battle\t\t\t  |");
		System.out.println("|\t\t\t\t\t\t  |");
		System.out.println("===================================================\n\n");

	while(win){

		System.out.println("=================================================");
		System.out.println("|\t\t\t\t\t\t|");
		System.out.println("|\t\t     Pikachu\t\t\t|");
		System.out.println("|\t\t\t\t\t\t|");
		System.out.println("=================================================\n\n");


		System.out.println("Es turno de Pikachu!\n");
		pikachu.mostrarVida();
		System.out.println();
		System.out.println("Ataques: ");

		for(i=0;i<4;i++){
			System.out.print(i+1+".- "+pikachu.ataques[i]+"\t");
				if(i==1){
					System.out.println();
				}
		}
		System.out.print("Elige tu ataque!: ");
		option = in.nextInt();
		pikachu.atacar(option);
		System.out.println("Le quitaste "+pikachu.atacar(option)+" de vida! ");
		porygon.vida-=pikachu.atacar(option);


			if(porygon.vida<0){
				porygon.vida = 0;
			}

			if(porygon.vida==0){
				win = false;
			}
			if(pikachu.vida==0){
				win = false;
			}


		System.out.println("=================================================");
		System.out.println("|\t\t\t\t\t\t|");
		System.out.println("|\t\t     Porygon\t\t\t|");
		System.out.println("|\t\t\t\t\t\t|");
		System.out.println("=================================================\n\n");


		System.out.println("Es turno de Porygon!\n");
		porygon.mostrarVida();
		System.out.println();
		System.out.println("Ataques: ");

		for(i=0;i<4;i++){
			System.out.print(i+1+".- "+porygon.ataques[i]+"\t");
				if(i==1){
					System.out.println();
				}
		}
		System.out.print("Elige tu ataque!: ");
		option = in.nextInt();
		pikachu.atacar(option);
		System.out.println("Le quitaste "+porygon.atacar(option)+" de vida! ");
		pikachu.vida-=porygon.atacar(option);

			if(pikachu.vida<0){
				pikachu.vida = 0;
			}


			if(porygon.vida==0){
				win = false;
			}
			if(pikachu.vida==0){
				win = false;
			}

		}
	}
}