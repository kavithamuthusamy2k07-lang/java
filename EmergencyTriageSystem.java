import java.util.Scanner;

public class EmergencyTriageSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int heartRate = sc.nextInt();
        String bp = sc.next();
        double temperature = sc.nextDouble();
        sc.nextLine(); // consume newline
        String severity = sc.nextLine();

        // Parse Blood Pressure
        String[] bpParts = bp.split("/");
        int systolic = Integer.parseInt(bpParts[0]);
        int diastolic = Integer.parseInt(bpParts[1]);

        String priority = "";
        int waitTime = 0;
        String action = "";

        // Nested if-else logic
        if (heartRate < 50 || heartRate > 130 ||
            systolic > 180 || systolic < 90 ||
            temperature > 103 || temperature < 96 ||
            severity.equalsIgnoreCase("Life-Threatening")) {

            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";

        } else if ((heartRate >= 50 && heartRate <= 60) || (heartRate >= 110 && heartRate <= 130) ||
                   (systolic >= 160 && systolic <= 180) || (systolic >= 90 && systolic <= 100) ||
                   (temperature >= 101 && temperature <= 103) || (temperature >= 96 && temperature <= 97) ||
                   severity.equalsIgnoreCase("Severe")) {

            priority = "Urgent";

            if (heartRate < 60 || systolic <= 100) {
                waitTime = 20;
            } else {
                waitTime = 15;
            }

            action = "Priority Medical Attention";

        } else if (severity.equalsIgnoreCase("Moderate")) {

            priority = "Standard";
            waitTime = 45;
            action = "Standard Examination";

        } else {

            priority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }

        // Output
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + severity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);

        sc.close();
    }
}
