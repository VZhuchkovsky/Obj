import com.hillel.com.hillel.oopBasics.LinkedCells;

/**
 * Created by VZhuchkovsky on 17.04.2015.
 */
public class LinkedCellsTest {
    public static void main(String[] args){
        LinkedCells list = new LinkedCells();
        System.out.println("Empty list: " + list);

        list.add("A");
        System.out.println("One element list: " + list);

        list.add("B");
        System.out.println("One element list: " + list);
    }
}
