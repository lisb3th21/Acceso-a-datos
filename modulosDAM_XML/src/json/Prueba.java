package json;


public class Prueba {
    private static Prueba prueba;


    private Prueba(){
        System.out.println("se ha creado");
    }

    public static Prueba getInstange(){
        if(prueba==null){
            synchronized(Prueba.class){
                if(prueba == null){
                    System.out.println("primer");
                    prueba = new Prueba();
                }
            }
        }
    return prueba;
    }

    public void algo(){
        System.out.println("Haciendo algo");
    }



    public static void main(String[] args) {
        Prueba.getInstange().algo();
    }
    
}
