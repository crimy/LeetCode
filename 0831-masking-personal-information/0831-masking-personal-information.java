class Solution {
    public static final String EMAIL_SYMBOL = "@";
    public String maskPII(String s) {
        if(s.contains(EMAIL_SYMBOL)) {
            s = maskAsEmail(s);
        } else {
            s = maskAsPhoneNumber(s);
        }
        return s;
    }
    public String maskAsEmail(String s) {
        String[] email = s.split(EMAIL_SYMBOL);
        String name = new StringBuilder()
            .append(email[0].charAt(0))
            .append("*****")
            .append(email[0].charAt(email[0].length()-1))
            .toString()
            .toLowerCase();
        String domain = email[1].toLowerCase();
        
        return name+EMAIL_SYMBOL+domain;
    }
    public String maskAsPhoneNumber(String s) {
        s = s.replaceAll("[^0-9]", "");
        
        int length = s.length();
        String countryCode = "";
        if(length > 10) {
            countryCode = "+" + "*".repeat(length-10) + "-";
            
        }
        
        return new StringBuilder().append(countryCode)
            .append("***-***-")
            .append(s.substring(length-4))
            .toString();
    }
}