public class Doctor {
    private String name;
    private int id;
    private String specialization;
    private int experience;

    public Doctor(String name, int id, String specialization, int experience) {
        this.name = name;
        this.id = id;
        this.specialization = specialization;
        this.experience = experience;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getSpecialization() {
        return specialization;
    }
    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name = '" + name + '\'' +
                ", id = " + id +
                ", specialization = '" + specialization + '\'' +
                ", experience = " + experience +
                '}';
    }
    
}
