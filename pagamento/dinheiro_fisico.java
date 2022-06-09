
package pagamento;
public class dinheiro_fisico extends dinheiro{
    protected static int op1;
    protected double valordf1;
    protected double valordf2;
    public static int dinheiro_fisico(){
        return op1;
    }
    public dinheiro_fisico(double valordf1, double valordf2){
        this.valordf1 = valordf1;
        this.valordf2 = valordf2;
        this.op1++;
        this.valorMAX+=valordf1;
    }
    public double result(){
        if(valordf1<0){
            System.out.println("erro no pagamento");
        }
        if(valordf1==0){
            System.out.println("erro no pagamento");
        }
        else{
        System.out.println("pagamento efetuado");
        return valordf1-valordf2;
        }
        return 0;
    }
}
