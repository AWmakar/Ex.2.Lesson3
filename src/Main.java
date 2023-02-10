public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mKg = 98;
        double hm = 1.87;
        int bmi = service.calculate(mKg, hm);
        System.out.println(bmi);

    }
}