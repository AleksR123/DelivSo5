
import java.util.Scanner;

public class deliviSo5 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Da se ispecatat: clenovite na niza koi ne se delivi so 5");
		System.out.println("Vnesi broj na clenovi vo nizata ");
		int n = input.nextInt();
		
		int niza[] = new int[n];
        for (int i =0; i < niza.length; i++) 
        {
        	System.out.print(i +"-->");	
        	niza[i] = input.nextInt();//vcitaj niza[i] - i-ti clen vo niza
		}
		for(int i=0; i < niza.length; i++) {
			if(niza[i] % 5!=0) {
				System.out.println("niza[" + i + "]=" + niza[i]);	
			}
				
			
		}
		
		
  }
}
