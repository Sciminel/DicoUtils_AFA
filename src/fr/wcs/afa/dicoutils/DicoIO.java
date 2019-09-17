package fr.wcs.afa.dicoutils;
import java.util.Scanner;

public class DicoIO {
	Scanner sc = new Scanner(System.in);
	
	public void print(String str){
		System.out.println(str);
		}
	
	public void printArr(String[] str){
		int i = 0;
		System.out.print("Results: ");
		while(/*str[i].getClass() == String.class*/i < 4)
			System.out.print(str[i++] + " ");
		}

	public void menu(){
		System.out.println("Menu:\n\t1)Find one single word.\n\t2)Words starting with...\n\t3)Words ending with...\n\t4)Words containing...\n\t5)With a REGular EXpression.\n\t0)Exit?!");
		}
	
	public String readWord(){
		return sc.next();
		}

	public int readChoice(){
		return sc.nextInt();
		}
	
	/*public static void main(String Args[]){
		DicoIO test = new DicoIO();
		String[] str = {"lol", "lul", "lel", "lal"};
		test.print("Yo ma fonction print marche!!!");
		test.printArr(str);
		test.menu();
		test.print("Mot lu:");
		System.out.println(test.readWord());
		test.print("Choix:");
		System.out.println(test.readChoice());
		}*/
	}
