public class TesterClass
{
    /**
     * Default constructor for objects of class TesterClass
     */
    public static void main(String args[])
    {
        DriverLicense yes = new DriverLicense("Hello", "Name");
        CallingCard no = new CallingCard("Hello2", "Name2");
        Billfold billy = new Billfold();
        billy.addCard(yes);
        billy.addCard(no);
        System.out.println(billy.formatCards());
    }
}
