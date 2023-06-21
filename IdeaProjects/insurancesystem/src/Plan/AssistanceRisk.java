package Plan;

public class AssistanceRisk extends Risk{
    @Override
    public float getpremium() {
        return 0.05f;
    }

    @Override
    public float getcoverage() {
        return 0.8f;
    }

    @Override
    public float getCeiling() {
        return 8;
    }
    public String[] assistanceRisksCovered = {
            "Fire",
            "Robbery",
            "Third Party Damage",
            "Vehicle Damage",
            "Driver Damage",
            "Transport",
            "Car Replacement"
    };

}
