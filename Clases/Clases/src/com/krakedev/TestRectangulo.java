package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setAltura(5);
		r1.setBase(4);
		
		int resultadoArea1 = r1.calcularArea();
		double resultadoPerimetro1 = r1.calcularPerimetro();
		System.out.println("Area Rectangulo 1: " + resultadoArea1);
		System.out.println("Perimetro Rectangulo 1: " + resultadoPerimetro1);
		
		Rectangulo r2 = new Rectangulo();
		
		r2.setAltura(8);
		r2.setBase(2);
		int resultadoArea2 = r2.calcularArea();
		double resultadoPerimetro2 = r2.calcularPerimetro();
		System.out.println("Area Rectangulo 2: " + resultadoArea2);
		System.out.println("Perimetro Rectangulo 2: " + resultadoPerimetro2);
	}

}
