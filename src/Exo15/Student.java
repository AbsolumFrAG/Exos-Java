package Exo15;

public class Student {
    private int studentId;
    private String studentName;
    private String grade;

    public Student() {
        this(0, "Inconnu", "Aucun");
    }

    public Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public void afficherInfos(String numero) {
        System.out.println("ID étudiant" + numero + " : " + studentId);
        System.out.println("Nom de l'étudiant " + numero + " : " + studentName);
        System.out.println("Étudiant " + numero + " Niveau : " + grade);
    }

    public static void main(String[] args) {
        Student etudiant1 = new Student();
        Student etudiant2 = new Student(101, "Cullen", "A");

        etudiant1.afficherInfos("1");
        System.out.println();
        etudiant2.afficherInfos("2");
    }
}
