package practica2;

import java.util.Scanner;


public class Lista {
	
	
Nodo inicio, fin;
	
	
	public Lista(){
		inicio=null;
		fin=null;
	}
	
	Scanner en=new Scanner(System.in);
		
	
	public void Agregar(String dato){
		Nodo nuevo=new Nodo(dato,inicio);
		inicio=nuevo;
		if (fin==null) {
		fin=inicio;	
		}	
	}
	
	
	public void InsertarFinal(String dato){
		Nodo nuevo= new Nodo(dato,null);
		if (inicio==null) {
			fin=nuevo;
			inicio=fin;
		}
		else{
			fin.siguiente=nuevo;
			fin=nuevo;
		}
	}
	
	
	public void Modificar(){
		Nodo nuevo=inicio, anterior=null;
		boolean enc=false;
		if (nuevo==null) {
			System.out.println("su lista esta vacia");
		}
		else{
			System.out.print("\n nombre a modificar :  ");
			String el=en.next();
			nuevo.dato=el;
			while (nuevo!=null && enc==false) {
				enc=(el.equals(nuevo.dato));
				
				System.out.print("escriba el nuevo nombre: ");
				String mod=en.next();
				el=el.replace(el, mod);
				nuevo.dato=el;

				if(enc==false){
					anterior=nuevo;
					nuevo=nuevo.siguiente;
				
				
				}
				
				
			}
			
			}
		
	}
	
	public void eliminarNombre(){
	Nodo nuevo=inicio, anterior=null;
	boolean buscar=false;
	if (nuevo==null) {
		System.out.println("su lista esta vacia");
	}
	else{
		System.out.println("\n nombre a eliminar: ");
		String el=en.next();
		System.out.println();
		while (nuevo!=null && buscar==false) {
			buscar=(el.equals(nuevo.dato));
			
			
			if(buscar==false){
				anterior=nuevo;
				nuevo=nuevo.siguiente;}
		}
		if (nuevo!=null) {
			if (nuevo==inicio) {
				inicio=nuevo.siguiente;
				
			}
			else {
				anterior.siguiente=nuevo.siguiente;
			}
			
			
		}
	}
		
	}
	
	
	
	public void buscarElemento(){
		Nodo n=inicio;
		boolean encontrado=false;
		if(n==null){
		System.out.println("Aun No tiene nombres guardados en la lista \n");}
		else{
		System.out.print("Escribe el nombre :");
		String bus="";
		bus=en.next();
		while(n!=null){
		if(bus.equals(n.dato)){
		System.out.println("\n Nombre '"+bus+"' se encontro en la posicion :"+n+"\n");
		encontrado=true;}
		n=n.siguiente;}
		if(encontrado==false){
		System.out.println("\n El nombre :"+bus+" no existe   \n");}}
		}
	
	public void MostrarLista(){
		if(inicio==null)
			System.out.println("\n lista vacia \n");
		
		
		else{
		Nodo tmp=inicio;
		System.out.println("\n LISTA:  \n");
		while (tmp!=null) {
			System.out.println(tmp.dato);
			tmp=tmp.siguiente;
		
		}
		System.out.println("");
		}
		}
		

}
