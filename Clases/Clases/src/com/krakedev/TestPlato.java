package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA;
		Plato platoB;
		Plato platoC;
		
		platoA = new Plato();
		platoB = new Plato();
		platoC = new Plato();
		
		platoA.setNombre("Encebollado");
		platoA.setPrecio(3.50f); 
		platoA.setTipo("Plato Fuerte");
		platoA.setDisponible(true);
		
		platoB.setNombre("Quesillo con Miel");
		platoB.setPrecio(0.50f); 
		platoB.setTipo("Postre");
		platoB.setDisponible(false);
		
		platoC.setNombre("Tostado con Chicharron");
		platoC.setPrecio(1.00f); 
		platoC.setTipo("Entrada");
		platoC.setDisponible(false);
	
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