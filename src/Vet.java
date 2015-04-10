import java.util.Arrays;

/**
 * Created by VZhuchkovsky on 10.04.2015.
 */
public class Vet {
    Cat[] vetList = new Cat[10];

    int registered = 0;

    public void registerCat(Cat cat) //static ���������� ������
    {
        vetList[registered] = cat;
        registered++;
    }

    public void print()
    {
        System.out.println(Arrays.toString(vetList));
    }
    public void makeVaccine()
    {
        for (int i = 0; i < registered; i++)
        {
            Cat cat = vetList[i];
            cat.acceptVaccine("SVG");
        }
    }
}
