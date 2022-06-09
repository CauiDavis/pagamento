
package pagamento;
public class creditop extends dinheiro {
    protected static int op2;
    protected double valorcp1;
    protected int numparcelas;
    public static int creditop(){
        return op2;
    }
    public creditop(double valorcp1, int numparcelas){
        this.valorcp1 = valorcp1;
        this.numparcelas = numparcelas;
        this.op2++;
        this.valorMAX+=valorcp1;
    }
    public double result(){
        if(valorcp1<0){
            System.out.println("erro no pagamento");
        }
        if(valorcp1==0){
            System.out.println("erro no pagamento");
        }
        else{
        System.out.println("pagamento efetuado");
        return valorcp1/numparcelas;
        }
        return 0;
    }
    public int numParcelas(){
        return numparcelas;
    }
}
