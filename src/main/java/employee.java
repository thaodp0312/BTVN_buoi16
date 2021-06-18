public class employee {
    int ID;
    String name;
    int age;
    String address;
    String mobile;

    public employee(int ID, String name, int age, String address, String mobile) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", name=" + name  +
                ", age=" + age +
                ", address=" + address  +
                ", mobile=" + mobile  ;

    }
}

