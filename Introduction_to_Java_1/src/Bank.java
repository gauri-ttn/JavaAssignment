//Question6)
//Implement a banking system using java. Create 3 sub class of Bank : SBI, BOI, ICICI Classes should have
//attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate,
//personalLoanInterestRate, homeLoanInterestRate. All 3 should have following methods: 1. add getters and
//setters for the fields 2. print details of every bank (override toString).

class Bank {
    protected String name;
    protected String headOfficeAddress;
    protected String chairmanName;
    protected int branchCount;
    protected double fdInterestRate;
    protected double personalLoanInterestRate;
    protected double homeLoanInterestRate;

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHeadOfficeAddress() { return headOfficeAddress; }
    public void setHeadOfficeAddress(String headOfficeAddress) { this.headOfficeAddress = headOfficeAddress; }

    public String getChairmanName() { return chairmanName; }
    public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }

    public int getBranchCount() { return branchCount; }
    public void setBranchCount(int branchCount) { this.branchCount = branchCount; }

    public double getFdInterestRate() { return fdInterestRate; }
    public void setFdInterestRate(double fdInterestRate) { this.fdInterestRate = fdInterestRate; }

    public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) { this.personalLoanInterestRate = personalLoanInterestRate; }

    public double getHomeLoanInterestRate() { return homeLoanInterestRate; }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) { this.homeLoanInterestRate = homeLoanInterestRate; }

    @Override
    public String toString() {
        return "Bank Name: " + name + "\nHead Office: " + headOfficeAddress + "\nChairman: " + chairmanName +
                "\nBranches: " + branchCount + "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%";
    }
}




