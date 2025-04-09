package alberi;

public class Alberobinario {
    Nodo radice;

  public Alberobinario(){
    radice = null;
  }
  public void setInfo(Tipo info) {
    this.info = new Tipo(info);
  }
   public Tipo getInfo(){
    return new Tipo(info);
  }
   public void setFigliosx(Nodo sx){
    this.sx = sx;
  }
   public Nodo getFigliosx(){
    return sx;
   }
   public void setFigliodx(Nodo dx){
    this.dx = dx;
  }
   public Nodo getFigliodx(){
    return dx;
   }

   public void vistaAnticipata (Nodo p){
      if (p == null)
        return;
      esamina (p.getInfo());
      
      if (p.getFigliosx() != null)
        vistaAnticipata(p.getFigliosx());
      
        if (p.getFigliodx() != null)
      vistaAnticipata(p.getFigliodx());
   }
}