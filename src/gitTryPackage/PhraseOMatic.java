package gitTryPackage;

public class PhraseOMatic {

	public static void main(String[] args) {
		String[] wordList1 = {"He","She"};
		String[] wordList2 = {"buys", "sells", "makes"};
		String[] wordList3 = {"buns","chocoloates","cakes","toffees"};
		int count1 = wordList1.length;
		int count2 = wordList2.length;
		int count3 = wordList3.length;
		int rand1 = (int) (Math.random()*count1);
		int rand2 = (int) (Math.random()*count2);
		int rand3 = (int) (Math.random()*count3);
		
		String phrase = wordList1[rand1] +" "+ wordList2[rand2] +" "+wordList3[rand3] +".";
		System.out.println(phrase);

	}

}
