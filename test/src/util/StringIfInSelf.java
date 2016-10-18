package util;

public class StringIfInSelf {
	public static void main(String[] args) {
		System.out.println(isExist("qwera"));
	}

	/**
	 * 判断字符串里面是否有相同的字符
	 * @param tmp
	 * @return 都不相同返回true
	 */
	public static boolean isExist(String tmp) {
		boolean isOk = true;
		char[] tmpchar = tmp.toCharArray();
		for (int i = 0; i < tmpchar.length; i++) {
			for (int j = i + 1; j < tmpchar.length; j++) {
				if (tmpchar[i] == tmpchar[j]) {
					isOk = false;
					return isOk;
				} else {
					isOk = true;
				}
			}
		}
		return isOk;
	}

}