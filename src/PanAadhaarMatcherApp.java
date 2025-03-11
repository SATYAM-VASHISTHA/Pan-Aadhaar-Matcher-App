import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PanAadhaarMatcherApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        System.out.print("Enter the Aadhar Number : ");
        String aadhaarNumber = sc.nextLine();

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);

        if (aadhaar != null && pan != null) {
            System.out.println("Aadhaar Details : "+ aadhaar);
            System.out.println("Pan Details : "+ pan);
        }
        else {
            System.out.println("No match Found");
        }
    }
}