public class Debugging {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrou no método main");
        a();
        System.out.println("finalizou o método main");
    }

    static void a(){
        System.out.println("entrou no método a");
        b();
        System.out.println("finalizou o método a");
    }

    static void b(){
        System.out.println("entrou no método b");
        // menor ou igual a 4
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("finalizou o método b");
    }

    static void c(){
        System.out.println("entrou no método c");
        Thread.dumpStack();
        System.out.println("finalizou o método c");
    }
}
