public class SwitchCase {
    public static void main(String[] args) {
        String plano = "B";
        switch (plano) {
            case "T": {
                System.out.println("5gb youtube");
            }
            case "M": {
                System.out.println("what e instagram grátis");
            } 
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            } 
            default: {
                System.out.println("plano invalido");
            }
        }
    }
}
