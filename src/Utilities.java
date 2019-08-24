import java.util.ArrayList;

public class Utilities 
{
	// This method returns a generic array list of type (T) which is kind of like a variable but not exactly
	// Essentially what this allows me to be able to do is with ease in the driver be able to use these two method
	// for And data type. Where as usually you have to design method for floats and doubles and integers, ect.
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
	{
		ArrayList<T> usedList = new ArrayList<T>();
		ArrayList<T> newList = new ArrayList<T>();
		for(int i = 0; i < list.size(); i++)
		{
			T obj = list.get(i);
			
			if(!usedList.contains(obj))
			{
				usedList.add(obj);
				newList.add(obj);
			}
		}
		return newList;
	}
	// This method extends the Comparable class so that it can work in conjunction with the linearSearch method, because
	// I want to be able to call for the compareTo method. Basically I pass into this method a generic array and a generic
	// variable called key. I then cycle through the generic array called searchList passed into this method and cycle through the 
	// iterator of course. I then say if the searchList with the index comparing it to whatever the key is is equivalent to zero.
	// Then I simply return what that index is. Otherwise I return -1 meaning it couldn't find whatever the user was searching for in the
	// list.
	public static <T extends Comparable <T>> int linearSearch(T[] searchList, T key)
	{
		for(int i = 0; i <searchList.length; i++)
		{
			if(searchList[i].compareTo(key) == 0)
			{
				return i;
			}
		}
		// -1 means that the case failed basically, 0 or 1 means it goes through.
		return -1;
	}
}
