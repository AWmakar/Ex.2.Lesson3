public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98; // Килограмм ;
        double height = 1.87; // Метров ;
        int bmi = service.calculate(weight, height);
        System.out.println((bmi) + " индекс массы тела");

    }
}