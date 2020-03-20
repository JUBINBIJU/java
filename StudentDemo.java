
interface StudentBaseInt
{
    String getFamilyName();
    String getOtherNames();
    int getRank();
    int FRESHMAN=1,SOPHOMORE=2,JUNIOR=3,SENIOR=4;
    void setFamilyName( String o );
    void setOtherNames( String o );
    void setRank( int o );
}

class StudentBase implements StudentBaseInt
{
    private String familyName,otherNames;
    private int rank;
    StudentBase(String a,String b,int c)
    {
        setFamilyName(a);
        setOtherNames(b);
        setRank(c);
    }
    public String getFamilyName()
    {
        return familyName;
    }
    public String getOtherNames()
    {
        return otherNames;
    }
    public int getRank()
    {
        return rank;
    }
    public void setFamilyName(String s)
    {
        familyName=s;
    }
    public void setOtherNames(String s)
    {
        otherNames=s;
    }
    public void setRank(int o)
    {
        rank=o;
    }
}

class StudentBaseMaster
{
    public static StudentBaseInt create( String a, String b, int c )
    {
        StudentBaseInt r=new StudentBase(a,b,c);
        return r;
    }
}

class StudentDemo
{
    public static void main(String args[])
    {
        StudentBaseInt s= StudentBaseMaster.create("Stark","Tony",4);
        System.out.println(s.getFamilyName());
        System.out.println(s.getOtherNames());
        System.out.println(s.getRank()+"\n");
        s.setOtherNames("Arya");
        s.setRank(2);
        System.out.println(s.getFamilyName());
        System.out.println(s.getOtherNames());
        System.out.println(s.getRank());
    }
}