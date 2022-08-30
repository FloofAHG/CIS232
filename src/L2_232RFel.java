/**
 * Lab 2
 * 
 * @author Robyn Felton
 */

public class L2_232RFel {
    /*
     * Write a no-argument (zero-parameter) constructor that will set the
     * title to “TBD”, the department to “TBD”, the courseNumber to 0
     * and the capacity to –1.
     */
    private L2_232RFel() {
        title = "TBD";
        department = "TBD";
        courseNumber = 0;
        capacity = -1;
    }

    /*
     * Write a constructor that takes in four parameters – two Strings, and
     * two ints, corresponding to the order the instance variables are listed
     * above. The constructor will assign parameters to the corresponding
     * instance variable
     */
    private L2_232RFel(String theTitle, String theDepartment, int theCourseNumber, int theCapacity) {

        title = theTitle;
        department = theDepartment;
        courseNumber = theCourseNumber;
        capacity = theCapacity;
    }

    public static void main(String[] args) {
        L2_232RFel[] courses = new L2_232RFel[5];
        courses[0] = new L2_232RFel();
        courses[1] = new L2_232RFel("FUND COMP SCI II", "CIS", 232, 32);
        courses[2] = new L2_232RFel("GEN COLL CHEMISTRY I", "CHEM", 201, 32);
        courses[3] = new L2_232RFel("TRIG WITH GEOMETRY", "MATH", 231, 32);
        courses[4] = new L2_232RFel("Wind Ensemble", "MUS", 225, 32);
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + "\n");
        }
    }

    public boolean equals(Object x) {
        if (!(x instanceof L2_232RFel)) {
            return false;
        }
        L2_232RFel course = (L2_232RFel) x;
        return getTitle() == course.getTitle() && getDepartment() == course.getDepartment()
                && getCourseNumber() == course.getCourseNumber();
    }

    public String toString() {
        return getTitle() + "\n" + getDepartment() + " " + getCourseNumber() + "\n" + "Capacity: "
                + getCapacity();
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Fields
    private String title;
    private String department;
    private int courseNumber;
    private int capacity;
}
