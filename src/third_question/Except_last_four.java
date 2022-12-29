package third_question;

public class Except_last_four {
	public static String maskExceptLastFour(String s) {
		  
		  if (s.length() < 4) {
		    return s;
		  }
		  String mask = new String(new char[s.length()]).replace("\0", "X");
          mask = mask.substring(0, mask.length() - 4) + s.substring(s.length() - 4);

		  return mask;
		}
}
