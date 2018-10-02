public class Main {

    public static void main(String[] args) {
        int[][] a = {{1,2},{2,3},{3,4,5}};
        int b = a.length;
        System.out.println("二维数组长度为 " + b);
        for (int i = 0; i < b; i++){
            System.out.println("内维a[" + i + "]长度为" + a[i].length);
        }
    }
}
