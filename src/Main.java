public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1
        byte a = 120;
        short b = 324;
        int c = 3_456_234;
        long d = -2_456_234L;
        float e = 3.76f;
        double f = 4.56743286789;
        char g = 40;
        boolean h = false;
        System.out.println("переменная первого типа равна " +a);
        System.out.println("переменная второго типа равна " +b);
        System.out.println("переменная третьего типа равна " +c);
        System.out.println("переменная четвертого типа равна " +d);
        System.out.println("переменная пятого типа равна " +e);
        System.out.println("переменная шестого типа равна " +f);
        System.out.println("переменная седьмого типа равна " +g);
        System.out.println("переменная восьмого типа равна " +h);

        // Задача 2
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        System.out.println("Общий вес двух боксеров равен " + (boxer1Weight + boxer2Weight) + " кг");
        System.out.println("Разница между весами боксеров равна " + Math.abs(boxer1Weight - boxer2Weight) + " кг");

        // Задача 3
        byte banana = 5;
        short bananaWeight = 80;
        short milk = 200;
        short milkWeight = 105;
        byte iceCream = 2;
        short iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int totalWeight = banana*bananaWeight+milk*milkWeight+iceCream*iceCreamWeight+egg*eggWeight;
        System.out.println("Вес спорт-завтрака равен " + totalWeight + " грамм");
        float totalWeightK = totalWeight/1_000f;
        System.out.println("Вес спорт-завтрака равен в кг " + totalWeightK);

        // Задание 4
        int lossWeight = 7*1_000;
        short lossOneDayWeight1 = 250;
        short lossOneDayWeight2 = 500;
        int daysLossWeight1 = lossWeight/lossOneDayWeight1;
        int daysLossWeight2 = lossWeight/lossOneDayWeight2;
        int averageLossOneDayWeight = (lossOneDayWeight1+lossOneDayWeight2)/2;
        int averageDaysLossWeight = lossWeight/averageLossOneDayWeight;
        System.out.println("Если каждый день терять по 250 гр, то на похудение уйдет "+daysLossWeight1+" дней");
        System.out.println("Если каждый день терять по 500 гр, то на похудение уйдет "+daysLossWeight2+" дней");
        System.out.println("В среднем на похудение уйдет "+averageDaysLossWeight+" дней");




    }
}