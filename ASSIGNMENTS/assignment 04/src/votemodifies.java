public class votemodifies {

    public static void main(String[] args) {
       eglible(21,23,45,26,45,12,11);

    }

    private static String eglible(int ...n) {
        int[] m = n;
        for (int i=0;i<m.length;i++) {
            if (m[i] >= 18) {
                System.out.println("Yes you are eglible for voting");
            } else {
                System.out.println("No you are not eglible for voting");
            }
        }
        return null;

    }
}
