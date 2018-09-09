package demo.mybatis.mydemo2.model;

public class Signup {
    private int Id;
    private String Attribute;
    private String Name;
    private int QQ;
    private int In_Time;
    private String School;
    private int Number1;
    private String Web;
    private String Dream;
    private String Teacher;
    private String Known;

    public  int getId(){
        return Id;
    }

    public  void setId(Integer Id){
        this.Id=Id;
    }
    public String getAttribute() {
        return Attribute;
    }

    public void setAttribute(String attribute) {
        Attribute = attribute;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQQ() {
        return QQ;
    }

    public void setQQ(int qQ) {
        QQ = qQ;
    }

    public int getIn_Time() {
        return In_Time;
    }

    public void setIn_Time(int in_Time) {
        In_Time = in_Time;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public int getNumber1() {
        return Number1;
    }

    public void setNumber1(int number1) {
        Number1 = number1;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String web) {
        Web = web;
    }

    public String getDream() {
        return Dream;
    }

    public void setDream(String dream) {
        Dream = dream;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public String getKnown() {
        return Known;
    }

    public void setKnown(String known) {
        Known = known;
    }
}
