package Plan;

public class DriverRisk extends Risk {
    @Override
    public float getpremium() {
        return 0.05f;
    }

    @Override
    public float getcoverage() {
        return 0.7f;
    }

    @Override
    public float getCeiling() {
        return 6;
    }

    public String[] driverRisksCovered = {
            "Driver Damage"
    };
}