import java.util.Arrays;

/**
 * Created by VZhuchkovsky on 10.04.2015.
 */
public class Cat {

    static final int pawCount = 4; //final ����� ������ ���� �������� ���������

    String name;
    int age;
    String vaccines[] = new String[10];
    int vaccineCount = 0;

    public Cat(String name) {
        this(name, 0);
    }

    /*
    //����������� �����������
    public Cat() {
    }
    */
    //�����������
    public Cat(String name, int age) {
        this.name = name;  //this ���������� ��� ��� ������ �� name ��� pub. class Cat
        this.age = age;
    }

    public String toString() {
        String result = "Cat";
        result += name + "";
        result += age + "years";
        result += Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int pawCount() //���� ����
    {
        return pawCount;
    }

    //������������� ������������ ������
    public static void main(String[] args) {
        Cat cat = new Cat("sdf", 1);

    }

    public boolean equals(Object other) {

        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }

    }

}
