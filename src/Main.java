public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        int BodyweightKg = 98; // Масса тела в кг
        double HeightSm = 1.84; // Рост в см.
        int bmiIndex = service.calculate(BodyweightKg, HeightSm);


        System.out.println("Индекс " + bmiIndex);

        System.out.println();

        System.out.println("93 кг 1.73 см ");
        System.out.println(service.calculate(93, 1.73));

        System.out.println();

        System.out.println("50 кг 1.50 см ");
        System.out.println(service.calculate(50, 1.50));
    }

}
