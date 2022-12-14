
import java.util.Scanner;

public class MetodoPracticas {
    private static final float CUOTA_FIXA = 6f;
    private static final float CUOTA_TRAM_1 = 0.1f;
    private static final float CUOTA_TRAM_2 = 0.3f;
    private static final String MSG_1 = "CALCULO DE LA FACTURA DEL AGUA";
    private static final String MSG_2 = "Introduce la cantidad de litros consumidos: ";
    private static final String MSG_3 = "El total a pagar de la factura del agua es de ";

    public static void main(String[] args) {
        MetodoPracticas method = new MetodoPracticas();
        float num;

        System.out.println(MSG_1);
        System.out.println("");
        System.out.println("");
        System.out.println(MSG_2);
        System.out.println("");
        System.out.println("");

        num = method.validar();
        num = method.validarCuota(num);
        System.out.println(MSG_3 + num + "€");

        
    }

    public float validar() {
        float num = 0;
        boolean correcte;
        Scanner scn = new Scanner(System.in);
        do {
            correcte = scn.hasNextInt();
            if (!correcte) {
                System.out.println("INTRODUCE UN NUMERO");
                scn.next();
            } else {
                num = scn.nextInt();
            }
        } while (!correcte);
        return num;

    }

    public float validarCuota(float num ) {
        if (num <= 50) {

            System.out.println(MSG_3 + CUOTA_FIXA);
        } else {
            if (num > 50 && num < 200) {

                num = num * CUOTA_TRAM_1 + CUOTA_FIXA;
                num = (num * 100) / 100;

            } else {
                if (num >= 200) {
                    num = num * CUOTA_TRAM_2 + CUOTA_FIXA;
                    num = (num * 100) / 100;
               
                }

            }
        }
        return num; 
    }

}
