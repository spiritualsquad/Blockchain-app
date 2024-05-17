import java.util.Date;
public class Block {
    // instance variable for a simple block
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;
    //block constructor
    public Block (String data,String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash =calculateHash();
    }
    public String calculateHash(){
        String calculatedHash = StringUtil.applySha256(previousHash +Long.toString(timeStamp) +Integer.toString(nonce)+data);
        return calculatedHash;
    }
    //lets do some mining
    public void mineBlock(int level){
        String target = new String(new char[level]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring( 0, level).equals(target)) {
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }
}
