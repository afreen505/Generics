package generics;

public class MaximumCheck<T extends Comparable<T>> {

    T a1, a2, a3;

    public MaximumCheck(T a1, T a2, T a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value using generics");
        Integer a1 = 20, a2 = 8, a3 = 12;
        System.out.println("The Maximum between three integers is : " + maxOfValues(a1, a2, a3));
        Float f1 = 1.5f, f2 = 8.2f, f3 = 6.4f;
        System.out.println("The Maximum between three float is : " + maxOfValues(f1, f2, f3));
        String s1 = "abc", s2 = "pqr", s3 = "xyz";
        System.out.println("The Maximum between three String is : " + maxOfValues(s1, s2, s3));
    }
}