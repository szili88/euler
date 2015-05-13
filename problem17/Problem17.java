package problem17;

public class Problem17 {
    public static void main(String[] args) {
        System.out.println(("onethousand".length())
                + (10 * 10 * "onetwothreefourfivesixseveneightnine".length())
                + (900 * "hundred".length() + (891 * "and".length()))
                + (10 * 10 * "twentythirtyfortyfiftysixtyseventyeightyninety".length())
                + (10 * "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen".length())
                + (9 * 10 * "onetwothreefourfivesixseveneightnine".length()));
    }
}