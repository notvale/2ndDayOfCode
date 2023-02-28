package com.daysofcode.seconddayofcode;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SeconddayofcodeApplication {
//*****************************************Ejercicio 1*************************************************
//Escriba un programa que permita contar cuántos números múltiplos de 3 hay entre dos 
//extremos dados por el usuario

public static void multiplos (int num1, int num2){

int contador = 0; 

	for (int i=num1; i<=num2; i++){
		if(i%3==0){
			contador++;
		}
	}
System.out.println("La cantidad de números múltiplos de 3, entre los números "+num1 +" y "+num2 + " son: " + contador);

}

//*****************************************Ejercicio 2*************************************************
//Escriba un programa que solicite al usuario por teclado entre 1 y 10 e imprima su tabla de 
//multiplicar

public static void tabla (int num1){


System.out.println("La tabla de multiplicar del número "+num1 +" es la siguiente: ");

int resultado = 0;
for (int i=0; i<=12; i++){
		resultado=i*num1;
		System.out.print(i + "x" + num1 + "= " +resultado +", ");
	}

}

//*****************************************Ejercicio 3*************************************************
/*El consultorio del Dr. Homero Simpson tiene como política cobrar la consulta con base en el 
número de cita, de la siguiente forma: las tres primeras citas a $200.000 c/u; las siguientes dos 
citas a $150.000 c/u; las tres siguientes citas a $100.000 c/u y las restantes a $50.000 c/u, 
mientras dure el tratamiento.
Escriba un programa que permita determinar cuánto pagará un paciente por una cita y 
cuánto pagará un paciente por el total de su tratamiento, dado un número de citas.
*/

public static void consulta(int cita){

	int precio = 0;
int tratamiento = 0;

	if(cita<=3){
		precio= 200000;
		}else if(cita<=5){
			precio=150000;
		}else if(cita<=8){
			precio=100000;
		}else{
			precio=50000;
		}

tratamiento = cita*precio;	

System.out.println("Dado que su cita es la número "+ cita + ", el precio a pagar es: "+ precio);	
System.out.println("El costo total del tratamiento es: "+tratamiento);
}


//*****************************************Ejercicio 4*************************************************
/*La fábricas “Aplaplac” produce artículos con claves (1, 2, 3, 4, 5 y 6). Escriba un programa que 
permita calcular los precios de venta, de acuerdo a las siguientes reglas:
• Costo de producción = materia prima + mano de obra + gastos de fabricación.
• Precio de venta = costo de producción + 45 % de costo de producción.
• El costo de la mano de obra se obtiene de la siguiente forma: para los productos con clave 
3 o 4 se carga 75 % del costo de la materia prima; para los que tienen clave 1 y 5 se carga 
80 %, y para los que tienen clave 2 o 6, 85 %.
Para calcular el gasto de fabricación se considera que si el artículo que se va a producir tiene 
claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las claves son 3 o 
6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el mismo 
costo para cualquier clave. */

public static void preciosVenta(Double materiaPrima, double manoDeObra, double gastosDeFabricacion){

double costoProduccion = materiaPrima + manoDeObra+ gastosDeFabricacion; 
double precioVenta = costoProduccion *1.45;
int clave=0; 

if((clave==3)||(clave==4)){
	manoDeObra = materiaPrima*1.75;
}else if((clave==1)||(clave==5)){
	manoDeObra = materiaPrima*1.8;
}else if((clave==2)||(clave==5)){
	manoDeObra = materiaPrima*1.85;
}


if((clave==2)||(clave==5)){
	gastosDeFabricacion = materiaPrima*1.3;
}else if((clave==3)||(clave==6)){
	gastosDeFabricacion = materiaPrima*1.35;
}else if((clave==1)||(clave==4)){
	gastosDeFabricacion = materiaPrima*1.28;
}
	
System.out.println("El precio de venta es: " + precioVenta);

}


//*****************************************Ejercicio 5*************************************************
/*El dueño de un estacionamiento le pide que escriba un programa que le permita determinar 
cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son 
las siguientes: las dos primeras horas a $500 c/u; las siguientes tres a $400 c/u; las cinco 
siguientes a $300 c/u y después de diez horas el costo por cada una es de $200. */


public static void cobro(int horasDeUso){
int precio=0;

	if(horasDeUso<=2){
	precio=500*horasDeUso;
}else if(horasDeUso<=5){
	precio=400*horasDeUso;
}else if(horasDeUso<=10){
	precio=300*horasDeUso;
}else{
	precio=200*horasDeUso;
}

System.out.println("El cobro total del estaciomiento es de: "+ precio +" pesos debido a que estuvo estacionado " +horasDeUso +" horas.");

}



//*****************************************Ejercicio 6*************************************************
/*Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por su 
antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente forma: 
Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo; cuando 
es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es menor a 
$1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a $3500, se 
otorga 15% de su sueldo, para más de $3500. 10%. Escriba un programa que permita calcular 
los dos tipos de bono, asignando el mayor.
*/

public static void bono(int antiguedad, int sueldo){
	
	double bonoAntiguedad = 0;
	double bonoSueldo =0; 
	
	if((antiguedad >2) && (antiguedad<=5)){
		bonoAntiguedad=sueldo*1.2;
		}else if(antiguedad>5){
		bonoAntiguedad=sueldo*1.3;
		}
		

	if (sueldo<1000){
		bonoSueldo=sueldo*1.25;
	}else if ((sueldo>1000) && (sueldo<=3500)){
		bonoSueldo=sueldo*1.15;
	}else if(sueldo>3500){
		bonoSueldo=sueldo*1.10;
	}	

	if(bonoSueldo>bonoAntiguedad){
		System.out.println("Le corresponde el bono por el monto de su sueldo, el cual corresponde a: "+ bonoSueldo + "pesos.");
		}else {
			System.out.println("Le corresponde el bono por antiguedad laboral, el cual corresponde a: "+ bonoAntiguedad + " pesos.");
		}
}

//*****************************************Ejercicio 7*************************************************
/*Diseñe un programa que permita determinar si un numero es bisiesto o no; un año es bisiesto si 
es múltiplo de 4 excluyendo aquellos que son múltiplos de 100 y no de 400. En otras palabras, 
los años exactamente divisibles entre 4 son años bisiestos, los años exactamente divisibles entre 
100 no son bisiestos y los años exactamente divisibles entre 400 son bisiestos
*/

public static void anios (int anio){

	if((anio%4==0)||(anio%400==0)){
		System.out.println("El año " + anio +" es bisiesto");

	}else if(anio%100==0){
		System.out.println("El año " + anio +"  no es bisiesto");
	}else{System.out.println("El año " + anio +" no es bisiesto");}

	
	}


	public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);

