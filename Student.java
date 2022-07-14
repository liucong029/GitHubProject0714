package pojo;

public class Student {
    private String name ;
    private Integer chinese;
    private Integer math;
    private Integer english;

    public Student() {
    }

    public Student(String name, Integer chinese, Integer math, Integer english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\""+this.name+"\","+
                "\"chinese\":\""+this.chinese+"\","+
                "\"math\":\""+this.math+"\","+
                "\"english\":\""+this.english+"\""+
                "}";
    }
}
