import java.util.Date;
public class expense
{
  float amount;
  int id;
  userinfo userid;
  category categoryid;
  Date date;
  // enter date type date with getter and setter
  //foreign key in DB will be object in model class
  public float getAmount ()
  {
    return (amount);
  }
  public void setAmount (float amount)
  {
    this.amount = amount;
  }
  public int getId()
  {
    return id;
  }
  public void setId(int id)
  {
    this.id = id;
  }
  public userinfo getUserid()
  {
    return userid;
  }
  public void setUserid(int userid)
  {
    this.userid = userid;
  }
   public userinfo getCategoryid()
  {
    return categoryid;
  }
  public void setCategoryid(int categoryid)
  {
    this.categoryid = categoryid;
  }
  public int getDate()
  {
    return date;
  }
  public void setDate(int date)
  {
    this.date = date;
  }
  
  
}

  
