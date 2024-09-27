public class coustomclases{
    public static void main(String[] args) {
        // Create an instance of InternalData
        InternalData internalData = new InternalData();
        internalData.InternalData = "keep it secret"; // Assigning value to InternalData attribute

        // Pass internalData object to Data constructor
        Data data1 = new Data("1VA21Cd045", "sachinba.20@gmail.com", internalData);
        data1.setName("Sachin");
        System.out.println(data1.getName());

        // You can also access internalData's method
        internalData.ReadInternalData(); // This will print "keep it secret"
    }
}

class InternalData {
    String InternalData;

    public void ReadInternalData() {
        System.out.println(InternalData);
    }
}

class Data {
    private String name;
    private Integer id;

    private String USN;
    private String email;

    private InternalData internal; // Using other class as a data type

    Data(String USN, String email, InternalData internal) {
        this.USN = USN;
        this.email = email;
        this.internal = internal;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }
}
