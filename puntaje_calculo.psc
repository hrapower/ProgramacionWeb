Algoritmo puntaje_calculo
	//autor: ramirez barraza hugo
	//fecha: 30 de agosto de 2022
	//calcula puntaje a partir de respuestas correctas e incorrectas
	Definir puntaje Como Entero;
	Definir rescorr, resin, resblan Como Entero
	
	Escribir "cantidad respuestas correctas"
	Leer rescorr
	Escribir  "cantidad de respuestas incorrectas"
	Leer resin
	Escribir  "cantidad de respuestas vacias"
	Leer resblan
	puntaje= rescorr*4 - resin
	Escribir "puntaje total=", puntaje;
	
	
	
	
	
	
	
	
	
FinAlgoritmo
