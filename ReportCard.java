class ReportCard {
    protected String name;
    protected String surname;
    protected String studentClass;
    protected List<SubjectDetails> subjects;

    // Constructor
    public ReportCard(String name, String surname, String studentClass) {
        this.name = name;
        this.surname = surname;
        this.studentClass = studentClass;
        this.subjects = new ArrayList<>();
    }

    // Method to add a subject with its vote and judgment
    public void addSubject(String subjectName, int vote, String judgment) {
        subjects.add(new SubjectDetails(subjectName, vote, judgment));
    }

    // Method to display the report card
    public void displayReport() {
        System.out.println("Report Card:");
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Class: " + studentClass);
        System.out.println("Subjects:        ");
        System.out.printf("%-15s %-10s %-20s\n", "Subject", "Vote", "Judgment");
        for (SubjectDetails subject : subjects) {
            System.out.printf("%-15s %-10d %-20s\n", subject.subjectName, subject.vote, subject.judgment);
        }
        System.out.println("\n");
    }

    // Inner class to store details of each subject
    protected class SubjectDetails {
        protected String subjectName;
        protected int vote;
        protected String judgment;

        public SubjectDetails(String subjectName, int vote, String judgment) {
            this.subjectName = subjectName;
            this.vote = vote;
            this.judgment = judgment;
        }
    }
}

class ReportCardPrinter {
    protected List<ReportCard> reportCards;

    // Constructor
    public ReportCardPrinter() {
        this.reportCards = new ArrayList<>();
    }

    // Method to add a report card to the list
    public void addReportCard(ReportCard reportCard) {
        reportCards.add(reportCard);
    }

    // Method to print all report cards
    public void printAllReportCards() {
        for (ReportCard reportCard : reportCards) {
            reportCard.displayReport();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a ReportCard object
        ReportCard reportCard1 = new ReportCard("Hardik", "Mahajan", "12th Grade");
        reportCard1.addSubject("Math", 85, "Excellent");
        reportCard1.addSubject("Science", 88, "Excellent");
        reportCard1.addSubject("English", 90, "Outstanding");

        ReportCard reportCard2 = new ReportCard("Aarav", "Sharma", "9th Grade");
        reportCard2.addSubject("Math", 88, "Very Good");
        reportCard2.addSubject("History", 76, "Good");
        reportCard2.addSubject("Physics", 92, "Excellent");

        // Create a ReportCardPrinter object
        ReportCardPrinter printer = new ReportCardPrinter();
        printer.addReportCard(reportCard1);
        printer.addReportCard(reportCard2);

        // Print all report cards
        printer.printAllReportCards();
    }
}
