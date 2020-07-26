import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringsstartwithAs {

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
		List<String> res  = ValidFirstLetterAs(list, (String str) -> str.charAt(0) == 'a' && str.length() == 3);
		System.out.println("Strings with only start character as  'a' and length '3' are:");
		res.stream().forEach((i) -> System.out.println(i));
	}
	public static List<String> ValidFirstLetterAs(List<String> list, Predicate<String> predicate) {
		List<String> VaildList = new ArrayList<String>();
		for(String element : list) {
			if(predicate.test(element)) {
				VaildList .add(element);
			}
		} 
		return VaildList ;
	}

}