
package pagamento;
public class dinheiro {
    protected static int opMAX;
    protected static double valorMAX;
    public dinheiro(){
    this.opMAX++;
}
    public static int getDinheiro(){
        return opMAX;
    }
    public static double getvalorMAX(){
        return valorMAX;
    }
}
