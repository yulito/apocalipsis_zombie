/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author yulia
 */
public class Dialogos {
    
    Scanner scanner = new Scanner(System.in);
    String op = "";
    //*******historia lineal
    final String lineal1="Es de mañana. Abres tus ojos y ves que son las 10:00 AM...";
    final String lineal1_1="Apresurate en levantarte. LLegaras tarde al trabajo...";
    final String lineal1_2="Debes decidir si \n"
            + " (a)Tomar desayuno, ducharte y salir... \n"
            + " (b)Salir de casa rapido y comprar algo para comer en el camino...";
            //alterno1 o lineal2
        
    final String lineal2="Sales de casa y corres a la parada de bus..."; 
    final String lineal2_1="El bus se acerca... lo haces parar y subes...";
    final String lineal2_2="Una vez sentado, miras por la ventana y ...";
    final String lineal2_3="Vez como el caos se apodera del lugar...\n "
            + "ves gente corriendo, ensangrentada... gritos de dolor...";
    final String lineal2_4="El bus frena por un atasco en la vía... \n"
            + "El chofer decide abrir las puertas para huir... \n"
            + "debes tomar una decisión rapida: \n"
            + " (a)Salir huyendo como el chofer y todas las pasajeros del bus. \n"
            + " (b)Permanecer en el bus y cerrar las puertas.";
    //fallo2 o lineal3
    
    final String lineal3="Te acercar al asiento del chofer para buscar un boton, \n"
            + "palanca o algo que cierre las puertas del bus... pero no encuentras nada \n"
            + "salvo un bate de baseball que usaba el chofer para defenderse de delincuentes.";
    final String lineal3_1="Depronto un sujeto con la cara deforme sube por la puerta de atras del bus. \n"
            + "te das cuenta que no es alguien normal ya que emana un halo de terror y distorsión en su mirada...";
    final String lineal3_2="El sujeto te mira y corre violentamente hacia ti con la intención de atacarte...\n"
            + " (a)Puedes defenderte con el bate de baseball \n"
            + " (b)o prefieres saltar por la ventana del chofer a la calle y huír.";
    //lineal4 o alterno2
    
    final String lineal4="...Agarras el bate y comienzas a enfrentarlo...";
    final String lineal4_1="Lo golpeas fuerte en las piernas y cabeza pero no logras aturdirlo...";
    final String lineal4_2="  (a)¿Decides golpearlo hasta acabar con el? \n"
            + " (b)¿Prefieres aprovechar que esta en el suelo para arrastrarlo hacia afuera del bus?";
    //fallo3 o lineal5
    
    final String lineal5="...Logras empujarlo hacia la calle..., fuerzas la puerta del bus para cerrarla..., \n"
            + "buscas entre las cosas del chofer algo que te sirva para defenderte y...";
    final String lineal5_1="Encuentras las llaves tiradas del bus...";
    final String lineal5_2=" (a)...enciendes el bus y lo hechas a andas rapidamente. \n"
            + " (b)...enciendes la radio para escuchar las noticias y luego enciendes el bus.";
    //alterno3 o lineal6
    
    final String lineal6="Haces contacto con las llaves, prendes la radio y escuchas que anuncian \n"
            + "de un posible virus Zombie que ataca la ciudad..."; 
    final String lineal6_1="Entre la confusión de la noticia y el terror vivido decides... \n"
            + " (a)...enciender el bus y salir velozmente. \n"
            + " (b)revizar un mapa y ver una ruta directa hacia la carretera.";
    //alterno3 o lineal7
    
    final String lineal7="...Mientras buscas en el mapa, escuchas por las noticias que estan evacuando \n"
            + "y reguardando a la poblacion en 2 barcos ubicado uno en la costa sur y otro en la costa norte... \n"
            + " (a)...Te diriges a la costa sur. \n"
            + " (b)...Te diriges a la costa norte."; 
        //lineal8 o alterno4
    
    final String lineal8="Sigues por la ruta sur cuando ves uno de los barcos..."; 
    final String lineal8_1="pero una orda de Zombies obstaculiza el paso... y decides \n"
            + " (a)regresar y tomar la ruta norte. \n"
            + " (b)arriesgarte y arrasar con todo.";
    //fallo6 o fin
    
    //******partes alternativas de la historia
    final String alterno1="...Bien, decides desayunar para cargar energías y ducharte para ir fresco y arreglado al trabajo..."; 
    final String alterno1_1 = "Abres la puerta de la casa y corres a tomar el bus...";
    final String alterno1_2 = "Depronto oyes un ruido que parecen ser gritos de personas que \n"
            + "que provienen de la calle paralela a tu ubicación... \n"
            + " (a)¿Quieres ir a ver que pasa? \n"
            + " (b)¿Prefieres tomar el bus para el trabajo?";
    //fallo1 o lineal2
    
