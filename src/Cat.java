public class Cat 
{
    // Property | Attribut | Field
    public String name;
    public String furColor;
    public int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    public String tellYourAttributes(String checkStr) {
        switch (checkStr) {
            case "#name":
                return this.name;
            case "#color":
                return this.furColor;
            case "#age":
                //return String.valueOf(this.age);
                return Integer.toString(this.age);
            default:
                return "ERROR";
        }
    }

}
