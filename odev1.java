public class Main {
    public static void main(String[] args) {


        int a[] = { 1, 2, 4, 5, 6, 7, 9, 3, 56, 57 };
        int i, max;

        max = a[0];
        max = a[1];
        for (i = 0; i < 10; i = i + 1)
            if (a[i] < 0)
                max = a[i];
        for (i = 0; i < 10; i = i + 1)
            if (a[i] < 0)
                if (a[i] > max)
                    max = a[i];

        System.out.println(max);

    }

}
