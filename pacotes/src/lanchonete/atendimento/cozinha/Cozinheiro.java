package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("adicionando lanche natural hamburger no balcao");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcao");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("preparando lanche tipo hamburger");
    }

    private void prepararVitamina(){
        System.out.println("preparando suco");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("selecionando pao, salada, ovo e carne");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("selecionando fruta, leite e suco");
    }

    private void lavarIngredientes(){
        System.out.println("batendo vitamina liquidificador");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("batendo vitamina liquidificador");
    }

    private void fritarIngredientesLanche(){
        System.out.println("fritando carne e ovo para hamburger");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

    void chamaMetodoPraPararWarning(){
        pedirParaTrocarGas(null);
        fritarIngredientesLanche();
        baterVitaminaLiquidificador();
        lavarIngredientes();
        selecionarIngredientesLanche();
        selecionarIngredientesVitamina();
        prepararCombo();
    }
}
