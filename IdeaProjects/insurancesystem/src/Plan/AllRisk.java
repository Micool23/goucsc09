package Plan;

public class AllRisk extends Risk{


    @Override
    public float getpremium() {
        return 0.075f;
    }

    @Override
    public float getcoverage() {
        return 1f;
    }

    @Override
    public float getCeiling() {
        return 10;
    }

    public String[] allRisksCovered = {
            "Fire",
            "Robbery",
            "Third Party Damage",
            "Vehicle Damage",
            "Transport",
            "Car Repalcement"
    };

}
