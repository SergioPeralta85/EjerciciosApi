package Ejercicio1;

public class ejercicio1 {
    //Imprime el nombre mas largo 
    public static void main(String[]args){
        String nombres[]={"Jose","Pepe","Ambrosio","Felipe Juan Froilan de todos los Santos","Raul"};

        if (nombres[0].length()>nombres[1].length()){
            if (nombres[0].length()>nombres[2].length()){
             if   (nombres[0].length()>nombres[3].length()){
                 if (nombres[0].length()>nombres[4].length()){
                    System.out.println(nombres[0]);
                     }
                     }
                     }
        }
        if (nombres[1].length()>nombres[0].length()){
            if (nombres[1].length()>nombres[2].length()){
                if   (nombres[1].length()>nombres[3].length()){
                    if (nombres[1].length()>nombres[4].length()){
                        System.out.println(nombres[1]);
                    }
                }
            }
        }
        if (nombres[2].length()>nombres[0].length()){
            if (nombres[2].length()>nombres[1].length()){
                if   (nombres[2].length()>nombres[3].length()){
                    if (nombres[2].length()>nombres[4].length()){
                        System.out.println(nombres[2]);
                    }
                }
            }
        }
        if (nombres[3].length()>nombres[1].length()){
            if (nombres[3].length()>nombres[2].length()){
                if   (nombres[3].length()>nombres[0].length()){
                    if (nombres[3].length()>nombres[4].length()){
                        System.out.println(nombres[3]);
                    }
                }
            }
        }
        if (nombres[4].length()>nombres[1].length()){
            if (nombres[4].length()>nombres[2].length()){
                if   (nombres[4].length()>nombres[3].length()){
                    if (nombres[4].length()>nombres[0].length()){
                        System.out.println(nombres[4]);
                    }
                }
            }
        }
        }
}
