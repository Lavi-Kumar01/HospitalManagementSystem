// package project;
// import project.Doctor;
// import project.patient;
public class Appointment {
    private patient patient;
    private Doctor doctor;
    private String appointmentDate;
    private String appointmentTime;
    private int appointmentid;

    public Appointment(patient patient, Doctor doctor, int appointmentid, String appointmentDate, String appointmentTime) {
        this.patient = patient;
        this.appointmentid = appointmentid;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public patient getPatient() {
        return patient;
    }

    public int getAppointmentid() {
        return appointmentid;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patient = " + patient +
                ", doctor = " + doctor +
                ", appointmentDate = '" + appointmentDate + '\'' +
                ", appointmentTime = '" + appointmentTime + '\'' +
                '}';
    }
    
}