//*****************************************Ejercicio 1*************************************************


System.out.println("Ejercicio 1");

System.out.print("Ingrese extremo inferior de un listado de números: ");
int num1 = teclado.nextInt();

System.out.print("Ingrese extremo inferior de un listado de números: ");
int num2 = teclado.nextInt();

multiplos(num1,num2);


//*****************************************Ejercicio 2*************************************************

System.out.println("Ejercicio 2");

System.out.println("Ingrese un número entre 1 y 10: ");
int innum1= teclado.nextInt();

tabla(innum1);


//*****************************************Ejercicio 3*************************************************

System.out.println("Ejercicio 3");

System.out.println("Ingrese el número de su consulta: ");
int num = teclado.nextInt();

consulta(num);


//*****************************************Ejercicio 4*************************************************
System.out.println("Ejercicio 4");

System.out.println("Ingrese la clave del artículo: ");
int inclave= teclado.nextInt();

System.out.println("Ingrese el costo de materia prima: ");
double inmateria = teclado.nextDouble();

double manoDeObra = 0.0;
double gastosDeFabricacion =0.0;

preciosVenta(inmateria, manoDeObra, gastosDeFabricacion);

//*****************************************Ejercicio 5*************************************************

System.out.println("Ejercicio 5");

System.out.println("Ingrese cuántas horas estuvo estacionado: ");
int inhoras = teclado.nextInt();

cobro(inhoras);

//*****************************************Ejercicio 6*************************************************
System.out.println("Ejercicio 6");

System.out.println("Ingrese su antiguedad en la empresa: ");
int inAntiguedad = teclado.nextInt(); 

System.out.println("Ingrese su sueldo en pesos: ");
int sueldo= teclado.nextInt();

double Antiguedad = 0; 
double Sueldo =0;

bono(inAntiguedad, sueldo);

//*****************************************Ejercicio 7*************************************************

System.out.println("Ejercicio 7");
System.out.println("Para conocer si el año es bisiesto o no, ingrese año: " );
int inanio = teclado.nextInt(); 

anios(inanio);

	}

}
