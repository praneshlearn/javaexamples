
public class TypePromotion {
	void show(int x) {
		System.out.println("Integer " + x);
	}

	void show(byte b) {
		System.out.println("Byte " + b);
	}

	public static void main(String[] args) {
		TypePromotion t = new TypePromotion();
		char c = 'h';
		t.show(c);
	}
}
