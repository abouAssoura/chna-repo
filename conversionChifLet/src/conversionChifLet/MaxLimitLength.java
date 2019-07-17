package conversionChifLet;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MaxLimitLength extends PlainDocument {
	private static final long serialVersionUID = -7050196836490595739L;
	private int limite;
	 public MaxLimitLength (int maximum)
	 {
		 this.limite=maximum;
	 
	 }
   @Override
public void insertString(int offset,String str,AttributeSet set) throws BadLocationException
   {
	   if (str==null)
	   {
		   return;
	      } else if ((getLength()+str.length())<=limite);
	    		  { 
	    	   super.insertString(offset, str, set);
	    		  }
}
}
