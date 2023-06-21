package Plan;

public class ObligatoryRisk  extends Risk{
    @Override
    public float getpremium() {
        return 0.01f;
    }

    @Override
    public float getcoverage() {
        return 0.6f;
    }

    @Override
    public float getCeiling() {
        return 4;
    }
    public String[] obligatoryRisksCovered = {
            "Third Party Damage"
    };
}
