public class Pan {

    private String panNumber;
    private String aadhaarNo;
    private String bankDetails;
    private String investment;

    public Pan(String panNumber, String aadhaarNo, String bankDetails, String investment) {
        this.panNumber = panNumber;
        this.aadhaarNo = aadhaarNo;
        this.bankDetails = bankDetails;
        this.investment = investment;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
