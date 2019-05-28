import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double magnoliiProfit = magnolii * 3.25;
        double zumbuliProfit = zumbuli * 4;
        double roziProfit = rozi * 3.50;
        double kaktusiProfit = kaktusi * 8;
        double profit = magnoliiProfit + zumbuliProfit + roziProfit + kaktusiProfit;
        double profitAfterTax =profit - (profit * 0.05);
        double leftMoney = profitAfterTax - giftPrice;
        double neededMoney = giftPrice - profitAfterTax;
        if (profitAfterTax >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(leftMoney));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(neededMoney));
        }
    }
}
