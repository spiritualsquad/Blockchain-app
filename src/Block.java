import java.util.Date;
public class Block {
    // instance variable for a simple block
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    //block constructor
    public Block (String data,String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash =calculateHash();
    }
    public String calculateHash(){
        String calculatedHash = StringUtil.applySha256(previousHash +Long.toString(timeStamp)+data);
        return calculatedHash;
    }
}
