package javaHomework.homework2;
import java.util.Scanner;

public class homework2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a height:");
        int height= scanner.nextInt();

        for(int row=1; row<=height; row++){
            for(int space=1; space<=height-row; space++){
                System.out.print(" ");
            }
            for (int star=1; star<=2*row-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=height-1; row>0; row--){
            for(int space=1; space<=height-row; space++){
                System.out.print(" ");
            }
            for (int star=1; star<=2*row-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

