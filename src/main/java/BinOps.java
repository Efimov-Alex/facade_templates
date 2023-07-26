public class BinOps {
    public String sum(String a, String b) {
        int sumNumbers = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sumNumbers);
    }

    public String mult(String a, String b) {
        int multNumbers = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(multNumbers);
    }
}