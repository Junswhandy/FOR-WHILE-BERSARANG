//while bersarang
package latihan;
/**
 *
 * @junswhady
 */
public class while_bersarang {
    public static void main(String[] args) {
    int i = 2, j = 0;
    //while pertama
    while (i < 8) {
        //while kedua
      while (j < 1) {
        System.out.print(i + " ");
        j++;
      }
      int a = i + 1;
      //while ketiga
      while (j < i - 1) {
        System.out.print(a + " ");
        j++;
        a++;
      }
      j = 0;
      System.out.println();
      i++;
    }
  }
}