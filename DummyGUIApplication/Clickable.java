interface Clickable
{
    public void click();
}

interface Resizable
{
    public void resize(int newWidth, int newHeight);
    public void resize(int multiplier);
}

abstract class AbstractButton implements Clickable, Resizable
{
    protected String title;
    protected int width;
    protected int height;
    protected boolean isClicked;
    
    public AbstractButton(String title, int width, int height)
    {
        this.title = title;
        this.width = width;
        this.height = height;
        isClicked = false;
    }
    
    String getTitle()
    {
        return this.title;
    }
    
    int getWidth()
    {
        return this.width;
    }
    
    int getHeight()
    {
        return this.height;
    }
    
    boolean getIsClicked()
    {
        return this.isClicked;
    }
    
    void setTitle(String title)
    {
        this.title = title;
    }
    
    void setWidth()
    {
        this.width = width;
    }
    
    void setHeight()
    {
        this.height = height;
    }
    
    void setIsClicked(boolean isClicked)
    {
        this.isClicked = isClicked;
    }
}

class Checkbox implements Clickable
{
    private boolean isChecked;
    private String text;
    
    public Checkbox(String text)
    {
        isChecked = false;
        this.text = text;
    }
    
    @Override
    public void click()
    {
        isChecked = !isChecked;
        
        if (isChecked)
        {
            System.out.println("Checkbox is checked");
        }
        else 
        {
            System.out.println("Checkbox is unchecked");
        }
    }
    
    @Override
    public String toString()
    {
        String res = "Checkbox (" + this.text + " - Checked = " + isChecked + ")";
        return res;
    }
}

class NormalButton extends AbstractButton
{
    public NormalButton(String title, int width, int height)
    {
        super(title, width, height);
    }
    
    @Override
    public void click()
    {
        super.setIsClicked(!super.getIsClicked());
        
        if (super.getIsClicked())
        {
            System.out.println("Button is clicked");
        }
        else 
        {
            System.out.println("Button is not clicked anymore");
        }
    }
    
    public void resize(int newWidth, int newHeight)
    {
        this.width = newWidth;
        this.height = newHeight;
    }
    
    public void resize(int multiplier)
    {
        this.width *= multiplier;
        this.height *= multiplier;
    }
    
    @Override
    public String toString()
    {
        String res = "NormalButton ((" + this.width + "px, " + this.height + "px) - Clicked = " + super.getIsClicked() + ")";
        return res;
    }
}
