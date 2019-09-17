package fr.wcs.afa.dicoutils;

public class DicoSearch {
	
	public static boolean findWord(String word, String[] dico) { 
		
		boolean test = false;
		for (String i : dico) {
			if (word.equals(i)) {
				test = true;
			} 
		}
		return test;
	}


	public static String[] findPart(String word, String[] dico) {
		boolean test = false;
		String[] middle = new String[336532];
		int cpt = 0;
		for (String i : dico) {
			if (i.contains(word)) {
				middle[cpt++] = i;
				test = true;
			}
		}
		if (test) {
			return middle;
		}else {
			return null;
		}
	}
	
	public static String[] findStartWord(String word, String[] dico) {
		boolean test = false;
		String[] firstLetter = new String[336532];
		int cpt = 0;
		for (String i : dico) {
			if (i.startsWith(word)){
				firstLetter[cpt++] = i;
				test = true;
			}
		}
		if (test) {
			return firstLetter;
		}else {
			return null;
		}
	}
	
	public static String[] finfEndWword(String word, String[] dico) {
		boolean test = false;
		String[] lastLetter = new String[336532];
		int cmp = 0;
		for (String i : dico) {
			if (i.endsWith(word)) {
				lastLetter[cmp++] = i;
				test = true;
			}
		}
		if (test){
			return lastLetter;
		}else {
			return null;
		}
	}
	
	public static String[] findRegex(String word, String[] dico) {
		boolean test = false;
		String[] tab = new String[336532];
		int cmp = 0;
		for (String i : dico) {
			if (i.matches(word)) {
				tab[cmp++] = i; 
				test = true;
			}
		}
		if (test) {
			return tab;
		}else {
			return null;
		}
	}
}