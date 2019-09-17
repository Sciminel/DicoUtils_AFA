package fr.wcs.afa.dicoutils;

import java.io.BufferedReader;
import java.io.FileReader;

public class DicoLoad {
	
	public String[] loadFile(String path) {
		
		try {
			// initialisation des variables;
			int i = 0;
			//On défini le nombre d'index dans la tableau file;
			String[] file = new String[336532];
			//Lecture du fichier dictionnaire.txt;
			BufferedReader readFile = new BufferedReader(new FileReader(path));
			//On initialise line;
			String line;
			//On boucle sur ReadFile en utilisant line
			while((line = readFile.readLine()) != null) {
				//On stock file[i] dans line pour que readLine() 
				//ne renvoie pas null à la fin du tableau ([336532 + 1]) 
				file[i++] = line;
			}
			//On close le fichier
			readFile.close();
			return file;
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
