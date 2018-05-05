/*
Given array of strings ,
Arrange the Strings in way that all anagrams come together
*/

import java.util.*;
public class MyClass {

 static ArrayList < Integer > primes = new ArrayList < Integer > ();
 static HashMap < Integer, ArrayList < String >> map = new HashMap < Integer, ArrayList < String >> ();

 public static void main(String args[]) {
  fillprime(26);
  ArrayList < String > input = new ArrayList < String > ();
  input.add("abc");
  input.add("bac");
  input.add("god");
  input.add("dog");
  input.add("abbbbcc");
  input.add("bbbbac");
  input.add("ghod");
  input.add("dollg");
  input.add("abbccbb");
  input.add("bac");
  input.add("good");
  input.add("dgo");
  input.add("cat");
  input.add("act");
  input.add("tac");
  for (String s: input) solve(s);
  for (Map.Entry < Integer, ArrayList < String >> ob: map.entrySet()) {
   System.out.println(ob.getValue());
  }

 }

 public static void solve(String s) {
  int key = calculate(s);
  if (map.containsKey(key)) {
   map.get(key).add(s);
  } else {
   ArrayList < String > temp = new ArrayList < String > ();
   temp.add(s);
   map.put(key, temp);
  }
 }

 public static int calculate(String s) {
  int p = 1;
  for (int i = 0; i <= s.length() - 1; i++) {
   p = p * primes.get(s.charAt(i) - 'a');
  }
  return p;
 }

 public static void fillprime(int N) {
  int count = 0;
  int num = 2;
  while (count != N) {
   boolean prime = true;
   for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
     prime = false;
     break;
    }
   }
   if (prime) {
    count++;
    primes.add(num);
   }
   num++;
  }
 }
}



Language Version: JDK 9.0 .1
