
package pagamento;
public class creditov_debito extends dinheiro{
    protected static int op3;
    protected double valorcv1;
    public creditov_debito(){
    this.op3++;
}
    public static int cred_deb(){
        return op3;
    }
    public creditov_debito(double valorcv1){
        this.valorcv1 = valorcv1;
        this.op3++;
        this.valorMAX+=valorcv1;
    }
    public double result(){
        if(valorcv1<0){
            System.out.println("erro no pagamento");
        }
        if(valorcv1==0){
            System.out.println("erro no pagamento");
        }
        else{
        System.out.println("pagamento efetuado");
        return valorcv1;
        }
        return 0;
    }
}
