import java.util.ArrayList;
import java.util.Scanner;

public class Unique_character {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("String: \n");
		String word = input.next();
		findUnique(word);
		
	}
	public static void findUnique(String word) {
		/*validlist unique karakterler i�in tan�mlanm�� dizidir.Eleman tekrar geldi�inde validlist'ten ��kar�l�r.
		 * ��kar�lan eleman� haf�zada saklamak i�in invalidList tan�mlad�m.Silinen elemanlar birdaha eklenmesin diye bu arraylist'e ekleniyor.
		 * E�er invalidlist'te eleman varsa ve validList'te yoksa hi� bir i�lem yap�lm�yor. 
		 * Hem invalid hem de valid dizisinde eleman yoksa yeni elemand�r validlist'e eklenir.
		 * */
		ArrayList<String> validlist=new ArrayList<String>();
		ArrayList<String> invalidlist=new ArrayList<String>();
		String[] chars = word.split("");
			for(int i=0;i<chars.length;i++) {
				if(validlist.contains(chars[i])) {
					validlist.remove(chars[i]);// tekrarland��� i�in validlist'ten siliniyor
					invalidlist.add(chars[i]);//birdaha geldi�inde eklenmemek i�in invalidlist'e at�l�yor.
				}else if(!validlist.contains(chars[i])&&!invalidlist.contains(chars[i])) {// e�er ikisine de hi� gelmemi�se validList'e ekleniyor.
					validlist.add(chars[i]);
				}
			}
		System.out.println(validlist.get(0));// ilk tekrar etmeyen karakter
	    }	
}