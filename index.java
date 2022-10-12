import personajes.*;
import java.util.*;
public class index {

	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	Random ran = new Random();

	String[] atksMago = new String[]{"Ventisca","Psicosis","Llamarada","Aguazero"};

	Mago mago = new Mago("Jorjais",100,atksMago);
	mago.mostrarInfo();

	}
}