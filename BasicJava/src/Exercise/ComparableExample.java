package Exercise;

import java.util.Arrays;
import Exercise.Student;
public class ComparableExample {
	public static void main(String[] args) {
//		int[] numbers= {50,24,82,91,13,48,72,9,5,1,33};
//		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));
		
		
//		String names[] = {"유지형", "고혜인", "박채록", "고정현",
//							"심민경","정아영","김규진","서효림",
//							"윤지영","이혜원","최서현","박예린"};
//		Arrays.sort(names);
//		System.out.println(Arrays.toString(names));

		//에구,,, 스튜던트 클래스가 없네,,,귀차나
		Student[] students = {
                new Student("유지형", 24, "컴퓨터"),
                new Student("고혜인", 23, "음악"),
                new Student("박채록", 22, "미술"),
                new Student("고정현", 21, "국어"),
                new Student("심민경", 21, "컴퓨터"),
                new Student("정아영", 22, "수학"),
                new Student("김규진", 20, "영어"),
                new Student("서효림", 20, "수학"),
        };
        Arrays.sort(students);
        for (Student student : students) {
                System.out.println(student);
        }

}}
