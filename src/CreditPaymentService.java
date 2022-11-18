public class CreditPaymentService {
    public static int calculate(int creditRub, int creditYears) {
        double rateMonth = 9.99 * 0.01 / 12; //считаем месячную ставку по кредиту
        double locDouble = Math.pow(1 + rateMonth, creditYears * 12);
        locDouble = (rateMonth * locDouble) / (locDouble - 1); //шаманство с формулой аннуитетного платежа
        int payMonth = (int) ((int) creditRub * locDouble); //вычисляем ежемесячный платеж
        return (payMonth);
    }
}
