package Exercise;

import java.util.Arrays;
import Exercise.Student;
public class ComparableExample {
	public static void main(String[] args) {
//		int[] numbers= {50,24,82,91,13,48,72,9,5,1,33};
//		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));
		
		
//		String names[] = {"������", "������", "��ä��", "������",
//							"�ɹΰ�","���ƿ�","�����","��ȿ��",
//							"������","������","�ּ���","�ڿ���"};
//		Arrays.sort(names);
//		System.out.println(Arrays.toString(names));

		//����,,, ��Ʃ��Ʈ Ŭ������ ����,,,������
		Student[] students = {
                new Student("������", 24, "��ǻ��"),
                new Student("������", 23, "����"),
                new Student("��ä��", 22, "�̼�"),
                new Student("������", 21, "����"),
                new Student("�ɹΰ�", 21, "��ǻ��"),
                new Student("���ƿ�", 22, "����"),
                new Student("�����", 20, "����"),
                new Student("��ȿ��", 20, "����"),
        };
        Arrays.sort(students);
        for (Student student : students) {
                System.out.println(student);
        }

}}
