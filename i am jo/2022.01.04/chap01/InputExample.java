package chap01;
import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		String name;
		int age;
		double height;
		String intro;
		String buffer;
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���");
		name = sc.next();
		System.out.print("���̸� �Է��ϼ���");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���");
		height = sc.nextDouble();
		System.out.println("�ڱ�Ұ��� �Է��ϼ���");
		buffer = sc.nextLine();
		intro = sc.nextLine();
		
		sc.close();
		
		System.out.println("�̸���" + name +",���̴�" + age +",Ű��" + height +" �Դϴ�.");
		System.out.println(intro);
	}
}
//buffer�� ���� ���� �ʿ�� ����