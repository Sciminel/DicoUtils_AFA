package fr.wcs.afa.dicoutils;

public class DicoUtils {

	public static void main(String[] args) {

		DicoIO test = new DicoIO();
		DicoLoad fileLoad = new DicoLoad();
		DicoSearch search = new DicoSearch();	
		String[] dico = fileLoad.loadFile("dictionnaire.txt");
		test.menu();
		int choice = test.readChoice();
		test.print("What are you looking for ?");
		String word = test.readWord();
		
		switch (choice) {
			
			case 1:
				if (search.findWord(word, dico)) {
					test.print("Congratulations");
				}else {
					test.print("You loose...");
				}
				break;
			case 2:
				String[] tab = search.findStartWord(word, dico);
				test.print("Result(s): ");
				test.printArr(tab);
				break;
		}
		
		
		
		
		/* String[] str = {"lol", "lul", "lel", "lal"};
		test.print("Yo ma fonction print marche!!!");
		test.printArr(str);
		test.menu();
		test.print("Mot lu:");
		System.out.println(test.readWord());
		test.print("Choix:");
		System.out.println(test.readChoice());
*/
	}

}
