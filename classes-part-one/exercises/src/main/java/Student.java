public class Student {
        private String name;
        private int studentId;
        private  int numberOfCredits = 0;
        private  double gpa = 0.0;

    public static class Course {
        private static String topic;
        private static String instructor;
        private static int enrolledStudents;


        public Course(String topic, String instructor,int enrolledStudents ){
              this.topic = topic;
              this.instructor = instructor;
              this.enrolledStudents = enrolledStudents;

}
        public void setTopic(String topic) {
            this.topic = topic;
        }
        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }
        public void setEnrolledStudents(int enrolledStudents) {
            this.enrolledStudents = enrolledStudents;
        }

        public static String getTopic() {
            return topic;
        }
        public static String getInstructor() {
            return instructor;
        }
        public static int getEnrolledStudents(){
            return enrolledStudents;
        }
    }

    public static class Teacher {
        public static boolean getFirstName;
        public static boolean getLastName;
        public static boolean getSubject;
        public static boolean getYearsTeaching;
        private String firstName;
        private String lastName;
        private String subject;
        private double yearsTeaching;


        public Teacher(String firstName , String lastName, String subject, double yearsTeaching){
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setSubject(String subject) {
            this.subject = subject;
        }
        public void setYearsTeaching(double yearsTeaching){
            this.yearsTeaching = yearsTeaching;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return  lastName;
        }
        public String getSubject() {
            return subject;
        }
        public double getYearsTeaching() {
            return yearsTeaching;
        }


    }
        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

      public Student(String name, int studentId) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = 0;
                this.gpa = 0.0;
        }


        public void setName(String name) {
                this.name = name;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }




        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
