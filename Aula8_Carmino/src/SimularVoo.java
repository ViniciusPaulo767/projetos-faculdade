public class SimularVoo {

    /*Parecido com o outro aqui ele instancia os objetos piloto1 e 2 e o avião,
    depois ele executa alguns metodos para no final mostrar os dados dos objetos
    instanciados.*/
    public static void main(String[] args) {
        Piloto p1, p2;
        Aviao a1;
        p1 = new Piloto("Abreu");
        p2 = new Piloto("Julio");
        a1 = new Aviao();

        a1.fazVoo(40, p1);
        a1.fazVoo(100, p2);
        a1.fazVoo(170, p2);
        a1.fazVoo(30, p1);
        a1.fazRevisao();
        a1.fazVoo(20, p1);
        p1.imprime();
        p2.imprime();
        a1.imprime();
    }

}