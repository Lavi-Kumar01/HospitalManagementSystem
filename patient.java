public class patient {
    private String name;
    private int id;
    private String disease;
    private int age;

    public patient(String name, int id, String disease, int age) {
        this.name = name;
        this.id = id;
        this.disease = disease;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDisease() {
        return disease;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", disease='" + disease + '\'' +
                ", age=" + age +
                '}';
    }

}
