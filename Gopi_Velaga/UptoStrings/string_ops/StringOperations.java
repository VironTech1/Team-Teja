package string_ops;

class StringOperations {
	
	String str = "Hello World";
	
	
	String reverse(String st) {
		String str1 = "";
		for(int i = st.length(); i>0; i--)
			str1 += st.charAt(i-1);
		return str1;
	}
	
	boolean palindrome(String st) {
		String str1 = reverse(st);
		//System.out.println(str1);
		if(str1.equals(st))
			return true;
		return false;
	}
	
	boolean search(String string, String substring) {
		if(string.indexOf(substring) != -1)
			return true;
		return false;
	}
	
	Object charAtmethod(String str, int index) {
		if(index >= str.length() || index < 0)
			return false;
		else
			return str.charAt(index);
	}
	
	String[] splitNames(String str) {
		String[] names = str.split(" ");
		return names;
	}
	
	boolean checkPassword(String password) {
        String regex = "^(?=.*[!@#$%^&*(),.?\":{}|<>])(?=.*[A-Z])(?=.*[0-9]).+$";
        return password.matches(regex);
    }

}
