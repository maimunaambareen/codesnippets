
class Solution {
 public int solution(int N) {
  String n = java.lang.Integer.toBinaryString(N);
  int size = 0;
  int firstOne = 0;
  int secondOne = 0;

  for (int i = 0; i < n.length(); i++) {

   if (n.charAt(i) == '1') {
    firstOne = i;
    secondOne = 0;
    for (int j = i + 1; j < n.length(); j++) {

     if (n.charAt(j) == '1') {
      secondOne = j;
      break;
     }
    }
    if (secondOne != 0) {
     if (size == 0) {
      size = secondOne - firstOne - 1;
     } else if (size < secondOne - firstOne) {
      size = secondOne - firstOne - 1;
     }
    }
   }

  }
  return size;

 }
}