public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String lastName, String firstName, String middleName, String birthDate,
                   String address, String phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return this.id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Прізвище: " + lastName + "\n" +
                "Ім'я: " + firstName + "\n" +
                "По батькові: " + middleName + "\n" +
                "Дата народження: " + birthDate + "\n" +
                "Адреса: " + address + "\n" +
                "Телефон: " + phoneNumber + "\n" +
                "Факультет: " + faculty + "\n" +
                "Курс: " + course + "\n" +
                "Група: " + group;
    }
}
