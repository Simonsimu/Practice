public class Compress{
 public static void main(String args[]) {
  System.out.println(compress("abbbbbbc"));
  System.out.println(compress("abbbbbbcccc"));
  System.out.println(compress("abbbbbbc"));
  System.out.println(compress("abc"));
 }
 public static String compress(String str) {
  if (str.length() <= 0) return str;
  int i = 1;
  while (i < str.length() && str.charAt(0) == str.charAt(i)) {
   i++;
  }
  String count = Integer.toString(i);
  return str.substring(0, 1) + count + compress(str.substring(i));
 }
}
