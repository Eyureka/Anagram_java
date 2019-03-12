
import java.util.*;

 class Anagram {
    static boolean isAnagram(String a, String b) {
        
        if(a.length()!=b.length())
            return false;                      //exit if length is not same

        a=a.toLowerCase();
        b=b.toLowerCase();
        int i,j,k;
        char temp,ca[]=a.toCharArray(),cb[]=b.toCharArray();            //convert to char array, then sort and compare
        
    for(i=0;i<ca.length-1;i++)
     {
       k=i;
       for(j=i+1;j<ca.length;j++)
        { if(ca[j]<ca[k])
              k=j;  
         }
      temp=ca[k];
      ca[k]=ca[i];
      ca[i]=temp; 
     } 
       

    for(i=0;i<cb.length-1;i++)
     {
       k=i;
       for(j=i+1;j<cb.length;j++)
        { if(cb[j]<cb[k])
              k=j;  
         }
      temp=cb[k];
      cb[k]=cb[i];
      cb[i]=temp; 
     } 

        for(i=0;i<ca.length;i++)                           //comparing two sorted char arrays
        {
            if(ca[i]!=cb[i])
                return false;
        }
    return true;
        
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}