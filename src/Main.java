public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 98; // Килограмм ;
        double h = 1.87; // Метров ;
        int bmi = service.calculate(m, h);
        System.out.println((bmi) + " индекс массы тела");

    }
}