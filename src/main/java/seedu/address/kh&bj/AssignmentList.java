package duke.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class AssignmentList {
    private ArrayList<Assignment> assignments = new ArrayList<>();
    private HashMap<String, Assignment> assignmentMap = new HashMap<>();

    public void add(String assignmentName, StudentList sl) {
        if (assignmentMap.containsKey(assignmentName)) {
            System.out.println("Duplicate assignment name: " + assignmentName);
        } else {
            Assignment a = new Assignment(assignmentName, sl);
            assignments.add(a);
            assignmentMap.put(assignmentName, a);
        }
    }

    public void delete(String assignmentName) {
        if (!assignmentMap.containsKey(assignmentName)) {
            System.out.println("Assignment: " + assignmentName + " not found");
        } else {
            assignments.remove(assignmentMap.remove(assignmentName));
        }
    }
    public void grade(String assignmentName, int studentId, int marks) {
        if (!assignmentMap.containsKey(assignmentName)) {
            System.out.println("Assignment: " + assignmentName + " not found");
        } else {
            assignmentMap.get(assignmentName).gradeSubmission(studentId, marks);
        }
    }
}

// TODO: delete student from classList = must delete all submissions of studentId for all assignments.