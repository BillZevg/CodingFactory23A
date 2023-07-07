package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10,9,8.....,1
 * αστεράκι(a) απο τη 1η γραμμή
 */
public class Stars10Desc {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

          for (int j = 1; j <= 10; j--){
              System.out.println("*");
          }
            System.out.println();
        }
   }
}






