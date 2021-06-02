public class Cat 
{
    // Property | Attribut | Field
    public String name;
    public String furColor;
    public int age;
    public boolean isFemale;

    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String tellYourAttributes(String checkStr) {
        switch (checkStr) {
            case "#name":
                return this.name;
            case "#color":
                return this.furColor;
            case "#age":
                return this.checkCompliance();
            default:
                return "ERROR";
        }
    }

    public String checkCompliance() {
        if (isFemale) {
            return "This is an inappropriate question!";
        } else {
            return Integer.toString(this.age);
        }
    }



}
