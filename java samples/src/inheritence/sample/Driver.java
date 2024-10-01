package inheritence.sample;

public class Driver {
    public static void main(String[] args) {
        EmpSal empSal = new EmpSal();
        empSal.basic = 1000f;
        empSal.allowance = 100f;
        empSal.getEmpSal();

        TechSal techSal = new TechSal();
        techSal.basic = 1000f;
        techSal.allowance = 90f;
        techSal.splAllowance = 250f;
        techSal.getEmpSal();
    }
}
