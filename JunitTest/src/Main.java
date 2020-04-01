
public class Main {

	public static int countSpecialCharacter(String str, char ch) {
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) ==ch) {
				count += 1;
			}
		}
		return count;
	}

	public static char findMaxAsciiChar(char[] b) {
		char max = 'a';
		for (int i = 0; i < b.length; i++) {
			if (b[i] > max)
				max = b[i];
		}
		return max;
	}

	public static boolean checkCharacterWord(String str, char ch) {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) ==ch) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Count Character : " + countSpecialCharacter("karan", 'a'));
		char ch[] = { 'a', 'b', 'c' };
		System.out.println("Max Character : " + findMaxAsciiChar(ch));
		System.out.println("Check Character : " + countSpecialCharacter("karan", 'a'));
	}

}
