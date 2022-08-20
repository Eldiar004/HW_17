package Shablon;

public class Farm {
    private String address;
    private String ownerName;

    public Farm(String address, String ownerName) {
        this.address = address;
        this.ownerName = ownerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public String getAddress() {
        return address;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
