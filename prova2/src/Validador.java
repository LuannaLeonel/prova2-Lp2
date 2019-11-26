public class Validador {

    public static void valida(String parametro){
        if(parametro == null){
            throw new NullPointerException("Entrada Invalida.");
        }
        if ("".equals(parametro.trim())) {
            throw new IllegalArgumentException("Entrada Invalida.");
        }
    }

    public static void validaDouble(double numero){
        if (numero <= 0){
            throw new IllegalArgumentException("Entrada Invalida.");
        }
    }
    public static void validaInt(int numero){
        if (numero <= 0){
            throw new IllegalArgumentException("Entrada Invalida.");
        }
    }
}
