package package3;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Name: Prashant Mishra";
		System.out.println(str);

        // length() method
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // charAt() method
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // substring() method
        String substring = str.substring(7);
        System.out.println("Substring from index 7 onwards: " + substring);

        // indexOf() method
        int indexOfW = str.indexOf('M');
        System.out.println("Index of 'M': " + indexOfW);

        // replace() method
        String replacedString = str.replace('M', 'm');
        System.out.println("String with 'M' replaced by 'm': " + replacedString);

        // toUpperCase() method
        String uppercaseString = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // toLowerCase() method
        String lowercaseString = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        // startsWith() method
        boolean startsWithHello = str.startsWith("Prashant");
        System.out.println("String starts with 'Prashant': " + startsWithHello);

        // endsWith() method
        boolean endsWithWorld = str.endsWith("Mishra");
        System.out.println("String ends with 'Mishra': " + endsWithWorld);

        // trim() method
        String spacedString = "   Prashant Mishra   ";
        String trimmedString = spacedString.trim();
        System.out.println("Original string with spaces: '" + spacedString + "'");
        System.out.println("Trimmed string: '" + trimmedString + "'");

		
	}

}
