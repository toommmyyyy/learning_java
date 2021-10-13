
public class Check_palind {
  String str;
 
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
{ String orginal=str; // to return original string in output
  str=str.toLowerCase(); 
  for(int i=0;i<=str.length()/2;i++)
  {
    char s= str.charAt(i);   // pointing to first element
    char e=str.charAt(str.length()-1-i); // pointing to last element 
    if(s!=e)
    { System.out.println(orginal+" is not plaindrome.");
      return false; 
    }

  }
  System.out.println(orginal+"  is plaindrome.");
  return true;
}

public static void main(String[] args) {
  Check_palind S1=new Check_palind("Mom"); // palindrome hai ye
  Check_palind S2=new Check_palind("Varnika","singh");  // pailndrome nahi hai ye
  Check_palind S3=new Check_palind("123321");  // palindrome hai ye
  S1.is_plaindrome();
  S2.is_plaindrome();
  S3.is_plaindrome();

}
  
}

