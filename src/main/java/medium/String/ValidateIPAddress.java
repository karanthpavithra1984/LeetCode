package medium.String;

public class ValidateIPAddress {
    public String validIPAddress(String queryIP) {
        boolean couldBeIpV4 = queryIP.contains(".");
        boolean couldBeIpV6 = queryIP.contains(":");

        if(couldBeIpV4){
            return validateIPV4Address(queryIP);
        }else if(couldBeIpV6){
            return validateIPV6Address(queryIP);
        }else {
            return "Neither";
        }
    }

    private String validateIPV6Address(String queryIP){
        String[] splitIpv6 = queryIP.split("\\:", -1);
        String validCharacters = "abcdedfABCDEF";

        if(splitIpv6.length  > 8) return "Neither";

        for(String ipv6: splitIpv6){
            if(ipv6.length() == 0 || ipv6.length() > 4) return "Neither";

            for(Character character: ipv6.toCharArray()){
                if(!Character.isDigit(character) && !validCharacters.contains(character + "")){
                    return "Neither";
                }
            }
        }

        return "IPv6";
    }

    private String validateIPV4Address(String queryIP){
        String[] splitIpv4 = queryIP.split("\\.", -1);

        if(splitIpv4.length  != 4) return "Neither";
        for(String ipv4: splitIpv4){
            if(ipv4.length() == 0 || ipv4.length() > 3) return "Neither";

            if(ipv4.charAt(0) == '0' && ipv4.length() != 1) return "Neither";

            for(Character character : ipv4.toCharArray()){
                if(!Character.isDigit(character)){
                    return "Neither";
                }
            }

            Integer number = Integer.parseInt(ipv4);

            if(number < 0 || number > 255){
                return "Neither";
            }
        }

        return "IPv4";
    }
}
