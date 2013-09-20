package kata3;

import java.util.Date;

public class Kata3 {

    public static void main(String[] args) {
        Student dummy = new Student ("Manolito", new Date(82,1,4));
        System.out.println(dummy.getAge());
        System.out.println(dummy.getName());
    }
}
