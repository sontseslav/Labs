package lab002;
import java.util.Scanner;;
public class Ex001 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String name1, name2, name3, group1, group2, group3, areal1, areal2, areal3;
		int population1, population2, population3;
		try{
		    System.out.println("1. Enter name, group, areal, population");
                    name1 = in.next();
                    group1 = in.next();
                    areal1 = in.next();
                    population1 = in.nextInt();
                    System.out.println("2. Enter name, group, areal, population");
                    name2 = in.next();
                    group2 = in.next();
                    areal2 = in.next();
                    population2 = in.nextInt();
                    System.out.println("3. Enter name, group, areal, population");
                    name3 = in.next();
                    group3 = in.next();
                    areal3 = in.next();
                    population3 = in.nextInt();
		}finally{
                    in.close();
		}
		System.out.printf("--------------------------------------------------------|\n");
		System.out.printf("|Породи собак                                           |\n");
		System.out.printf("--------------------------------------------------------|\n");
		System.out.printf("|Назва       |Група |Мешкання     |Численність популяції|\n");
		System.out.printf("--------------------------------------------------------|\n");
		System.out.printf("| %-10s | %-4s | %-11s | %-19d |\n", name1, group1, areal1, population1);
		System.out.printf("| %-10s | %-4s | %-11s | %-19d |\n", name2, group2, areal2, population2);
		System.out.printf("| %-10s | %-4s | %-11s | %-19d |\n", name3, group3, areal3, population3);
		System.out.printf("--------------------------------------------------------|\n");
		System.out.printf("|Породи: A-неагресивні, Б-агресивні                     |\n");
		System.out.printf("--------------------------------------------------------|\n");

	}

}
