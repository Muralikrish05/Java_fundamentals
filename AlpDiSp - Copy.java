class AlpDiSp{
	public static void main(String[] args) {
		char ch1=')';
		if(Character.isAlphabetic(ch1)){
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(ch1)){
			System.out.println("Digit");
		}
		else{
			System.out.println("Special character");
		}
	}
}