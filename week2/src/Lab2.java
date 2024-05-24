public class Lab2 {
    public static void main(String[] args) {
        Lab2 lab2 = new Lab2();
        ReportCard reportCard1 = lab2.new ReportCard("John Doe", "123456", 90.0f); // Use the instance to create the ReportCard objects
        ReportCard reportCard2 = lab2.new ReportCard("Jane Doe", "654321", 95.0f);
        ReportCard reportCard3 = lab2.new ReportCard("John Smith", "456789", 85.0f);
        
        System.out.println(reportCard1.getReport());
        System.out.println(reportCard2.getReport());
        System.out.println(reportCard3.getReport());

        String newx = new String("hello world");
        new String(newx);
    }

    public class ReportCard {
        String studentName;
        String studentId;
        float currentGrade;

        public ReportCard(String studentName, String studentId, Float currentGrade){
            this.studentName = studentName;
            this.studentId = studentId;
            this.currentGrade = currentGrade;
        }


        public String getReport(){
            String report = studentName+", " + studentId +", "+ currentGrade;
            return report;
        }

           
    }

}
