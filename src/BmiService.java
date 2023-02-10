public class BmiService {
    public int calculate(int mKg, double hm) {
        int result;
        result = (int) (mKg / (hm*hm));
        return result;

    }
}
