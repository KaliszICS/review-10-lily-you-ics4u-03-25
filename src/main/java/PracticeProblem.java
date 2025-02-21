public class PracticeProblem {

	public static void main(String args[]) {
		String q1 = pyramid(4);
		System.out.println(q1);
		String q2 = square(4);
		System.out.println(q2);
		boolean q3 = hasLowercase("Paul");
		System.out.println(q3);
	}

	public static String pyramid(int rows){
		String result = "";
		for(int i = 1; i <= rows; i++){
			for(int j = i; j < rows; j++){
				result += " ";
			}
			for(int x = 0; x < i; x++){
				if(x > 0){
					result += " ";
				}
				result += "*";
			}
			if (i < rows) {
                result += "\n";
            }
		}
		return result;
	}
	
	public static String square(int rows){
		String result = "";
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < rows; j++){
				if(i < rows - 1 && i > 0 && j < rows -1 && j > 0){
					result += " ";
				}
				else {
					result += "*";
				}
			}
			if (i < rows-1) {
                result += "\n";
            }
		}
		return result;
	}

	public static boolean hasLowercase(String word){
		boolean result = false;
		int wordInt;
		for(int i = 0; i < word.length(); i++){
			wordInt = (int)(word.charAt(i));
			if(wordInt >= 97 && wordInt <= 122){
				result = true;
			}
		}
		return result;
	}
}
