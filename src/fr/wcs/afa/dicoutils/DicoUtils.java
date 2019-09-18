package fr.wcs.afa.dicoutils;

public class DicoUtils {

	public static void main(String[] args) {
		
		boolean running = true;
		DicoIO test = new DicoIO();
		DicoLoad fileLoad = new DicoLoad();
		DicoSearch search = new DicoSearch();	
		String[] dico = fileLoad.loadFile("dictionnaire.txt");
		while(running) {
			test.menu();
			int choice = test.readChoice();
			if(choice == 0) break;
			test.print("What do you search ?");
			String word = test.readWord();
		
			switch (choice) {
			
			//	case 0:
			//		running = false;
			//		break;
				case 1:
					if (search.findWord(word, dico)) {
						test.print("Congratulations");
					}else {
						test.print("You lose...");
					}
					break;
				case 2:
					String[] tabStart = search.findStartWord(word, dico);
					test.print("Result(s): ");
					test.printArr(tabStart);
					break;
				case 3:
					String[] tabEnd = search.findEndWord(word, dico);
					test.print("Result(s)");
					test.printArr(tabEnd);
					break;
				case 4:
					String[] tabPart = search.findPart(word, dico);
					test.print("Result(s)");
					test.printArr(tabPart);
					break;
				case 5:
					String[] tabReg = search.findRegex(word, dico);
					test.print("Result(s)");
					test.printArr(tabReg);
					break;
				default:
					test.print("The number must be between 0 and 5");
			}
		
		
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
