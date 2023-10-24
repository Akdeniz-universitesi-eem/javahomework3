package javaHomework.homework3;

public class homework3_5 {
    public static void main(String[] args) {
        int num = 17; // Örnek olarak 17 sayısını kullanabilirsiniz.
        if (isPrimeX(num)) {
            System.out.println(num + " ve ardışık basamakların toplamı asal sayılardır.");
        } else {
            System.out.println(num + " veya ardışık basamakların toplamı asal değildir.");
        }
    }

    // Verilen sayının asal olup olmadığını kontrol eden metot
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Ardışık basamakların toplamını hesaplayan metot
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Verilen sayının asal olup olmadığını ve ardışık basamakların toplamının asal olup olmadığını kontrol eden metot
    public static boolean isPrimeX(int num) {
        if (num <= 1) {
            return false;
        }

        while (num >= 10) {
            if (!isPrime(num)) {
                return false;
            }
            num = sumOfDigits(num);
        }

        return isPrime(num);
    }
}

