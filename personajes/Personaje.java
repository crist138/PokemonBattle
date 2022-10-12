package personajes;
import java.util.*;

public class Personaje{
	Random ran = new Random();

//Atributes
	public String nombre;
	public int vida = 100;
	public String[] ataques = new String[4];

//Constructor
	public Personaje(String nombre,int vida,String[] ataques){
		this.nombre = nombre;
		this.vida = vida;
		this.ataques = ataques;
	}

//Methods
	public void mostrarInfo(){
		int i;
		for(i=0;i<4;i++){
		System.out.print(i+1+".-"+ataques[i]+"\t");
			if(i==1){
				System.out.println();
			}
		}
	}

	public int atacar(int atk){
		int danio=0;
		switch(atk){
		case 1: danio = ran.nextInt(35-5+1)+1; break;
		case 2: danio = ran.nextInt(45-5+1)+1; break;
		case 3: danio = ran.nextInt(50-5+1)+1; break;
		case 4: danio = ran.nextInt(15-5+1)+1; break;
		}

		return danio;
	}

}