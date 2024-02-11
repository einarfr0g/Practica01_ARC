public class Convertidor {
    // -------ATRIBUTOS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //este es un Strin porque puede entrar un número base 16
    public String numeroAConvertir;

    public int base;

    // -------SETTERS Y GETTERS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Para cambiar el String de numero a cambiar
     * @param numNuevo
     */
    public void setnumeroAConvertir(String numNuevo){
        numeroAConvertir = numNuevo;
    }

    /**
     * 
     * @param n
     * @throws IllegalArgumentException
     * Esta tira excepción poquer puede entrar un parametro no válido y arruinarnos nuestos sueños de un programa robusto
     */
    public void setBase(int n) throws IllegalArgumentException {
        if((n==10)||(n==8)||(n==2)||(n==16)){
            base = n ;
        }else{
            throw new IllegalArgumentException("esa no es una base valida");
        }
    }

    /**
     * 
     * @return String del número a convertir
     */
    public String getnumeroAComvertir(){
        return numeroAConvertir ;
    }

    /**
     * 
     * @return int de la base
     */
    public int getBase(){
        return base;
    }

    
}