public class Words {

    private Words() {}

    public static boolean doesContain(String str1, String str2) {
        int index = str2.indexOf(str1);
        return (index != -1);
    }

    public static void printReverse(String str) {
        int i = str.length()-1;
        while (i!=0) {
            String character = str.substring(i,i+1);
            System.out.print(character + " ");
            i--;
        }
        System.err.println();
    }
}