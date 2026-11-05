package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA;
		Plato platoB;
		Plato platoC;
		
		platoA = new Plato();
		platoB = new Plato();
		platoC = new Plato();
		
		platoA.nombre = "Encebollado";
		platoA.precio = 3.50f;
		platoA.tipo = "Plato Fuerte";
		platoA.disponible = true;
		
		platoB.nombre = "Quesillo con Miel";
		platoB.precio = 0.50f;
		platoB.tipo = "Postre";
		platoB.disponible = false;
		
		platoC.nombre = "Tostado con Chicharron";
		platoC.precio = 1.00f;
		platoC.tipo = "Entrada";
		platoC.disponible = false;
		
		System.out.println("========== Plato A ==========");
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Disponible: " + platoA.disponible);
		
		System.out.println("========== Plato B ==========");
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Disponible: " + platoB.disponible);
		
		System.out.println("========== Plato C ==========");
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Disponible: " + platoC.disponible);
	}
}