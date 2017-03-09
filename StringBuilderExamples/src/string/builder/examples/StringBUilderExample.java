package string.builder.examples;

public class StringBUilderExample {
	public static void main(String []args){
		String words[]={"Saurabh",
						"Singh",
						"Manjusha",
						"Ray",
						"Shreepad",
						"Patil",
						"Alok",
						"Singh"};
		
		StringBuilder sentence = new StringBuilder();
		for(String w : words){
			sentence=sentence.append(w);
		}
		
		System.out.println(sentence);
		
	}

}
