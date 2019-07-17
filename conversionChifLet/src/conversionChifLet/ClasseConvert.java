package conversionChifLet;

public class ClasseConvert {
	
	
	public  String return_Convert(String mnt) {
	
		final String t1[] = {"", "UN", "DEUX", "TROIS","QUATRE","CINQ","SIX","SEPT","HUIT","NEUF","DIX","ONZE","DOUZE","TREIZE","QUATORZE","QUINZE", "SEIZE", "DIX SEPT", "DIX HUIT", "DIX NEUF"};
		final String t2[] = {"", "DIX", "VINGT", "TRENTE", "QUARANTE", "CINQUANTE", "SOIXANTE", "SOIXANTE DIX", "QUATRE VINGT", "QUATRE VINGT DIX", "CENT"};
		final String t3[]= {"", "MILLION", "MILLE","DINAR", "MILLIME"};
		int i=0,j=0;
		 String mont="";
		int mt=0;
		 String result="";
		 String x="";
	    int y=0,du=0,c=0,d=0,u=0;
	    Boolean[] t4= new Boolean[4];
      
	 for (i=0;i<=3;i++) {
	  t4[i] = false;
	 	 }
	 	 result = "";
	
	 mt = Integer.parseInt(mnt);
	
	 mont = String.valueOf(Integer.parseInt(mnt));
	
	if (mt != 0) { //1
	  y =  mnt.trim().length();
	  
	  mont = RepeatString.RepeatStr(12 - mont.trim().length(), "0") + mont.trim();
	  
	     i = 0;		 y = 0;
	   for (j = 1;j<=4;j++) {
	        x = mont.substring(i,i+3); 
	       
	        i=  i + 3;
	        y =  Integer.parseInt(x);
	     
	     if (y != 0) { 
	    	 t4[j-1] = true;
	    	 
	        c =  Integer.parseInt(RepeatString.LeftStr(x,1));
	        d= Integer.parseInt(RepeatString.CopyOfstr(x, 2, 1));
	       
	        u =  Integer.parseInt(RepeatString.CopyOfstr(x, 3, 1));
	        
	        du= Integer.parseInt(RepeatString.CopyOfstr(x, 2, 2));		
	        
	        if (c != 0)  
	        	{
	          if (c == 1)  {result = result + " CENT";} else {result = result + " " + t1[c] + " CENT";}
	        
	        }
	       
	        
	        if (d != 0) {
	           
	           if (d == 1) {
	               if (u == 1) {result = result + " ET";}
	                u = 0;
	                result = result + " " + t1[du];}
	           else
	           {
	                if (u != 0) 
	                {
	                
	                if (RepeatString.CopyOfstr(x, 2, 1) == "7" || RepeatString.CopyOfstr(x, 2, 1) == "9") 
	                {
	                               d = d - 1 ;
	                      u = u + 10;
	                }
	                                 
	                                   result = result + " " + t2[d];
	                }         
	                            else
	                            {result = result + " " + t2[d];}
	           }
	        
	        }
	        
	        
	        if (j == 2 && y == 1) {;}
	           else {
	           if (u != 0) {
	                if (u ==1 && y > 1) { result = result + " ET " + t1[u];} else {result = result + " " + t1[u];}
	           }
	           }
	      result = result + " " + t3[j];
	      
	        if (y > 1 && j != 2) {result = result + "S";}
	     }
	     
	     if (j == 3) {
	             if (!t4[2]) {
	                    if (!t4[1] && t4[0]) {result = result + " DE";}
	           if (t4[0] || t4[1]) {result = result + " " + t3[3] + "S";}
	             }
	     }
	     
	   
	
	        
	     
	   
	}
	
	     }
	    
	return result;
	
	}
}

	
	     
	   

