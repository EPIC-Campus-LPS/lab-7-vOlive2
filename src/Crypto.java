public class Crypto {	
	public static String encrypt(String mes, int num) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String newMes = "";
		mes = mes.toLowerCase();
		for(int i = 0; i < mes.length(); i++) {
			int index = letters.indexOf(mes.substring(i, i+1));
			if(index == -1) {
				newMes += mes.substring(i, i+1);
			} else {
				int ex =  (index+num) % 26;
				newMes += letters.substring(ex, ex + 1);
			}
		}
		return newMes;
	}
	
	public static String decrypt(String mes, int num) {
		String letters = "zyxwvutsrqponmlkjihgfedcba";
		String newMes = "";
		//num--;
		mes = mes.toLowerCase();
		for(int i = 0; i < mes.length(); i++) {
			int index = letters.indexOf(mes.substring(i, i+1));
			if(index == -1) {
				newMes += mes.substring(i, i+1);
			} else {
				int ex =  (index+num) % 26;
				newMes += letters.substring(ex, ex + 1);
			}
		}
		return newMes;
	}
}
