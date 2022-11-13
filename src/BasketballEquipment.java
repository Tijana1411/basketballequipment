import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            int fee = Integer.parseInt(scanner.nextLine());
            double yearFee = (double) fee;

            double sneakers = yearFee - (yearFee * 40 / 100);
            double outfit = sneakers - (sneakers * 20 / 100);
            double ball = outfit / 4;
            double accessories = ball / 5;
            double sum = fee + sneakers + outfit + ball + accessories;

            System.out.printf("%.2f", sum);
        }
    }

