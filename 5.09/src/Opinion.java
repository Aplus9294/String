public class Opinion { // ������
	public static void main(String args[]) { // ������
		String s1 = new String("abc"); // �����ַ�������s1
		String s2 = new String("ABC"); // �����ַ�������s2
		String s3 = new String("abc"); // �����ַ�������s3
		boolean b1 = s1.equals(s2); // ʹ��equals()�����Ƚ�s1��s2
		// ʹ��equalsIgnoreCase()�����Ƚ�s1��s2
		boolean b2 = s1.equalsIgnoreCase(s2);
		boolean b3 = s1.equals(s3);
		System.out.println(s1 + " equals " + s2 + " :" + b1); // �����Ϣ
		System.out.println(s1 + " equalsIgnoreCase " + s2 + " :" + b2);
		System.out.println(s1 + " equals " + s3 + " :" + b3);
	}
}
