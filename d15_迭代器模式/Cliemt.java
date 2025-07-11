package d15_迭代器模式;

import java.util.ArrayList;

public class Cliemt {

    public static void main(String[] args) {

        // 创建学院
        ArrayList<College> arrayList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();


        arrayList.add(computerCollege);
        arrayList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(arrayList);
        outPut.printCollege();

    }
}
