package practica2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int selec=0;
		String entrada;
		
		Lista l=new Lista();

		do {
			
		Scanner in=new Scanner(System.in);
		System.out.println("(1) Agregar nombre ");
		System.out.println("(2) Agregar nombre al final de la lista ");
		System.out.println("(3) Buscar un nombre de la lista ");
		System.out.println("(4) Eliminar un nombre de la  lista ");
		System.out.println("(5) modificar un nombre ");
		System.out.println("(6) Mostrar lista actual ");
		System.out.println("(7) Salir ");
		System.out.print("seleccione opcion a realizar; ");
		selec=in.nextInt();
		switch (selec) {
		case 1:
			System.out.println("ingrese nombre para lista ");
			String ingreso=in.next();
			System.out.println();
			l.Agregar(ingreso);
			break;
		case 2:
			System.out.println("nombre para la lista ");
			String fi=in.next();
			System.out.println();
			l.InsertarFinal(fi);
		
			break;
		case 3:
				l.buscarElemento();
					break;
		case 4:
			l.eliminarNombre();
			break;
		case 5:
			l.Modificar();
			break;
		case 6:
			l.MostrarLista();
			break;
		case 7:
			System.out.println("Saliendo de LISTA SIMPLE ENLAZADA ... ... .. .");
			System.exit(selec);
		}
		
		
		
	
		} while ( selec !=7);
		
	}

}
