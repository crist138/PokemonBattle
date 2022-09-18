package pokemones;
import java.util.*;



public class Pokemon {

Scanner in = new Scanner(System.in);
Random ran = new Random();

// Atributos
	protected String nombre;
	protected int tipo; // 1.- info.txt
	protected int nivel;
	public int vida = 100;
	public String[] ataques = new String[4];

// Constructor
	public Pokemon(String nombre, int tipo, int vida, String ataques []){
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.ataques = ataques;
	}


//Getters
	public String getNombre(){
		return nombre;
	}


//Metodoslol
	public void mostrarDatos(){
		int i;
		System.out.println("===================================================");
		System.out.println("|\t\t\t\t\t\t  |");
		System.out.println("|\t\t       Info\t\t\t  |");
		System.out.println("|\t\t\t\t\t\t  |");
		System.out.println("===================================================\n\n");
		System.out.println("\tEl pokemon es: "+nombre+"\n\tSu tipo numero de tipo es: "+tipo+"\n\tQue es equivalente a tipo: "+getTipo(tipo)+"\n\tTiene "+vida+" de vida cuidalo musho");
		
		System.out.println("\tSus ataques son: ");
		for(i=0;i<4;i++){
			System.out.print("\t"+i+1+".- "+ataques[i]+"\n");
		}
		System.out.println("\n");
	}
	
	public String getTipo(int tipo){
		String tipoPkmn = Integer.toString(tipo);
		switch(tipo){
			case 1: tipoPkmn = "Agua"; break; 
			case 2: tipoPkmn = "Electrico"; break;
			case 3: tipoPkmn = "Tierra"; break;
		}
	return tipoPkmn;

	}

	public void mostrarVida(){
		if(vida==100){
			System.out.println("-  ||||||||||||||||||||||||||||||  -");
		} else if(vida>90){
			System.out.println("-  |||||||||||||||||||||||||||||.  -");
		} else if(vida>80){
			System.out.println("-  ||||||||||||||||||||||||||||..  -");
		} else if(vida>70){
			System.out.println("-  ||||||||||||||||||||||||||....  -");
		} else if(vida>60){
			System.out.println("-  ||||||||||||||||||||||||......  -");
		} else if(vida>50){
			System.out.println("-  ||||||||||||||||||||||........  -");
		} else if(vida>40){
			System.out.println("-  |||||||||||||||||||...........  -");
		} else if(vida>30){
			System.out.println("-  |||||||||||||.................  -");
		} else if(vida>20){
			System.out.println("-  ||||||||||....................  -");
		} else if(vida>10){
			System.out.println("-  ||||||........................  -");
		} else if(vida>5){
			System.out.println("-  ||............................  -");
		} else if(vida>1){
			System.out.println("-  |.............................  -");
		}
	}

	public int atacar(int opt){
		int damage=0;
		switch(opt){
		case 1: damage = ran.nextInt(50-5+1)+5; break;
		case 2: damage = ran.nextInt(35-5+1)+5; break;
		case 3: damage = ran.nextInt(40-5+1)+5; break;
		case 4: damage = ran.nextInt(20-5+1)+5; break;
		}

		return damage;
	}

}


