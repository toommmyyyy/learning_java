
public class Check_palind {
  String s1,s2,str;
  Check_palind(String str1) // constructor for 1 string
  {
     str=str1;
  }
Check_palind(String str1,String str2) // constructor for 2 string 
{
   str=str1+str2; 
}

// method to check if it is palindrome or not 
boolean is_plaindrome()
{
  str=str.toLowerCase();
  for(int i=0;i<=str.length()/2;i++)
  {
    char s= str.charAt(i); 
     
    char e=str.charAt(str.length()-1-i);
    if(s!=e)
    { System.out.println(str+" is not plaindrome.");
      return false;
    }

  }
  System.out.println(str+"  is plaindrome.");
  return true;
}

public static void main(String[] args) {
  Check_palind S1=new Check_palind("Mom");
  Check_palind S2=new Check_palind("Varnika","singh");
  Check_palind S3=new Check_palind("123321");
  S1.is_plaindrome();
  S2.is_plaindrome();
  S3.is_plaindrome();

}
  
}

