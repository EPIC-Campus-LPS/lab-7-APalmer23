package lab7;

public class Crypto {
	public static String encrypt(String m, int n) {
		String r = "";
		char[] w = m.toLowerCase().toCharArray();
		for (int i=0;i<w.length;i++) {
			int x = (int) w[i];
			if (x>96&&x<123) {
				if ((x+n)<=122)
					w[i]=(char)(x+n);
				else
					w[i]=(char)(((x+n)%123)+97);
			}
			if (m.substring(i,i+1).equals(m.substring(i,i+1).toUpperCase()))
				r+=String.valueOf(w[i]).toUpperCase();
			else
				r+=String.valueOf(w[i]);
		}
		return r;
	}
	public static String decrypt(String m, int n) {
		String r = "";
		char[] w = m.toLowerCase().toCharArray();
		for (int i=0;i<w.length;i++) {
			int x = (int) w[i];
			if (x>96&&x<123) {
				if ((x-n)>=97)
					w[i]=(char)(x-n);
				else
					w[i]=(char)(((x-n))+26);
			}
			if (m.substring(i,i+1).equals(m.substring(i,i+1).toUpperCase()))
				r+=String.valueOf(w[i]).toUpperCase();
			else
				r+=String.valueOf(w[i]);
		}
		return r;
	}
}
