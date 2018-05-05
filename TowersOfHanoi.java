/*
Implementing Towers of Hanoi using recursion
*/

public class TowersOfHanoi {
 public static void move(int n, String source, String buffer, String destination) {
  if (n <= 0) return;
  move(n - 1, source, destination, buffer);
  System.out.println("Move Disk" + n + " from " + source + " to " + destination);
  move(n - 1, buffer, source, destination);
 }
 public static void main(String[] args) {
  int n = 3;
  System.out.println("There are " + n + " disks at source");
  move(n, "source", "Auxilary", "Destination");
 }
}
