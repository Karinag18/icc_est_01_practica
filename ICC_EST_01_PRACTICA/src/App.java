public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "Hola mundo";
        System.out.println(cadena);
        System.out.println("tamaño de cadena");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        
        for (int i = 0; i < cadena.length(); i++){
            if (i == cadena.length()-1){
                System.out.print(cadena.charAt(i));
                
            }else{
                System.out.print(cadena.charAt(i) + "-");
            }
        }

        System.out.println();
        //Contar palabras
        int palabra = cadena.split(" ").length;
        System.out.println(palabra);

        //Contar cuantas a hay en la cadena
        int cantidadA = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                cantidadA++;
            }
        }
        System.out.println(cantidadA);
    }
}
