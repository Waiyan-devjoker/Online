package Lesson_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson_21 {

    public static void main(String[] args) {

        int i[] = {30,40,50,60,70,80};

        int copyAry[] = new int[4];

        // org ary , org start index , copy ary , copy start index, copy length

        // System Array Copy

        System.arraycopy(i,2,copyAry,1,3);

        System.out.println(Arrays.toString(copyAry));




        String st[] = {"Java","HTML","CSS","Python","C++"};

        // Array Copy
        String copySt[] = Arrays.copyOfRange(st,2,4);


        System.out.println(Arrays.toString(copySt));






    }

}
