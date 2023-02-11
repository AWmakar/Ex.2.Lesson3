public class BmiService {
    public int calculate(int m, double h) {
        int result;
        result = (int) (m / (h*h));
        return result;

    }
}
