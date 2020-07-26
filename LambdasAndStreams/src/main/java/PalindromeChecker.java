import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PalindromeChecker {
  public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int size;
				List<String> list  = new ArrayList<String>();
				System.out.println("Enter the size of the list");
				size = sc.nextInt();
				System.out.println("Enter the list of strings");
				for(int i = 0; i < size; i++) {
					list.add(sc.next());
				}
				List<String> result = checkPalindrome(list);
				System.out.println("Palindromes of given list are:");
		    	result.forEach(
		    			  (n)->System.out.println(n)  
		    	);

}
			
	public static List<String> checkPalindrome(List<String> list){
		    	List<String> checkedstrings = new ArrayList<String>();
		        list.forEach(str -> {StringBuilder strbuild = new StringBuilder();
		            for (char c : str.toCharArray()) {
		                if (Character.isLetter(c)) {
		                    strbuild.append(c);
		                }
		            }
		            String lefttoright = strbuild.toString().toLowerCase();
		            String righttoleft = strbuild.reverse().toString().toLowerCase();
		            if(lefttoright.equals(righttoleft)) {
		            	checkedstrings.add(str);
		            }
		        });
		        return checkedstrings;
		    }


	}


