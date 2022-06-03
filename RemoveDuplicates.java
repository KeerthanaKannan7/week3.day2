package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String InputText = "We learn java basics as part of java sessions in java week1";

		//converting the string to character
		char[] convetIntoChar = InputText.toCharArray();		

		//creation of LinkedHashSet
		Set<Character> output = new LinkedHashSet<Character>();

		//looping using the length of the character to move to next
		for (int i = 0; i < convetIntoChar.length; i++) 
		{
			//adding the character to set
			if (output.add(convetIntoChar[i])) 
			{
				//printing the output
				System.out.print(convetIntoChar[i]);
			}
		}
	}
}