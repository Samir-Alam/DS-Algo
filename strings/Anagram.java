package strings;

public class Anagram {

	public static void main(String[] args) {
		
		String a = "moon";
		String b = "Mono";
		
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
		
			for(int i = 0; i<a.length(); i++) {
				char c = a.charAt(i);	
				isAnagram = false;
				for(int j = 0; j<b.length(); j++) {
					if(b.charAt(j) == c && !visited[j]) {
						visited[j] = true;
						isAnagram = true;
						break;
					}
				
				}
				if(!isAnagram) {
					break;
				}
				
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
//		if (a.length() != b.length()) {			_ANOTHER METHOD_
//            return false;
//        }
//        a = a.toLowerCase();
//        b = b.toLowerCase();
//        int sum = 0;
//        for (char c = 'a'; c <= 'z'; c++) {
//            for (int i=0; i<a.length(); i++) {
//                if (a.charAt(i) == c) {
//                    sum++;
//                }
//                if (b.charAt(i) == c) {
//                    sum--;
//                }
//            }
//            if (sum != 0) {
//                return false;
//            }
//        }
//        return true;

	}

}
