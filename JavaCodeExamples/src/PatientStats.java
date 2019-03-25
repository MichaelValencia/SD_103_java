import jdk.jshell.execution.Util;

public class PatientStats {
    public static void main(String[] args) {
        String patientName, reasonForVisitaion;
        double temp, heightInMeters, weight;
        int diastolic, systolic, age, painScale;

        patientName = Utils.getInput("whats your name? ");
        reasonForVisitaion = Utils.getInput("whats your reason for visiting? ");
        heightInMeters = Utils.getDouble("How tall are you in meters ");
        weight = Utils.getDouble("How much do you weight?");
        age = Utils.getNumber("How old are you? ");
        temp = Utils.getDouble("what is you temp? ");
        systolic = Utils.getNumber("what is your systolic  bp ");
        diastolic= Utils.getNumber("what is your diastolic bp ");
        painScale = Utils.getNumber("whats is the level of pain you currently are at?", 5);

        String diagnosis = patientName + reasonForVisitaion + heightInMeters + weight + age + temp + diastolic + systolic + painScale;
        System.out.println("diagnosis = " + diagnosis);

        String comment = "";
        if (temp < 68) {
            comment = "Patient has probably been dead for several days";
        } else if (temp <= 87.5) {
            comment = "Just recently dead";
        } else if (temp > 87.5 && temp < 96) {
            comment = "Get the patient a blanket ";
        } else if (temp >= 96 && temp < 99) {
            comment = " Normal temp ";
        } else if (temp > 99 && temp < 102) {
            comment = " Suggest patient take some aspirin ";
        } else if (temp > 102 && temp < 106) {
            comment = " Call the ER ";
        } else if (temp > 106) {
            comment = " call the CDC ";
        }
        if (heightInMeters < 1.5) {
            comment += " Suggest growth hormones ";
        }else if(heightInMeters >1.6 && heightInMeters <2.3){
            comment +=" you're right where you need to be ";
        }
        else if (heightInMeters > 2.4) {
            comment += " Suggest they try out for the Mavs ";
        }
        if (painScale == 1) {
            comment += " Patient feels terrible ";
        } else if (painScale == 2) {
            comment += " Patient has had worse days but not many ";
        } else if (painScale == 3) {
            comment += " Meh patient will be fine probably faking it ";
        } else if (painScale == 4) {
            comment+= " Why are they here, if they feel this good ";
        } else if (painScale == 5) {
            comment += " Patient probably just got a job as a programmer ";
        }

        System.out.println("dr diagnosis is ="+ patientName + comment);

    }
}
