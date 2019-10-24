package TestAreTheyTheSame;

import java.util.ArrayList;

public class App {
    public static ArrayList<Integer> a = new ArrayList<>();
    public static ArrayList<Integer> b = new ArrayList<>();

    public static void main(String[] args) {

        a.add(121);
        a.add(144);
        a.add(19);
        a.add(161);
        a.add(19);
        a.add(144);
        a.add(19);
        a.add(11);

        b.add(131);
        b.add(14641);
        b.add(20736);
        b.add(361);
        b.add(25921);
        b.add(361);
        b.add(20736);
        b.add(361);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Compa(a, b));
    }

    public static boolean Compa(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (b.size() < a.size()) {
            return false;
        }
        for (int i = 0; i < a.size(); i++) {
            int quadrato = a.get(i) * a.get(i);
            if (b.contains(quadrato)) {
                removenumber(quadrato, b);
            } else {
                return false;
            }
        }
        return true;

    }

    public static void removenumber(int x, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<>();
        boolean trovato = false;
        for (int i : b) {
            if (x != i) {
                c.add(x);
            } else {
                if (!trovato) {
                    trovato = true;
                } else {
                    c.add(x);
                }
            }

        }
        b = new ArrayList<>();
        b.addAll(c);
    }
}
