class Addition {
    int a;
    int b;

    void insert(int x, int y) {
        a = x; 
        b = y; 
    }

    void addition() {
        System.out.println(a + b);
    }
}
    public class Testing { 
        public static void main (String[] args) {
            Addition a1 = new Addition();
            Addition a2 = new Addition();
            a1.insert(10, 20);
            a2.insert(30, 40);
            a1.addition();
            a2.addition(); 
        }
    }
