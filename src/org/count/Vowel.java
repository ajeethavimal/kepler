package org.count;

public class Vowel {
	public static void main(String[] args) {
		String s="Ajeetha";
		int vowel=0,nonvowel=0;
		String l = s.toLowerCase();
		for (int i = 0; i <s.length(); i++) {
			char c = l.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}
			else
			{
				nonvowel++;
			}
		}
			System.out.println(vowel++);
			System.out.println(nonvowel++);
	}

}
