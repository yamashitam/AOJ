package p0205;

import java.util.Scanner;

public class Main {

	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int[] x = new int[5];
			x[0] = sc.nextInt();
			if(x[0]==0)break;
			for(int i = 1; i < 5; i++) x[i] = sc.nextInt();
			
			boolean flag1, flag2, flag3;
			flag1 = flag2 = flag3 = false;
			for(int i = 0; i < 5; i++) {
				if(x[i]==1)flag1 = true;
				else if(x[i]==2)flag2 = true;
				else flag3 = true;
			}
			//������
			if(flag1 && flag2 && flag3
					|| flag1 && !flag2 && !flag3
					|| !flag1 && flag2 && !flag3
					|| !flag1 && !flag2 && flag3){
				for(int i = 0; i < 5; i++)System.out.println(3);
			}
			//���s�t��
			else {
				//�O�[�ƃ`���L
				if(flag1&&flag2) {
					for(int i = 0; i < 5; i++) {
						if(x[i]==1)System.out.println(1);
						else System.out.println(2);
					}
				}
				//�O�[�ƃp�[
				else if(flag1&&flag3) {
					for(int i = 0; i < 5; i++) {
						if(x[i]==3)System.out.println(1);
						else System.out.println(2);
					}
				}
				//�`���L�ƃp�[
				else {
					for(int i = 0; i < 5; i++) {
						if(x[i]==2)System.out.println(1);
						else System.out.println(2);
					}
				}
			}
		}
	}
}