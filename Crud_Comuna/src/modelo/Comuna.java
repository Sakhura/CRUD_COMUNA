
package modelo;


public class Comuna { //inicio clase Comuna
     
  int  COM_ID;
  String COM_NOMBRE;
  boolean COM_ESTADO;

    public Comuna() {
        
        this.COM_ID = 0;
        this.COM_NOMBRE = "";
        this.COM_ESTADO = true;
    }

    public Comuna(int COM_ID, String COM_NOMBRE, boolean COM_ESTADO) {
        this.COM_ID = COM_ID;
        this.COM_NOMBRE = COM_NOMBRE;
        this.COM_ESTADO = COM_ESTADO;
    }

    public int getCOM_ID() {
        return COM_ID;
    }

    public void setCOM_ID(int COM_ID) {
        this.COM_ID = COM_ID;
    }

    public String getCOM_NOMBRE() {
        return COM_NOMBRE;
    }

    public void setCOM_NOMBRE(String COM_NOMBRE) {
        this.COM_NOMBRE = COM_NOMBRE;
    }

    public boolean isCOM_ESTADO() {
        return COM_ESTADO;
    }

    public void setCOM_ESTADO(boolean COM_ESTADO) {
        this.COM_ESTADO = COM_ESTADO;
    }
 
  
    
}//fin clase Comuna
