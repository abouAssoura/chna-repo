package conversionChifLet;

abstract class TestSaisieErroneeException {
	 public static void controle(String chaine) throws TestException {
		 if (chaine.equals("") == true)
		 throw new TestException("Saisie erronee : chaine vide");
		 }
		 public static void main(java.lang.String[] args) {
		 String chaine1 = "bonjour";
		 String chaine2 = "";
		 try {
		 controle(chaine1);
		 } catch (TestException e) {
		 System.out.println("Chaine1 saisie erronee");
		
		 }
		 try {
		 controle(chaine2);
		 } catch (TestException e) {
		 System.out.println("Chaine2 saisie erronee");
		 }
		 }
		}
	

