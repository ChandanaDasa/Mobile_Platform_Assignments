public class conditional {
    public boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // if, else, if else
    public static void main(String[] args) {
        int a = 6;
        int c = 6;

        if (a < c) {
            System.out.println("ok");
        } else if (a == c) {
            System.out.println("both are equal");
        } else {
            System.out.println("no");
        }

        conditional c1 = new conditional();
        c1.isEligible(19);
    }
}
