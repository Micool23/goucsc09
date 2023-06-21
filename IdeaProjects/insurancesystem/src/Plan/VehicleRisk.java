package Plan;

public class VehicleRisk extends Risk {


    @Override
    public float getpremium() {
        return 0.05f;
    }

    @Override
    public float getcoverage() {
        return 0.9f;
    }

    @Override
    public float getCeiling() {
        return 6;
    }

    public String[] vehicleRisksCovered = {
            "Vehicle Damage"
    };
}
