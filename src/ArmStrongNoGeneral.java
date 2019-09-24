
public class ArmStrongNoGeneral {
	public static void main(String[] args) {

		for (int i = 0; i < 99999; i++) {
			int temp2;
			int sum1 = 0;
			int temp1 = temp2 = i;
			int d = 0; // No of digits in number
			while (temp1 > 0) {
				temp1 = temp1 / 10;
				d++;
			}
			int sum = 0;
			// System.out.println(d);
			while (temp2 > 0) {

				int r = temp2 % 10;
				int m = 1;
				for (int j = 0; j < d; j++) {
					m = m * r;
				}
				// System.out.println(m);
				sum = sum + m;
				temp2 = temp2 / 10;
				sum1 = sum;

				// System.out.println(sum1);
			}

			if (i == sum1) {
				System.out.println(sum1);
			}
		}

	}
}