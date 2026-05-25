public class WRM {
    Patient dh;

    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id, name, age, bloodgroup, null, null);
        Patient tail = dh.prev;
        tail.next = newPatient;
        newPatient.prev = tail;
        newPatient.next = dh;
        dh.prev = newPatient;
        System.out.println("Patient Registered!");
    }

    public void servePatient() {
        if (dh.next == dh) {
            System.out.println("No Patient Waiting.");
            return;
        }
        Patient firstPatient = dh.next;
        Patient secondPatient = firstPatient.next;
        dh.next = secondPatient;
        secondPatient.prev = dh;
        System.out.println("Serving Patient ID: " + firstPatient.id);
    }

    public void showAllPatient() {
        if (dh.next == dh) {
            System.out.println("No Patient Waiting.");
            return;
        }
        Patient temp = dh.next;
        System.out.print("Waiting Patients: ");
        while (temp != dh) {
            System.out.print(temp.id + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Boolean canDoctorGoHome() {
        if (dh.next == dh) {
            System.out.println("Yes. All patients are served.");
            return true;
        }
        System.out.println("No. Patients are waiting.");
        return false;
    }

    public void cancelAll() {
        dh.prev = dh;
        dh.next = dh;
        System.out.println("All appointments cancelled");
    }

    public void reverseTheLine() {
        if (dh.next == dh) {
            System.out.println("No patient waiting");
            return;
        }
        Patient curr = dh;
        do {
            Patient temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = temp;
        } while (curr != dh);
        System.out.println("Line Reversed.");

        /*
        equivalent loop for do-while
        ================================
        Patient temp = curr.next;
        curr.next = curr.prev;
        curr.prev = temp;
        curr = temp;

        while (curr != dh) {
            temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = temp;
        }
        */
    }
}