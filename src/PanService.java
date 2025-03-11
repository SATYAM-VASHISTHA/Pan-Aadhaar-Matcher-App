import java.util.HashMap;
import java.util.Map;

public class PanService {

    public static Map<String, Pan> panMap = new HashMap<>();

    static {

        panMap.put("EDZVS123", new Pan("EDZVS123", "1234567890", "Axis Bank", "Real Estates"));
        panMap.put("GSGNR321", new Pan("GSGNR321", "0987654321", "HDFC Bank", "Real Estates"));
        panMap.put("JFNHG231", new Pan("JFNHG231", "1234567890", "KOTAK MAHINDRA Bank", "Real Estates"));
    }

    public Pan getPanByAadhaarNumber(String aadhaarNumber) {

        for (Pan pan: panMap.values()) {
            if (pan.getAadhaarNo().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
