import java.util.Scanner;

public class display_20_numbers_fisrt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int count = 1;
        boolean check = false;
        if(number < 1){
            System.out.println("Invalid number");
        } else if (number == 1) {
            System.out.println('2');
        }
        else {
            System.out.println("20 số nguyên tố đầu tiên là: ");
            System.out.println('2');
            int i = 3;
            while (count < number){
                for (int j = 2; j < i; j++){
                    if(i % j == 0){
                        check = false;
                    }
                }
                if(check){
                    count++;
                    System.out.println(i);
                }
                i++;
                check = true;
            }
        }
    }
}
