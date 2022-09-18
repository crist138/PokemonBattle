package pokemones;
import java.util.*;



public class Pokemon {

Scanner in = new Scanner(System.in);
Random ran = new Random();

// Atributos
	protected String nombre;
	protected int tipo; // 1.- info.txt
	protected int nivel;
	protected int vida = 100;
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
		System.out.println("Tu pokemon es: "+nombre+"\nSu tipo numero de tipo es: "+tipo+"\nQue es equivalente a tipo: "+getTipo(tipo)+"\nTiene "+vida+" de vida cuidalo musho");
		
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
}


