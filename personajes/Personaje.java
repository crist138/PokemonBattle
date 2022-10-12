package personajes;
import java.util.*;

public class Personaje{
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

}