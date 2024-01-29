package TP1.ressources;

import java.util.Scanner;

public class MainTP1 {


	/********************** Partie méthodes *************************/

		/* méthode réalisant une conversion degrés Celsius vers degrés Farenheit
		 Entrée : un nombre réel tempC passé en paramètre
		 tempC représente une temperature exprimée en degrés Celsius
		 Résultat : un nombre réel résultat de la conversion en degrés Farenheit
		 Méthode : calcul de tempC * 1,8 + 32.  */
	
		public static double celsius2Farenheit(double tempC) {
			return tempC * 1.8 + 32;	
		}
	
	
	/************************Partie Main ************************/
	
	/* Cette méthode main est la méthode principale
	Le programme commence à s'exécuter à partir de là
	et appelle d'autres méthodes */
	
	
	public static void main(String[] args) {

		/* Test de la conversion Celsius vers Farenheit */
		 
		 	System.out.println("**** Test de la conversion Celsius vers Farenheit ****");
		 
		 	// Cas 1 : valeur de température ordinaire en été à Montpellier
		 
		 	System.out.println("En été à Montpellier : 35 degrés celsius valent "+
				 celsius2Farenheit(35)+" en degrés Farenheit");
		
		 	// Cas 2 : sur le même modèle, donner le code permettant de calculer la température d'ébullition de l'eau (exercice)
		 
					 	
		
}	
}
	
