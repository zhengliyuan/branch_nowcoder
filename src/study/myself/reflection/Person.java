package study.myself.reflection;

/**
 * @author liyuan zheng
 * @date 2021/2/21 20:19
 */
public class Person {
    private String userName;
    private int age;
    public String birthday;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Person() {
    }

    private Person(String userName) {
        this.userName = userName;
    }

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
    private String display() {
        return "我叫" + userName + "，今年" + age + "岁了！";
    }
}
