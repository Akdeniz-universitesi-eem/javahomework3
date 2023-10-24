package javaHomework.homework3;

public class homework3_4 {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    int abc = a * 100 + b * 10 + c;
                    int cba = c * 100 + b * 10 + a;
                    int ab = a * 10 + b;
                    int ba = b * 10 + a;
                    int bc = b * 10 + c;
                    int cb = c * 10 + b;
                    
                    if (abc < cba && isAsal(abc) && isAsal(cba) && isAsal(ab) && isAsal(ba) && isAsal(bc) && isAsal(cb)) {
                        System.out.println("abc: " + abc);
                    }
                }
            }
        }
    }
    
    public static boolean isAsal(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

