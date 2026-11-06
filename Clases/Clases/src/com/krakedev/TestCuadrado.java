package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		c1.lado = 3;
		c2.lado = 5;
		c3.lado = 8;
		
		double area1 = c1.calcularArea();
		double perimetro1 = c1.calcularPerimetro();
		
		double area2 = c2.calcularArea();
		double perimetro2 = c2.calcularPerimetro();
		
		double area3 = c3.calcularArea();
		double perimetro3 = c3.calcularPerimetro();
		
		System.out.println("Cuadrado 1 - Lado: "+c1.lado+" , Area: "+area1+" ,Perimetro: " + perimetro1);
		System.out.println("Cuadrado 2 - Lado: "+c2.lado+" , Area: "+area2+" ,Perimetro: " + perimetro2);
		System.out.println("Cuadrado 3 - Lado: "+c3.lado+" , Area: "+area3+" ,Perimetro: " + perimetro3);

	}

}
