package com.krakedev;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo v;
		v = new Vehiculo();
		
		System.out.println("============= Vehiculo 1: Creado =============");
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		
		System.out.println("============= Vehiculo 1: Valores Asignados =============");
		v.setAnio("2012");
		v.setMarca("Chevrolet");
		v.setModelo("Nuevo");
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("============= Vehiculo 2: Creado =============");
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		
		System.out.println("============= Vehiculo 2: Valores Asignados =============");
		v2.setAnio("2020");
		v2.setMarca("Toyota");
		v2.setModelo("Doble Cabina");
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		
		Vehiculo v3 = new Vehiculo("Toyota");
		System.out.println("============= Vehiculo 3: Creado =============");
		System.out.println("Año: " + v3.getAnio());
		System.out.println("Marca: " + v3.getMarca());
		System.out.println("Modelo: " + v3.getModelo());
		
		Vehiculo v4 = new Vehiculo("Kia","NUevo","2000");
		System.out.println("============= Vehiculo 4: Creado =============");
		System.out.println("Año: " + v4.getAnio());
		System.out.println("Marca: " + v4.getMarca());
		System.out.println("Modelo: " + v4.getModelo());
	}

}
