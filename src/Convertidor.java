public class Convertidor {
    // -------ATRIBUTOS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Este es un String porque puede entrar un número base 16
    public String numeroAConvertir;

    public int base;

    // -------Constructor------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public Convertidor() {
        numeroAConvertir = "";
        base = -1;
    }

    // -------SETTERS Y GETTERS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Para cambiar el String de numero a cambiar
     * @param numNuevo
     */
    public void setnumeroAConvertir(String numNuevo) {
        numeroAConvertir = numNuevo;
    }

    /**
     *
     * @param n
     * @throws IllegalArgumentException Esta tira excepción porque puede entrar un parametro no válido y arruinarnos nuestros sueños de un programa robusto
     */
    public void setBase(int n) throws IllegalArgumentException {
        if ((n == 10) || (n == 8) || (n == 2) || (n == 16)) {
            base = n;
        } else {
            throw new IllegalArgumentException("esa no es una base valida");
        }
    }

    /**
     *
     * @return String del número a convertir
     */
    public String getnumeroAComvertir() {
        return numeroAConvertir;
    }

    /**
     *
     * @return int de la base
     */
    public int getBase() {
        return base;
    }

    // -------METODOS DE A DEBIS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Conversión de número en String de base 10 a base 2, puede soltar excepción pues usa Integer.valueOf(num) si la String contiene algún carácter no numérico
     * @param num
     * @return String del número convertido a binario
     */
    public String conversion10a2(String num) {
        int n;
        String resultado = "";

        n = Integer.valueOf(num);

        System.out.println(n);

        while ((n != 0)) {
            resultado = (n % 2) + resultado;
            n = n / 2;
        }

        return resultado;
    }

    /**
     * hola pao, ya quedó solo falta soltar la excepción en otro caso, ponlo porfa es que no supe como ponerlo
     * @param num
     * @return String del número en base 2
     * @throws IllegalArgumentException
     */
    public String conversion8a2(String num) throws IllegalArgumentException {
        String resultado = "";

        for (int i = 0; i < num.length(); i++) {
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
                    resultado = resultado + "011";
                    break;
                case '4':
                    resultado = resultado + "100";
                    break;
                case '5':
                    resultado = resultado + "101";
                    break;
                case '6':
                    resultado = resultado + "110";
                    break;
                case '7':
                    resultado = resultado + "111";
                    break;

                default:
                    throw new IllegalArgumentException("La String del número contiene un dígito que no está en base 8");

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
    public String conversion16a2(String num) throws IllegalArgumentException {
        String resultado = "";

        for (int i = 0; i < num.length(); i++) {
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
                    resultado = resultado + "0011";
                    break;
                case '4':
                    resultado = resultado + "0100";
                    break;
                case '5':
                    resultado = resultado + "0101";
                    break;
                case '6':
                    resultado = resultado + "0110";
                    break;
                case '7':
                    resultado = resultado + "0111";
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
                    resultado = resultado + "1011";
                    break;
                case 'C':
                    resultado = resultado + "1100";
                    break;
                case 'D':
                    resultado = resultado + "1101";
                    break;
                case 'E':
                    resultado = resultado + "1110";
                    break;
                case 'F':
                    resultado = resultado + "1111";
                    break;

                default:
                    throw new IllegalArgumentException("La String del número contiene un dígito que no está en base 16");

            }

        }

        return resultado;
    }

    public String conversion2a16(String num) throws IllegalArgumentException {
        while (num.length() % 4 != 0) {
            num = "0" + num;
        }
        //System.out.println(num);
        String resultado = "";

        for (int i = 0; i < num.length(); i = i + 4) {
            String sub = num.substring(i, i + 4);
            switch (sub) {
                case "0000":
                    resultado = resultado + "0";
                    break;
                case "0001":
                    resultado = resultado + "1";
                    break;
                case "0010":
                    resultado = resultado + "2";
                    break;
                case "0011":
                    resultado = resultado + "3";
                    break;
                case "0100":
                    resultado = resultado + "4";
                    break;
                case "0101":
                    resultado = resultado + "5";
                    break;
                case "0110":
                    resultado = resultado + "6";
                    break;
                case "0111":
                    resultado = resultado + "7";
                    break;

                case "1000":
                    resultado = resultado + "8";
                    break;
                case "1001":
                    resultado = resultado + "9";
                    break;
                case "1010":
                    resultado = resultado + "A";
                    break;
                case "1011":
                    resultado = resultado + "B";
                    break;
                case "1100":
                    resultado = resultado + "C";
                    break;
                case "1101":
                    resultado = resultado + "D";
                    break;
                case "1110":
                    resultado = resultado + "E";
                    break;
                case "1111":
                    resultado = resultado + "F";
                    break;
                default:
                    throw new IllegalArgumentException("La String del número contiene una subcadena que no pertenece a la base binaria");
            }
        }

        return resultado;
    }

    public String conversion2a8(String num) throws IllegalArgumentException {
        while (num.length() % 3 != 0) {
            num = "0" + num;
        }
        //System.out.println(num);
        String resultado = "";

        for (int i = 0; i < num.length(); i = i + 3) {
            String sub = num.substring(i, i + 3);
            switch (sub) {
                case "000":
                    resultado = resultado + "0";
                    break;
                case "001":
                    resultado = resultado + "1";
                    break;
                case "010":
                    resultado = resultado + "2";
                    break;
                case "011":
                    resultado = resultado + "3";
                    break;
                case "100":
                    resultado = resultado + "4";
                    break;
                case "101":
                    resultado = resultado + "5";
                    break;
                case "110":
                    resultado = resultado + "6";
                    break;
                case "111":
                    resultado = resultado + "7";
                    break;
                default:
                    throw new IllegalArgumentException("La String del número contiene una subcadena que no pertenece a la base binaria");
            }
        }

        return resultado;
    }

    public String conversion2a10(String num) throws IllegalArgumentException {
        double resultado = 0;
        int large = num.length();
        for (int i = large-1; i > 0; i--) {
            if (num.charAt(i) == '1') {
                resultado = resultado + Math.pow(2, (large-1)-i);
            }
        }
        return String.valueOf(resultado);
    }

    public void binariocheck() throws IllegalArgumentException{
        for(int i=0;i<numeroAConvertir.length();i++){
            if((numeroAConvertir.charAt(i)!='1')&&(numeroAConvertir.charAt(i)!='0')){
                throw new IllegalArgumentException("Este número no está en binario");
            }
        }
    }
}

