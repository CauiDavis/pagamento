
package pagamento;
public class main {
    public static void main(String args[]){
        dinheiro_fisico d1 = new dinheiro_fisico(400,200);
        dinheiro_fisico d2 = new dinheiro_fisico(200,30);
        creditop cp0 = new creditop(500,4);
        creditop cp1 = new creditop(500,3);
        creditov_debito cd1 = new creditov_debito(600);
        System.out.println("maximo de operacoes registradas é:" + d1.getDinheiro());
        System.out.println("quantidades operações em dinheiro fisico:" + d1.dinheiro_fisico());
        System.out.println("quantidades operações em credito parcelado:" + cp0.creditop());
        System.out.println("quantidades operações em credito a vista ou debito:" + cd1.cred_deb());
        System.out.println("valores por dinheiro fisico");
        System.out.println("troco:" + d1.result());
        System.out.println("troco:" + d2.result());
        System.out.println("valores por credito parcelado");
        System.out.println(cp0.numParcelas() + " parcelas de:" + cp0.result());
        System.out.println(cp1.numParcelas() + " parcelas de:" + cp1.result());
        System.out.println("valores por credito a vista ou debito");
        System.out.println("valor do credito a vista ou debito:" + cd1.result());
        System.out.println("valor maximo dos pagamentos:" + d1.getvalorMAX());
    }
}
