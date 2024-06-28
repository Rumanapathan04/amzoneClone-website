package amazonClone;

public class User 
{
	 private String or_num,or_name;
	    private int or_price;
	    
	    public User(String or_num,String or_name,int or_price)
	    {
	        this.or_num = or_num;
	        this.or_name = or_name;
	        this.or_price = or_price;
	    }
	    public String getNum()
	    {
	    return or_num;
	    }
	    public String getName()
	    {
	    return or_name;
	    }
	    public int getPrice()
	    {
	    return or_price;
	    }
}
