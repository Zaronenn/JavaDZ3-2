public class BmiService {

    public int calculate (int BodyweightKg, double HeightSm ){

        double bmiIndex = BodyweightKg / (HeightSm * HeightSm);

        return (int) bmiIndex;
    }
}
