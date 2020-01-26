package javaBasic;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/26
 */
public class PersonTest {
private String name;

    public PersonTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
