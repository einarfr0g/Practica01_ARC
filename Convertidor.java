public class Convertidor {
    // -------ATRIBUTOS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //este es un Strin porque puede entrar un número base 16
    public String numeroAConvertir;

    public int base;
    
    // -------Constructor------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public Convertidor(){
        numeroAConvertir="";


        base = -1; 
    }
    

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

    // -------METODOS DE A DEBIS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * conversión de número en String de base 10 a base 2, puede soltar excepción pues usa Integer.valueOf(num) si la String contiene algúna caracter no numérico
     * @param num
     * @return String del número convertido a binario
     */
    public String conversion10a2(String num){
        int n;
        String resultado="";

        n = Integer.valueOf(num);

        System.out.println(n);

        while((n!=0)){
            resultado = (n%2)+resultado;
            n=n/2;
        }

        return resultado;
    }

    /**
     * hola pao, ya quedó solo falta soltar la excepción en otro caso, ponlo porfa es que no supe como ponerlo
     * @param num
     * @return String del número en base 2
     * @throws IllegalArgumentException
     */
    public String conversion8a2(String num) throws IllegalArgumentException{
        String resultado = "";

        for(int i=0; i<num.length();i++){
            switch (num.charAt(i)) {
                case '0':
                       resultado = resultado + "000"; 
                    
                    break;
                case '1':
                        resultado = resultado + "001";

                    break;
                case '2':
                        resultado = resultado + "010";

                    break;
                case '3':
                        resultado = resultado +"011"; 
                    break;
                case '4':
                        resultado = resultado +"100"; 
                    break;
                case '5':
                        resultado = resultado +"101"; 
                    break;
                case '6':
                        resultado = resultado +"110"; 
                    break;
                case '7':
                        resultado = resultado +"111"; 
                    break;

                default://we acá no se como ponerle que en otro caso mande invalid argument exception porfa ponlo tú 
                        //throw new IllegalArgumentException("La String del número contiene un dígito que no está en base 8");
                
            }

        }

        return resultado;
    }

    /**
     * hola pao, ya quedó solo falta soltar la excepción en otro caso, ponlo porfa es que no supe como ponerlo
     * @param num
     * @return String del número en base 2
     * @throws IllegalArgumentException
     */
    public String conversion16a2(String num) throws IllegalArgumentException{
        String resultado = "";

        for(int i=0; i<num.length();i++){
            switch (num.charAt(i)) {
                case '0':
                       resultado = resultado + "0000"; 
                    
                    break;
                case '1':
                        resultado = resultado + "0001";

                    break;
                case '2':
                        resultado = resultado + "0010";

                    break;
                case '3':
                        resultado = resultado +"0011"; 
                    break;
                case '4':
                        resultado = resultado +"0100"; 
                    break;
                case '5':
                        resultado = resultado +"0101"; 
                    break;
                case '6':
                        resultado = resultado +"0110"; 
                    break;
                case '7':
                        resultado = resultado +"0111"; 
                    break;

                case '8':
                       resultado = resultado + "1000"; 
                    
                    break;
                case '9':
                        resultado = resultado + "1001";

                    break;
                case 'A':
                        resultado = resultado + "1010";

                    break;
                case 'B':
                        resultado = resultado +"1011"; 
                    break;
                case 'C':
                        resultado = resultado +"1100"; 
                    break;
                case 'D':
                        resultado = resultado +"1101"; 
                    break;
                case 'E':
                        resultado = resultado +"1110"; 
                    break;
                case 'F':
                        resultado = resultado +"1111"; 
                    break;

                default://we acá no se como ponerle que en otro caso mande invalid argument exception porfa ponlo tú 
                        //throw new IllegalArgumentException("La String del número contiene un dígito que no está en base 16");
                
            }

        }

        return resultado;
    }
}
