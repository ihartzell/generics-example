import java.util.ArrayList;
import java.util.Scanner;

public class GenericsDriver 
{
	public static void main(String[] args) 
	{
		// Local variables.
		int number1, number2, number3, search,varForIfBranch,varForIfStringBranch,varForIfFbBranch;
		String stringTest1,stringTest2,stringTest3;
		String stringSearch,username,password,fbSearch;
		// Scanner object for input.
		Scanner userInput = new Scanner(System.in);
		// I'm creating an object from my Utilities class.
		Utilities utilitiesObjToAccessMethods = new Utilities();
		// I'm creating array lists of different type essentially.
		// I'm making one for Ints Strings and FacebookUsers.
		// Each type of array list such as the Integer array list has a parallel array list
		// that is basically used so I can assign it to my utilities object and call for the removeDuplicates method because,
		// the removeDuplicates method has an argument that is an array list so I can't just pass it a String or whatever.
		ArrayList<Integer> personalIntegerList = new ArrayList<Integer>();
		ArrayList<Integer> parallelPersonalIntegerList = new ArrayList<Integer>();
		ArrayList<FacebookUser> fbUserList = new ArrayList<FacebookUser>();
		ArrayList<FacebookUser> parallelFbUserList = new ArrayList<FacebookUser>();
		ArrayList<String>stringList = new ArrayList<String>();
		ArrayList<String>parallelStringList = new ArrayList<String>();
		
		// Test for integers showing how the generic methods I made work for integers.
		number1 = requestInt("Please enter a number for the first three spots of this list.");
		personalIntegerList.add(number1);
		personalIntegerList.add(number1);
		personalIntegerList.add(number1);
		System.out.println(personalIntegerList);
		System.out.println();
		
		number2 = requestInt("Please enter another number for the second three spots of this list.");
		personalIntegerList.add(number2);
		personalIntegerList.add(number2);
		personalIntegerList.add(number2);
		System.out.println(personalIntegerList);
		System.out.println();
		
		number3 = requestInt("Please enter a final number for the final three spots of this list.");
		personalIntegerList.add(number3);
		personalIntegerList.add(number3);
		personalIntegerList.add(number3);
		System.out.println(personalIntegerList);
		System.out.println();
		
		System.out.println("The original list with duplicates is" + personalIntegerList);
		System.out.println();
		// I'm using my Utilities object to call for my removeDuplicates method and I'm assigning that to the list.
		parallelPersonalIntegerList = utilitiesObjToAccessMethods.removeDuplicates(personalIntegerList);
		System.out.println("After removing duplicates the result is." + parallelPersonalIntegerList);
		System.out.println();
		// This is the second half of the program tackling the sorting stuff.
		System.out.println("Now for the linear search Test.");
		search = requestInt("What number do you wish to search for?");
		
		// I'm making an integer array that has 20 elements.
		// The reason I'm making an array here is because when I call for my linearSearch method, the first
		// argument has to ben an array.
		Integer[] searchList = new Integer[9];
		for(int i = 0; i < searchList.length; i++)
		{
			searchList[i] = i;
			System.out.println(searchList[i]);
			System.out.println();
		}
		 // I'm making a variable that I can assign to basically the linearSearch method so I can create an if-else branch 
		 // for validation.
		varForIfBranch = utilitiesObjToAccessMethods.linearSearch(searchList, search);
		System.out.println(varForIfBranch);
		if(varForIfBranch > -1 )
		{
			System.out.println(search + " is in the list.");
			System.out.println();
		}
		else
		{
			System.out.println(search + " not in the list.");
			System.out.println();
		}
		 
		 // Test for Strings showing how the generic methods I made work for Strings.
		 System.out.println("Lets test for Strings.");
		 stringTest1 = requestString("Please enter a String for the first three spots of this String list.");
		 stringList.add(stringTest1);
		 stringList.add(stringTest1);
		 stringList.add(stringTest1);
		 System.out.println(stringList);
		 System.out.println();
		 
		 stringTest2 = requestString("Please enter a second String for the second three spots of this String list.");
		 stringList.add(stringTest2);
		 stringList.add(stringTest2);
		 stringList.add(stringTest2);
		 System.out.println(stringList);
		 System.out.println();
		 
		 
		 stringTest3 = requestString("Please enter the final String for the final three spots of this String list.");
		 stringList.add(stringTest3);
		 stringList.add(stringTest3);
		 stringList.add(stringTest3);
		 System.out.println(stringList);
		 System.out.println();
		 
		 
		 System.out.println("The original list with duplicates is" + stringList);
		 System.out.println();
		 
		 parallelStringList = utilitiesObjToAccessMethods.removeDuplicates(stringList);
		 
		 System.out.println("After removing duplicates the result is." + parallelStringList);
		 System.out.println("Now for the linear search test.");
		 stringSearch = requestString("What String do you wish to search for.");
		 
		 String[] stringSearchList = new String[9];
		 
		 for(int i = 0; i < stringSearchList.length; i++)
		 { 
			 // Since my iterator is an integer and I'm cycling through strings
			 // I use the String class to call for the valueOf method where I convert int i to a String.
			 stringSearchList[i] = String.valueOf(i);
			 System.out.println( stringSearchList[i]);
			 System.out.println();
		 }
		 // I'm making a variable that I can assign to basically the linearSearch method so I can create an if-else branch 
		 // for validation.
		 varForIfStringBranch = utilitiesObjToAccessMethods.linearSearch(stringSearchList, stringSearch);
		 System.out.println();
		 System.out.println(varForIfStringBranch);
		 
		 if(varForIfStringBranch > -1 )
		 {
			System.out.println(stringSearch + " is in the list.");
			System.out.println();
		 }
		 else
		 {
			 System.out.println(stringSearch + " not in the list.");
			 System.out.println();
		 }
		 // The final test for Facebook users.
		 // I create a user name and a password so when I create the FacebookUser objects I
		 // can pass into the FacebookUser the username and password arguments created by the user.
		 System.out.println("The final test will be for Facebook users.");
		 System.out.println("Create the first username and password where the username be repeated three times.");
		 username = requestString("Username:");
		 password = requestString("Password:");
		 FacebookUser fb1 = new FacebookUser(username,password);
		 fbUserList.add(fb1);
		 fbUserList.add(fb1);
		 fbUserList.add(fb1);
		 System.out.println(fbUserList);
		 System.out.println();
		 
		 System.out.println("Create the second username and password where the username will be repeated three times.");
		 username = requestString("Username:");
		 password = requestString("Password:");
		 FacebookUser fb2 = new FacebookUser(username,password);
		 fbUserList.add(fb2);
		 fbUserList.add(fb2);
		 fbUserList.add(fb2);
		 System.out.println(fbUserList);
		 System.out.println();
		 
		 System.out.println("Create the third username and password where the username will be repeated three times.");
		 username = requestString("Username:");
		 password = requestString("Password:");
		 FacebookUser fb3 = new FacebookUser(username,password);
		 fbUserList.add(fb3);
		 fbUserList.add(fb3);
		 fbUserList.add(fb3);
		 System.out.println(fbUserList);
		 System.out.println();
		 
		 System.out.println("The original list with duplicates is" + fbUserList);
		 System.out.println();
		
		 parallelFbUserList = utilitiesObjToAccessMethods.removeDuplicates(fbUserList);
		 System.out.println("After removing duplicates the result is." + parallelFbUserList);
		 System.out.println("Now for the linear search test.");
		 fbSearch = requestString("What Facebook user do you wish to search for?");
		 
		 String [] fbSearchList = new String[9];
		 for(int i = 0; i < fbSearchList.length; i++)
		 { 
			 // Since my iterator is an integer and I'm cycling through strings
			 // I use the String class to call for the valueOf method where I convert int i to a String.
			 fbSearchList[i] = String.valueOf(i);
			 System.out.println( fbSearchList[i]);
			 System.out.println();
		 }
		 
		 varForIfFbBranch = utilitiesObjToAccessMethods.linearSearch(fbSearchList, fbSearch);
		 System.out.println(varForIfStringBranch);
		 
		 if(varForIfStringBranch > -1 )
		 {
			System.out.println(fbSearch + " is in the list.");
			System.out.println();
		 }
		 else
		 {
			 System.out.println(fbSearch + " not in the list.");
			 System.out.println();
		 }
		 System.out.println("Tests completed, End of program...");
	}	// End of main method.
	
	// This just make input throughout the program cleaner instead of having to keep writing int number1 = userInput.nextInt() and then
	// some Console String output.
	public static int requestInt(String request)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.print(request);
		
		return userInput.nextInt();
	}
	// Same thing as the above method.
	public static String requestString(String stringRequest)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.print(stringRequest);
		
		return userInput.next();
	}
}	// End of driver class.