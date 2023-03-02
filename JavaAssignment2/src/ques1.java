abstract class ques1 {
    private String name,headoffAdd,chairmanName;
    private int branchCount;
    private double fdIntRate,personalLoanIntRate,homeLoanIntRate;
    public ques1(String name, String headoffAdd, String chairmanName, int branchCount, double fdIntRate, double personalLoanIntRate, double homeLoanIntRate) {
        this.name = name;
        this.headoffAdd = headoffAdd;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdIntRate = fdIntRate;
        this.personalLoanIntRate = personalLoanIntRate;
        this.homeLoanIntRate = homeLoanIntRate;
    }
    public String getName() {
        return name;
    }
    public String getHeadofficeAdd() {
        return headoffAdd;
    }

    public String getChairmanName() {
        return chairmanName;
    }
    public int getBranchCount() {
        return branchCount;
    }
    public double getFdInterestRate() {
        return fdIntRate;
    }
    public double getPersonalLoanInterestRate() {
        return personalLoanIntRate;
    }
    public double getHomeLoanInterestRate() {
        return homeLoanIntRate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeadofficeAdd(String headoffAdd) {
        this.headoffAdd = headoffAdd;
    }
    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }
    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }
    public void setFdInterestRate(double fdIntRate) {
        this.fdIntRate = fdIntRate;
    }
    public void setPersonalLoanInterestRate(double personalLoanIntRate) {
        this.personalLoanIntRate = personalLoanIntRate;
    }
    public void setHomeLoanInterestRate(double homeLoanIntRate) {
        this.homeLoanIntRate = homeLoanIntRate;
    }
    @Override
    public String toString() {
        return "Bank" +
                "name='" + name + '\n' +
                " headofficeAdd=" + headoffAdd + '\n' +
                "chairmanName=" + chairmanName + '\n' +
                "branchCount=" + branchCount +
                "\n"+" fdInterestRate=" + fdIntRate +"\n"+
                " personalLoanInterestRate=" + personalLoanIntRate +"\n"
                +"homeLoanInterestRate=" + homeLoanIntRate+"\n";
    }
    public static void main(String[] args)
    {
        ICICI icici=new ICICI("ICICI bank","Mumbai","Rohan Arora",50000,5.5,11.5,4.5);
        SBI sbi=new SBI("SBI bank","Delhi","Rohit Sharma",2000,7.5,9.5,5.0);
        System.out.println(icici.toString());
        System.out.println(sbi.toString());
    }
}