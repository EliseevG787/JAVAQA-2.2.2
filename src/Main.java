public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 57;
        float height = 1.88f;
        float index = service.calculate(weight, height);
        System.out.println(index);
    }
}
