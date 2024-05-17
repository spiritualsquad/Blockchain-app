public class StartChain {
    public static void main(String[] args) {
        //tests
        Block bitcoinBlock = new Block("I wish i had bitcoin","69");
        System.out.println("First hash:"+ bitcoinBlock.hash);
        Block spiritBlock = new Block("This is a spirit lol",bitcoinBlock.hash);
        System.out.println("Second hash"+spiritBlock.hash);
        Block whateverBlock = new Block("This is a block",spiritBlock.hash);
        System.out.println("Third has"+whateverBlock.hash);
    }
}
