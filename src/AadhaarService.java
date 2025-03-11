import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    public static Map<String, Aadhaar> aadhaarMap = new HashMap<>();
    static {
        aadhaarMap.put("1234567890", new Aadhaar("1234567890", "Satyam", "Mr. Nonidh", "Hapur"));
        aadhaarMap.put("0987654321", new Aadhaar("0987654321", "Rohit", "Mr. Anil", "Delhi"));
        aadhaarMap.put("3456789012", new Aadhaar("3456789012", "Sam", "Mr. Kush", "Goa"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber) {
        return aadhaarMap.get(aadhaarNumber);
    }
}
