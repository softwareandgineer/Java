public class Block {
    private double x,y,z;

    public Block(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Block(double x)
    {
        this.x = x;
        this.y = x;
        this.z = x;
    }

    public void print()
    {
        System.out.println("width= " + x + ",length= " + y + ",height= " + z);
        System.out.println("Total volume = " + getVolume());
    }

    public double getVolume()
    {
        return x * y * z;
    }

    public boolean sameVolume(double x, double y, double z)
    {
        if (Math.abs(this.getVolume() - x * y * z) < 1.0e-5)
            return true;
        else
            return false;
    }

    public boolean sameVolume(Block block)
    {
        if (Math.abs(this.getVolume() - block.getVolume()) < 1.0e-5)
            return true;
        else
            return false;
    }

    public Block cloneBlock() {
        Block block = new Block(this.x, this.y, this.z);
        return block;
    }
}
