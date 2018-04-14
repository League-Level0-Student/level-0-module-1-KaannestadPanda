package extra;

public class BADger {
	public static void main(String[] args) {

		String B = ("Badger");
		String M = ("Mushroom");
		String S = ("Snake");

		for (int K = 0; K < 5; K++) {
			for (int O = 0; O < 10; O++) {
				System.out.println(B);
			}
			if(K!=3) {
			for (int P = 0; P < 2; P++) {
				System.out.println(M);
			}
			}
			if(K==3) {
				for (int P = 0; P < 5; P++) {
				System.out.println(S);
				}
		}
		
	}
}
}
