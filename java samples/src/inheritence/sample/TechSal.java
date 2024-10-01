package inheritence.sample;

public class TechSal extends EmpSal {
    float splAllowance;

    @Override // annotation to ensure that the signature of the local method is same as that
              // of the parent (not mandatory)
    void getEmpSal() {
        System.out.println(basic + allowance + splAllowance);
    }

}
