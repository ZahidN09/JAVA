package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		//Creación de Instancias
		
		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();
		
		//Modificar valores
		
		rest1.setNombre("Ceviches Maremoto");
		rest1.setDireccion("Av. 10 de Agosto y Olmedo");
		rest1.setCalificacion(4.0f);
		
		rest2.setNombre("Apanados de Don Lucho");
		rest2.setDireccion("Av. Brasil y Argentina");
		rest2.setCalificacion(3.5f);
		
		//Mostar valores de los atributos
		
		System.out.println("======= Restaurante 1 =======");
		System.out.println("Nombre: " +  rest1.getNombre());
		System.out.println("Direccion: " +  rest1.getDireccion());
		System.out.println("Calificaion: " +  rest1.getCalificacion());
		
		System.out.println("======= Restaurante 2 =======");
		System.out.println("Nombre: " +  rest2.getNombre());
		System.out.println("Direccion: " +  rest2.getDireccion());
		System.out.println("Calificaion: " +  rest2.getCalificacion());

	}

}
