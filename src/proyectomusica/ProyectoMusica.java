/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomusica;

/**
 *
 * @author alec
 */
public class ProyectoMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //creacion de pistas
    Pista p1=new Pista(1,"El tiempo no para",311,"Bersuit","De la cabeza",2002,"Rock Nacional");
    Pista p2=new Pista(2,"Mi caramelo",290,"Bersuit","De la cabeza",2002,"Rock Nacional");
    Pista p3=new Pista(3,"Party rock anthem",408,"LMFAO","Sorry for party rocking",2011,"Electro Pop");
    Pista p4=new Pista(4,"Sorry for party rocking",421,"LMFAO","Sorry for party rocking",2011,"Electro Pop");
    Pista p5=new Pista(5,"Fix you",255,"ColdPlay","X&Y",2005,"Rock Alternativo");
    Pista p6=new Pista(6,"Speed of sun",455,"ColdPlay","X&Y",2005,"Rock Alternativo");
    Pista p7=new Pista(7,"Viva la Vida",320,"ColdPlay","Viva la Vida",2008,"Rock Alternativo");
    Pista p8=new Pista(8,"With or without you",360,"U2","The Joshua tree",1987,"Rock");
    Pista p9=new Pista(9,"Vertigo",355,"U2","How to dismantle an atomic bomb",2004,"Rock");
    Pista p10=new Pista(10,"City of blinding lights",288,"U2","How to dismantle an atomic bomb",2004,"Rock");
    Pista p11=new Pista(11,"A la luz de la luna",438,"El indio Solari","Pajaritos, bravos muchachitos",2013,"Rock nacional");
    Pista p12=new Pista(12,"Yo canibal",258,"Patricio Rey y sus redonditos de ricota","Lobo suelto, cordero atado",1993,"Rock nacional");
    //creacion de colecciones
    Coleccion clasicosDelRock=new PlayList("Clasicos del Rock");
    PlayList cr=(PlayList)clasicosDelRock;
    cr.agregar(p1);
    cr.agregar(p2);
    cr.agregar(p8);
    cr.agregar(p9);
    cr.agregar(p10);
    cr.agregar(p12);
    clasicosDelRock=cr; 
    Coleccion loMejor=new PlayList("Lo Mejor");
    PlayList lm=(PlayList)loMejor;
    lm.agregar(p3);
    lm.agregar(p4);
    lm.agregar(p7);
    lm.agregar(p12);
    loMejor=lm;
    Coleccion coldPlay=new PlayList("Cold Play");
    PlayList cp=(PlayList)coldPlay;
    cp.agregar(p5);
    cp.agregar(p6);
    cp.agregar(p7);
    coldPlay=cp;
    Coleccion elIndio=new PlayList("El Indio");
    PlayList ei=(PlayList)elIndio;
    ei.agregar(p11);
    ei.agregar(p12);
    elIndio=ei;
    //impresion clasisos de colecciones
    System.out.println(clasicosDelRock.getName()+" "+clasicosDelRock.toString());
    System.out.println(loMejor.getName()+" "+loMejor.toString());
    System.out.println(coldPlay.getName()+" "+coldPlay.toString());        
    System.out.println(elIndio.getName()+" "+elIndio.toString());
    //calculo de duracion de las colecciones
    clasicosDelRock.getDuracion();
    System.out.println("Duracion total "+clasicosDelRock.getName()+" "+clasicosDelRock.getDuracion());
    System.out.println("Duracion total "+loMejor.getName()+" "+loMejor.getDuracion());
    System.out.println("Duracion total "+coldPlay.getName()+" "+coldPlay.getDuracion());
    System.out.println("Duracion total "+elIndio.getName()+" "+elIndio.getDuracion());
    //agregar listas de reproducción a otras listas existentes
    cr.agregar(lm);//agrega a clasicos del rock, lo mejor
    cr.agregar(cp);//agrega a clasicos del rock, coldplay
    cr.agregar(ei);//agrega a clasicos del rock El Indio
    //imprime todo clasicos del rock
    System.out.println(clasicosDelRock.getName()+" "+clasicosDelRock.toString());
    //calcula nueva duración de clasicosDelRock
    System.out.println("Duracion total "+" "+clasicosDelRock.getName()+" "+clasicosDelRock.getDuracion());
    }
    
}
