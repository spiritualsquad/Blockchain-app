import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class StartChain {
    public static ArrayList<Block> blockchain =new ArrayList<Block>();
    public static void main(String[] args) {
        //storing blocks into array list
        blockchain.add(new Block("I wish i had bitcoin","69"));
        blockchain.add(new Block("This is a spirit lol",blockchain.getLast().hash));
        blockchain.add(new Block("This is a block",blockchain.getLast().hash));

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockchainJson);

    }
}
