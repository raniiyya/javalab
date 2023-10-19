import java.util.Random;
public class bricks {
    public static void main(String[] args) {
        int numberOfBricks=new Random().nextInt(51)+50;
        int containersCapacity=new Random().nextInt(6)+4;
        int fullContainers=numberOfBricks/containersCapacity;
        int otherBlocks = numberOfBricks % containersCapacity;
        int totalContainers=fullContainers+(otherBlocks > 0 ? 1 : 0);

        System.out.println("We have "+numberOfBricks+" lego bricks");
        System.out.println("The container capacity is "+containersCapacity);
        System.out.println("Numbers of full containers: "+fullContainers);
        System.out.println("Numbers of containers (full and not full): "+totalContainers);
        System.out.println("Numbers of blocks in the not full containers: "+otherBlocks);
    }
}

}
