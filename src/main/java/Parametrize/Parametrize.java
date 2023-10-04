package Parametrize;

public class Parametrize {
    public static boolean isPalindrom(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
