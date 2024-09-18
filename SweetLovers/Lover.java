interface Lover
{
    void setLover(Lover lover);
    void receiveLove();
    void giveLove();
}

abstract class Friend implements Lover 
{
    private char gender;
    private boolean isLoved;
    
    public Friend(char gender)
    {
        this.gender = gender;
        isLoved = false;
    }
    
    public void receiveLove()
    {
        isLoved = true;
    }
    
    @Override
    public String toString()
    {
        String res = this.gender + " - " + this.isLoved;
        return res;
    }
}

interface BoyFriend
{
    void giveFlowers(int flowerCount);
}

interface GirlFriend
{
    void receiveFlowers(int flowerCount);
}

class MaleFriend extends Friend implements BoyFriend
{
    private int flowersGiven;
    private FemaleFriend lover;
    
    public MaleFriend()
    {
        super('M');
        this.flowersGiven = 0;
    }
    
    public void setLover(Lover lover)
    {
        this.lover = (FemaleFriend) lover;
    }
    
    public void giveLove()
    {
        System.out.println("mwamwa");
        lover.receiveLove();
    }
    
    public void giveFlowers(int flowerCount)
    {
        this.flowersGiven += flowerCount;
        lover.receiveFlowers(flowerCount);
    }
}

class FemaleFriend extends Friend implements GirlFriend
{
    private int flowersReceived;
    private MaleFriend lover;
    
    public FemaleFriend()
    {
        super('F');
        this.flowersReceived = 0;
    }
    
    public void setLover(Lover lover)
    {
        this.lover = (MaleFriend) lover;
    }
    
    public void giveLove()
    {
        System.out.println("tsuptsup");
        lover.receiveLove();
    }
    
    public void receiveFlowers(int flowerCount)
    {
        flowersReceived += flowerCount;
    }
}
