package LAB_Exercise_Inheritance;

class Person {

    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {

        Student student = new Student("Joseph Jay B Baguio", 2001, "Computer Science");
        System.out.println(student);

        Instructor instructor = new Instructor("Cardo Dalisay", 1975, 35000.0);
        System.out.println(instructor);

    }

}