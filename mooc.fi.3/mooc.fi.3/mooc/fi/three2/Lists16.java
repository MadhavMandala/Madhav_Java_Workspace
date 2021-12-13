package mooc.fi.three2;

import java.util.ArrayList;

public class Lists16 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);

    }

    public static void removeLast(ArrayList<String> arrayList) {

        int last = arrayList.size()-1;
        arrayList.remove(last);

    }

}
