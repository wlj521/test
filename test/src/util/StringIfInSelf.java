package util;

public class StringIfInSelf {
	public static void main(String[] args) {
		System.out.println(isExist("qwera"));
	}

	/**
	 * �ж��ַ��������Ƿ�����ͬ���ַ�
	 * @param tmp
	 * @return
	 */
	public static boolean isExist(String tmp) {
		boolean isOk = false;
		char[] tmpchar = tmp.toCharArray();
		for (int i = 0; i < tmpchar.length; i++) {
			for (int j = i + 1; j < tmpchar.length; j++) {
				if (tmpchar[i] == tmpchar[j]) {
					isOk = true;
					return isOk;
				} else {
					isOk = false;
				}
			}
		}
		return isOk;
	}

}