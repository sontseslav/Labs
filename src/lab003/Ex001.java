package lab003;
import java.util.Locale;
import java.util.Scanner;
public class Ex001 {

	public static void main(String[] args) {
		String[] name;
		name = new String[2]; //Use array list for undefined size
		String[] sc;
		sc = new String[2];
		int[] qnt;
		qnt = new int[2];
		double[] sq;
		sq = new double[2];
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US); //Otherwise double separator treats as ","! Output is "," anyway.
		try{
			for(int i = 0; i < 2; i++){
				System.out.println("Ведіть назву, тип школи, клькість учнів і площу приміщення:");
				name[i] = in.next();
				sc[i] = in.next();
				qnt[i] = in.nextInt();
				sq[i] = in.nextDouble();
			}
		}catch (Exception ex){
			System.out.println("Error "+ ex + " exception caught! Exiting...");
			return;
		}finally{
			//System.out.println("Closing scanner...");
			in.close();
		}
		Schools schools = new Schools("Лінгвіст", "Л", 220, 368.8);
		schools.Header();
		schools.Data(name, sc, qnt, sq);
		schools.Footer();
	}
}
