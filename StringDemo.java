public class StringDemo {
	public static void main(String[] args) {
		// Initializing sample strings
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "World";
		String str4 = "Hello, World!";
		String str5 = "Java is awesome";

		// charAt() - Returns the character at the specified index
		char charAtIndex = str1.charAt(1);
		System.out.println("charAt(1): " + charAtIndex);

		// compareTo() - Compares two strings lexicographically
		int compareToResult = str1.compareTo(str2);
		System.out.println("compareTo(str2): " + compareToResult);

		// concat() - Concatenates two strings
		String concatenatedStr = str1.concat(" ").concat(str3);
		System.out.println("concat(str3): " + concatenatedStr);

		// contains() - Checks if the string contains a specified substring
		boolean containsStr = str4.contains("World");
		System.out.println("contains(\"World\"): " + containsStr);

		// endsWith() - Checks if the string ends with a specified suffix
		boolean endsWithStr = str4.endsWith("!");
		System.out.println("endsWith(\"!\"): " + endsWithStr);

		// equals() - Compares two strings for equality
		boolean equalsStr = str1.equals(str2);
		System.out.println("equals(str2): " + equalsStr);

		// equalsIgnoreCase() - Compares two strings ignoring case differences
		boolean equalsIgnoreCaseStr = str1.equalsIgnoreCase(str2);
		System.out.println("equalsIgnoreCase(str2): " + equalsIgnoreCaseStr);

		// format() - Formats a string using specified format strings and arguments
		String formattedStr = String.format("The value of pi is approximately %.2f", Math.PI);
		System.out.println("Formatted string: " + formattedStr);

		// getBytes() - Encodes the string into a sequence of bytes using the platform's
		// default charset
		byte[] bytes = str4.getBytes();
		System.out.println("getBytes(): " + bytes);

		// indexOf() - Returns the index of the first occurrence of a specified
		// substring
		int indexOfStr = str4.indexOf(",");
		System.out.println("indexOf(\",\"): " + indexOfStr);

		// intern() - Returns a canonical representation of the string
		String internedStr = str4.intern();
		System.out.println("intern(): " + internedStr);

		// isEmpty() - Checks if the string is empty
		boolean isEmptyStr = str1.isEmpty();
		System.out.println("isEmpty(): " + isEmptyStr);

		// join() - Concatenates multiple strings using a specified delimiter
		String joinedStr = String.join(" ", str1, str3);
		System.out.println("join(\" \", str1, str3): " + joinedStr);

		// lastIndexOf() - Returns the index of the last occurrence of a specified
		// substring
		int lastIndexOfStr = str4.lastIndexOf("o");
		System.out.println("lastIndexOf(\"o\"): " + lastIndexOfStr);

		// length() - Returns the length of the string
		int length = str4.length();
		System.out.println("length(): " + length);

		// replace() - Replaces occurrences of a specified substring with another
		// substring
		String replacedStr = str4.replace(",", "|");
		System.out.println("replace(\",\", \"|\"): " + replacedStr);

		// replaceAll() - Replaces each substring that matches the given regular
		// expression with the given replacement
		String replacedAllStr = str5.replaceAll("Java", "Python");
		System.out.println("replaceAll(\"Java\", \"Python\"): " + replacedAllStr);

		// split() - Splits the string into an array of substrings based on a specified
		// delimiter
		String[] splitStr = str4.split(",");
		System.out.println("split(\",\"): ");
		for (String s : splitStr) {
			System.out.println(s);
		}

		// startsWith() - Checks if the string starts with a specified prefix
		boolean startsWithStr = str4.startsWith("Hello");
		System.out.println("startsWith(\"Hello\"): " + startsWithStr);

		// substring() - Returns a substring from the original string
		String substringStr = str4.substring(7);
		System.out.println("substring(7): " + substringStr);

		// toCharArray() - Converts the string to a character array
		char[] charArray = str4.toCharArray();
        System.out.println("toCharArray(): " + new String(charArray)); 

		// toLowerCase() - Converts the string to lowercase
		String lowerCaseStr = str4.toLowerCase();
		System.out.println("toLowerCase(): " + lowerCaseStr);

		// toUpperCase() - Converts the string to uppercase
		String upperCaseStr = str4.toUpperCase();
		System.out.println("toUpperCase(): " + upperCaseStr);

		// trim() - Removes leading and trailing whitespaces
		String spacedStr = "   Hello, World!   ";
		String trimmedStr = spacedStr.trim();
		System.out.println("trim(): " + trimmedStr);

		// valueOf() - Returns the string representation of the specified value
		String valueOfInt = String.valueOf(123);
		System.out.println("valueOf(123): " + valueOfInt);
	}
}

