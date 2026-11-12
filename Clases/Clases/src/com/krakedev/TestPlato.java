package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA;
		Plato platoB;
		Plato platoC;
		
		platoA = new Plato("Encebollado",3.50f,"Plato Fuerte",true);
		platoB = new Plato("Quesillo con Miel",0.50f,"Postre",false);
		platoC = new Plato("Tostado con Chicharron",1.00f,"Entrada",false);
	
		System.out.println("========== Plato A ==========");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Disponible: " + platoA.isDisponible());
		
		System.out.println("========== Plato B ==========");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Disponible: " + platoB.isDisponible());
		
		System.out.println("========== Plato C ==========");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Disponible: " + platoC.isDisponible());
	}
}