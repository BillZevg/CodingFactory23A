package gr.aueb.cf.ch4;

public class AllEmojisApp {
    public static void main(String[] args) {
        int emojiStart = 0xF600;
        int emjiEnd = 0x1F64F;
        int i = 0;

        i = emojiStart;
        while (i <= emjiEnd) {
            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i++;
            if (i % 16 == 0) System.out.println();
        }
    }
}
