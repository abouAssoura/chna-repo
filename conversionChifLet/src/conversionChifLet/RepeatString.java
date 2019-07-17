package conversionChifLet;
import java.util.Formatter;
public class RepeatString {

public static String ChnFormat(int nfois,int nombre) {
			@SuppressWarnings("resource")
			Formatter formatter = new Formatter();
			 formatter.format("%0"+nfois +"d \n",nombre);
			 String resultat = formatter.toString();
			 return resultat;
			 
	}
	public static String RepeatStr (int longeur,String aRepeat) {
		String aRepeater ="";
		for(int i = 1; i <= longeur; i++) { aRepeater= aRepeater+aRepeat;}
		return aRepeater;
	}
	public static String LeftStr (String str,int len) {
		String s="";
		if (str!="" && len>0) {
		if (str.length()>=len) { s=str.substring(0, len);} else s=str.substring(0,str.length());
		}
		return s;
		
	}
	public static String RightStr (String str,int len) {
		String s="";
		if (str!="" && len>0) {
		if (str.length()>=len) { s=str.substring(str.length()-len, str.length());}  else s=str;
		}
		return s;
		
	}
	public static String CopyOfstr (String str,int debut,int len) {
		String s="";
			//abdallah 8,2
		if (str!="" && debut<= str.length() && len>0) {
		if (str.length()>=len && str.length()>=len+debut) {
			s=str.substring(debut-1, (debut-1)+len);} 
		else  {s=str.substring(debut-1);} 
		} 
		
		return s;
		
	}
}


