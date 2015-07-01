package lab001;
public class ex001 {

	public static void main(String[] args) {
		double a= 12.5, b= 1.3, c= 14.1, x= 3.3;
		double t2=1/(2*a*b)*Math.log((Math.sqrt(c*c - b*b)*Math.tan(a*x)+2)/(Math.sqrt(c*c-b*b)*Math.tan(a*x)-2));
		System.out.println("t2 = "+t2);
		System.out.println("t2 rounded: "+Math.round(t2));

	}

}
