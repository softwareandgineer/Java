public class BlockTest {
    public static void main(String[] args)
    {
        Block block1 = new Block(3.0, 3.0, 3.0);
        Block cube1 = new Block(3.0);

        if(block1.sameVolume(cube1))
        {
            System.out.println("same volume" + block1.getVolume());
        }
        else
        {
            System.out.println("diff volume" + block1.getVolume());
            System.out.println("cube's volume = " + cube1.getVolume());
        }

        if(block1.sameVolume(1.0,2.0,3.0))
        {
            System.out.println("volume is the same as 1x2x3");
        }
        else
        {
            System.out.println("volume is not the same as 1x2x3");
        }

        Block block2 = block1.cloneBlock();
        block2.print();
        block1.print();
    }
}