    final String alterno2="Antes de saltar por la ventana miras hacia afuera y ves que la situación \n"
            + "es peor, por lo que tienes 2 opciones: \n"
            + " (a)volver a enfrentarte con el sujeto, acabar con el y cerrar las puertas del bus... \n"
            + " (b)o aprovechar que tiene las piernas rotas para empujarlo afuera del bus y cerrar las puertas?"; 
    //fallo3 o lineal5
    
    final String alterno3="Te habres paso a todo velocidad en el bus sin importar quien se atraviese...";
    final String alterno3_1="mientras conducer se te ocurre... \n"
            + " (a)revizar un mapa que tienes al costado del asiento. \n"
            + " (b)encender la radio del bus para saber que esta sucediendo.";
    //lineal7 o fallo4
    
    final String alterno4="Sigues por la ruta norte y te encuentras con \n"
            + "la carretera atascada por un monton de vehiculos..."; 
    final String alterno4_1="decides... \n"
            + " (a)Seguir a pie. \n"
            + " (b)regresar por donde venias.";
    //fallo5 o fallo6
    
    //******decisiones malas de la historia
    final String fallo1="La curiosidad fue más fuerte por lo que apuras el paso hacia la calle \n"
            + "donde se escuchan los gritos...";
    final String fallo1_1="...depronto sientes que algo te muerde en el cuello, las piernas,\n"
            + "los brazos...Partes de tu cuerpo desprendiendose...";
    
    final String fallo2="Sales por la puerta trasera del bus y corres buscando un refugio. \n"
            + "No sabes lo que ocurre pero sabes que no estas a salvo en la calle...";
    final String fallo2_1="Entre la confusión y el caos un vehiculo aparece de la nada y te atropella...";
    
    final String fallo3="...Entonces sigues golpeandolo con el bate... \n"
            + "Depronto el bus comienza a llenarse de estos seres deformes.";
    final String fallo3_1="Todos se abalanzan sobre ti... aunque luches no puedes contra ellos \n"
            + "y te das por vencido...";
    
    final String fallo4="Tus oidos no dan credito sobre la noticia de un posible virus Zombie";
    final String fallo4_1="Aturdido por la noticia te descuidas y chocas contra un poste. \n"
            + " Este cae sobre ti...";
 
    final String fallo5="Bajas del bus y avanzas entre los vehiculos. Depronto siente una mordida en el cuello...";
    
    final String fallo6="Al regresar a toda velocidad chocas con un borde y caes por un precipicio...";
    
    final String fallox="+++++++++++++ \n"
            + "HAS MUERTO!! \n"
            + "+++++++++++++";
    
