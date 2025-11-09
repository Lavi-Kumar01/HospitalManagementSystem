import java.util.*;

public class HMS {
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<patient> patients = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Doctors");
            System.out.println("5. View Patients");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    addPatient();
                    break;
                case 3:
                    scheduleAppointment();
                    break;
                case 4:
                    viewDoctors();
                    break;
                case 5:
                    viewPatients();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

private static void addDoctor() {
    System.out.print("Enter Doctor Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Doctor ID: ");
    int id = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Specialization: ");
    String specialization = sc.nextLine();
    System.out.print("Enter Experience (years): ");
    int experience = sc.nextInt();
    sc.nextLine(); // Consume newline

    Doctor doctor = new Doctor(name, id, specialization, experience);
    doctors.add(doctor);
    System.out.println("Doctor added successfully.");
}

private static void addPatient() {
    System.out.print("Enter Patient Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Patient ID: ");
    int id = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Disease: ");
    String disease = sc.nextLine();
    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine(); // Consume newline

    patient patient = new patient(name, id, disease, age);
    patients.add(patient);
    System.out.println("Patient added successfully.");
}

private static void scheduleAppointment() {
    System.out.print("Enter Patient ID: ");
    int patientId = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Doctor ID: ");
    int doctorId = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
    String date = sc.nextLine();
    System.out.print("Enter Appointment Time (HH:MM): ");
    String time = sc.nextLine();

    patient selectedPatient = null;
    for (patient p : patients) {
        if (p.getId() == patientId) {
            selectedPatient = p;
            break;
        }
    }

    Doctor selectedDoctor = null;
    for (Doctor d : doctors) {
        if (d.getId() == doctorId) {
            selectedDoctor = d;
            break;
        }
    }

    if (selectedPatient != null && selectedDoctor != null) {
        int appointmentId = appointments.size() + 1;
        Appointment appointment = new Appointment(selectedPatient, selectedDoctor, appointmentId, date, time);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    } else {
        System.out.println("Invalid Patient ID or Doctor ID.");
    }
}

private static void viewDoctors() {
    System.out.println("List of Doctors:");
    for (Doctor doctor : doctors) {
        System.out.println(doctor);
    }
}

private static void viewPatients() {
    System.out.println("List of Patients:");
    for (patient patient : patients) {
        System.out.println(patient);
    }
}

private static void viewAppointments() {
    System.out.println("List of Appointments:");
    for (Appointment appointment : appointments) {
        System.out.println(appointment);
    }
}
}