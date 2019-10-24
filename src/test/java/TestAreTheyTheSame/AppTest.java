package TestAreTheyTheSame;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;


public class AppTest {

    @Test
    public void Test1(){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(121);
        a.add(144);
        a.add(19);
        a.add(161);
        a.add(19);
        a.add(144);
        a.add(19);
        a.add(11);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(121);
        b.add(14641);
        b.add(20736);
        b.add(361);
        b.add(25921);
        b.add(361);
        b.add(20736);
        b.add(361);
        assertEquals(true, App.Compa(a, b));

    }
}