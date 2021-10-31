public class Customer
{
    private String name;
    private String age;
    private String gender;
    private String mobileNumber;
    private String email;
    private String id;
    private String password;

    public String getAge()
    {
        return age;
    }
    protected void setAge(String age)
    {
        this.age = age;
    }
    public String getGender()
    {
        return gender;
    }
    protected void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getMobileNumber()
    {
        return mobileNumber;
    }
    protected void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getName()
    {
        return name;
    }
    protected void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getId()
    {
        return id;
    }
    protected void setId(String id)
    {
        this.id = id;
    }
    public String getPassword()
    {
        return password;
    }
    protected void setPassword(String password)
    {
        this.password = password;
    }

}