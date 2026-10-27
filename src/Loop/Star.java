package Loop;

import java.util.Scanner;

public class Star {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0 ; i <=n; i++){//we are print the number of lines here
            for (int j =1 ; j<=n-i; j++)//we are printing the spaces which is n-i
                System.out.print(" ");
            for (int j=1 ; j<= 2*i - 1; j++)// we are printing the stars here
                System.out.print("*");
            System.out.println();
        }
    }
}
