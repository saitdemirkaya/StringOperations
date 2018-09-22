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
		/*validlist unique karakterler için tanýmlanmýþ dizidir.Eleman tekrar geldiðinde validlist'ten çýkarýlýr.
		 * Çýkarýlan elemaný hafýzada saklamak için invalidList tanýmladým.Silinen elemanlar birdaha eklenmesin diye bu arraylist'e ekleniyor.
		 * Eðer invalidlist'te eleman varsa ve validList'te yoksa hiç bir iþlem yapýlmýyor. 
		 * Hem invalid hem de valid dizisinde eleman yoksa yeni elemandýr validlist'e eklenir.
		 * */
		ArrayList<String> validlist=new ArrayList<String>();
		ArrayList<String> invalidlist=new ArrayList<String>();
		String[] chars = word.split("");
			for(int i=0;i<chars.length;i++) {
				if(validlist.contains(chars[i])) {
					validlist.remove(chars[i]);// tekrarlandýðý için validlist'ten siliniyor
					invalidlist.add(chars[i]);//birdaha geldiðinde eklenmemek için invalidlist'e atýlýyor.
				}else if(!validlist.contains(chars[i])&&!invalidlist.contains(chars[i])) {// eðer ikisine de hiç gelmemiþse validList'e ekleniyor.
					validlist.add(chars[i]);
				}
			}
		System.out.println(validlist.get(0));// ilk tekrar etmeyen karakter
	    }	
}