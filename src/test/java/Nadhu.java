public class Nadhu {

	public static void main(String[] arg) {

		String s= "Selenium";
		String upperCase = s.toUpperCase();
		String lowerCase = s.toLowerCase();
		
		System.out.print(upperCase);
		System.out.print(lowerCase);

		for(int i=s.length()-1;i>=0;i--){

		System.out.print(s.charAt(i));

		}
	}
}
