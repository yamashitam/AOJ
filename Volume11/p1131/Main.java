package p1131;

import java.util.Scanner;

public class Main {
	
	class Fraction {
		int p, q;
		public Fraction(int p, int q) {
			this.p = p;
			this.q = q;
		}
		Fraction sub(Fraction f) {
			return new Fraction(this.p*f.q - this.q*f.p, this.q*f.q);
		}
	}

	int a, n;
	
	// f : ����
	// k : ������
	// prev : ���O�ɑI�������P�ʕ����̕���
	// pow : ����܂ł̒P�ʕ����̕���̐�
	int search(Fraction f, int k, int prev, int pow) {
		if(pow > a)
			return 0;
//		System.out.println(f.p + "/" + f.q + ", k = " + k + ", prev = " + prev + ", pow = " + pow);
		if(k > n) {
			return 0;
		}
		if(f.p==0) {
//			System.out.println("find");
			return 1;
		}
		
		int count = 0;
		for(int i = prev; pow*i <= a; i++) {
			Fraction _f = f.sub(new Fraction(1, i));
			if(_f.p < 0) continue;
			count += search(_f, k+1, i, pow*i);
		}
		return count;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			if(p==0&&q==0&&a==0&&n==0) break;
			
			Fraction origin = new Fraction(p, q);
			
			System.out.println(search(origin, 0, q/p, 1));
		}

	}
	
	public static void main(String[] args) {
		(new Main()).run();
	}
}
