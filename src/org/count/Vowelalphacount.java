package org.count;

public class Vowelalphacount {
	public static void main(String[] args) {
		String s="Ajeetha123";
		String l = s.toLowerCase();
		String vowel="",nonvowel="";
		for (int i = 0; i < s.length(); i++) {
			char c = l.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel=vowel+c;
			}
			else {
				nonvowel=nonvowel+c;
			}
			
		}
		System.out.println(vowel);
		System.out.println(nonvowel);
	}	
}
