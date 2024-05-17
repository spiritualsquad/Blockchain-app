import java.security.MessageDigest;

public class StringUtil {
    // this function applies sha256 algorithm to a string
    public static String applySha256(String input){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //applies sha256
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();// makes hash a hexadecimal
            for(int i =0;i<hash.length;i++){
                String hex =Integer.toHexString(0xff&hash[i]);
                if(hex.length()== 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    //hashing algorithm from http://www.baeldung.com/sha-256-hashing-java
}