    //---- Escenas
    public void inicio() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(2000);
        System.out.println("...");
        Thread.sleep(2000);
        System.out.println("...");
        Thread.sleep(1000);
        this.escena1();
    }
    public void error(){
        System.out.println("");
        System.out.println("++++++++++++++++");
        System.out.println("ERROR DE DATO...");
        System.out.println("++++++++++++++++");
        System.out.println("");
    }
    public void escena1() throws InterruptedException{        
        System.out.println(lineal1);
        Thread.sleep(3000);
        System.out.println(lineal1_1);
        Thread.sleep(4000);
        System.out.println(lineal1_2);
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim(); 
        if(op.equals("a")){
            this.escenaAlt1();
        }else if(op.equals("b")){
            this.escena2();
        }else{
            this.error();
            this.inicio();
        }
    }
    public void escena2() throws InterruptedException{
        System.out.println("");
        System.out.println(this.lineal2);
        Thread.sleep(3000);
        System.out.println(this.lineal2_1);
        Thread.sleep(3000);
        System.out.println(this.lineal2_2);
        Thread.sleep(3000);
        System.out.println(this.lineal2_3);
        Thread.sleep(4000);
        System.out.println(this.lineal2_4);        
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenafallo2();
        }else if(op.equals("b")){
            this.escena3();
        }else{
            this.error();
            this.escena2();
        }
    }
    public void escena3() throws InterruptedException{
        System.out.println("");
        System.out.println(this.lineal3);
        Thread.sleep(4000);
        System.out.println(this.lineal3_1);
        Thread.sleep(4000);
        System.out.println(this.lineal3_2);        
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escena4();
        }else if(op.equals("b")){
            this.escenaAlt2();
        }else{
            this.error();
            this.escena3();
        }
    }
    public void escena4() throws InterruptedException{
        System.out.println("");
        System.out.println(this.lineal4);
        Thread.sleep(3000);
        System.out.println(this.lineal4_1);
        Thread.sleep(3000);
        System.out.println(this.lineal4_2);
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenafallo3();
        }else if(op.equals("b")){
            this.escena5();
        }else{
            this.error();
            this.escena4();
        }
    }
    public void escena5() throws InterruptedException{
        System.out.println("");
        System.out.println(this.lineal5);
        Thread.sleep(3000);
        System.out.println(this.lineal5_1);
        Thread.sleep(3000);
        System.out.println(this.lineal5_2);        
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenaAlt3();
        }else if(op.equals("b")){
            this.escena6();
        }else{
            this.error();
            this.escena5();
        }
    }
    public void escena6() throws InterruptedException{
        System.out.println("");
        System.out.println(this.lineal6);
        Thread.sleep(3000);
        System.out.println(this.lineal6_1);
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenaAlt3();
        }else if(op.equals("b")){
            this.escena7();
        }else{
            this.error();
            this.escena6();
        }
    }
    public void escena7() throws InterruptedException{
        System.out.println("");
        System.out.println(this.lineal7);                
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escena8();
        }else if(op.equals("b")){
            this.escenaAlt4();
        }else{
            this.error();
            this.escena7();
        }
    }
    public void escena8() throws InterruptedException{
        System.out.println("");
        System.out.println(this.lineal8);
        Thread.sleep(4000);
        System.out.println(this.lineal8_1);
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenafallo6();
        }else if(op.equals("b")){
            this.escenafinal();
        }else{
            this.error();
            this.escena8();
        }
    }
    public void escenafinal() throws InterruptedException{
        System.out.println("Arrasas con todos los Zombies... \n"
                + "llegas a la costa...");
        Thread.sleep(3000);
        System.out.println("Te bajas del bus...");
        Thread.sleep(3000);
        System.out.println("corres esquivando a los Zombies que se atravienzan...");
        Thread.sleep(3000);
        System.out.println("llegas al puente y un soldado te da la mano...");
        Thread.sleep(4000);
        System.out.println("Estas a SALVO!!!");
        Thread.sleep(2000);
        System.out.println("000000000000000000");
        System.out.println("FIN.");
        System.out.println("000000000000000000");
        System.out.println("");
    }
    //escenas alternativas
    public void escenaAlt1() throws InterruptedException{
        System.out.println("");
        System.out.println(this.alterno1);
        Thread.sleep(3000);
        System.out.println(this.alterno1_1);
        Thread.sleep(3000);
        System.out.println(this.alterno1_2);        
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenafallo1();
        }else if(op.equals("b")){
            this.escena2();
        }else{
            this.error();
            this.escenaAlt1();
        }
    }
    public void escenaAlt2() throws InterruptedException{
        System.out.println("");
        System.out.println(this.alterno2);
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenafallo3();
        }else if(op.equals("b")){
            this.escena5();
        }else{
            this.error();
            this.escenaAlt2();
        }
    }
    public void escenaAlt3() throws InterruptedException{
        System.out.println("");
        System.out.println(this.alterno3);
        Thread.sleep(3000);
        System.out.println(this.alterno3_1);
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escena7();
        }else if(op.equals("b")){
            this.escenafallo4();
        }else{
            this.error();
            this.escenaAlt3();
        }
    }
    public void escenaAlt4() throws InterruptedException{
        System.out.println("");
        System.out.println(this.alterno4);
        Thread.sleep(4000);
        System.out.println(this.alterno4_1);
        //----
        System.out.print(">");
        op = scanner.nextLine().toLowerCase().trim();
        if(op.equals("a")){
            this.escenafallo5();
        }else if(op.equals("b")){
            this.escenafallo6();
        }else{
            this.error();
            this.escenaAlt4();
        }
    }
    
    //intentos fallidos
    public void escenafallo1() throws InterruptedException{
        System.out.println("");
        System.out.println(this.fallo1);
        Thread.sleep(4000);
        System.out.println(this.fallo1_1);
        Thread.sleep(4000);
        System.out.println(this.fallox);
        Thread.sleep(4000);
    }
    public void escenafallo2() throws InterruptedException{
        System.out.println("");
        System.out.println(this.fallo2);
        Thread.sleep(4000);
        System.out.println(this.fallo2_1);
        Thread.sleep(4000);
        System.out.println(this.fallox);
        Thread.sleep(4000);
    }
    public void escenafallo3() throws InterruptedException{
        System.out.println("");
        System.out.println(this.fallo3);
        Thread.sleep(4000);
        System.out.println(this.fallo3_1);
        Thread.sleep(4000);
        System.out.println(this.fallox);
        Thread.sleep(4000);
    }
    public void escenafallo4() throws InterruptedException{
        System.out.println("");
        System.out.println(this.fallo4);
        Thread.sleep(4000);
        System.out.println(this.fallo4_1);
        System.out.println(this.fallox);
        Thread.sleep(4000);
    }
    public void escenafallo5() throws InterruptedException{
        System.out.println("");
        System.out.println(this.fallo5);
        Thread.sleep(4000);
        System.out.println(this.fallox);
        Thread.sleep(4000);
    }
    public void escenafallo6() throws InterruptedException{
        System.out.println("");
        System.out.println(this.fallo6);
        Thread.sleep(4000);
        System.out.println(this.fallox);
        Thread.sleep(4000);
    }
}
