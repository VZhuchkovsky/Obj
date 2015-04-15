package com.hillel.com.hillel.oopBasics;

import java.net.SocketPermission;
import java.util.Arrays;

/**
 * Created by VZhuchkovsky on 10.04.2015.
 */
public class Procedure {

    static String[] vetList = new String[10]; //���������� ���������
    static int registered = 0; //�������

    public static void main(String[] args) {
        String cat1Name = "Tom";
        int cat1age = 2;

        String cat2Name = "Murzik";
        int cat2Age = 1;

        registerCat(cat1Name, cat2Age);


        printRegisteredCats();

    }
    public static void printRegisteredCats()
    {
        System.out.println(Arrays.toString(vetList));
    }

    public static void registerCat(String catName, int catAge) //�������� �������� String[] vetList, ���� ������ �� ����� ��� ����. ����.
    {
        vetList[registered] = catName + "" + catAge; //�����������
        registered++; //����������� � ���������� ���������

    }
}
