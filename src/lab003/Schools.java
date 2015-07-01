package lab003;

public class Schools {
	String name, sc;
	int qnt;
	double sq;
	
	Schools(String name, String sc, int qnt, double sq){
		this.name = name;
		this.sc = sc;
		this.qnt = qnt;
		this.sq = sq;
	}
	
	protected void Header(){
		System.out.printf("|--------------------------------------------|\n");
		System.out.printf("|                    Школи                   |\n");
		System.out.printf("|--------------------------------------------|\n");
		System.out.printf("| Назва       | Школа | Кількість | Площа    |\n");
		System.out.printf("|             |       |           | (м\u00B2)     |\n");
		System.out.printf("|--------------------------------------------|\n");
	}
	
	protected void Footer(){
		System.out.printf("|--------------------------------------------|\n");
		System.out.printf("| Примітка:                                  |\n");
		System.out.printf("| в стовпчику \"школа\" - скорочено тип школи  |\n");
		System.out.printf("|--------------------------------------------|\n");
	}
		
	protected void Data(String [] name, String [] sc, int [] qnt, double [] sq){
		System.out.printf("| %-11s | %5s | %9d | %-8.1f |\n", this.name, this.sc, this.qnt, this.sq);
		System.out.printf("| %-11s | %5s | %9d | %-8.1f |\n", name[0], sc[0], qnt[0], sq[0]);
		System.out.printf("| %-11s | %5s | %9d | %-8.1f |\n", name[1], sc[1], qnt[1], sq[1]);
	}
		

}
