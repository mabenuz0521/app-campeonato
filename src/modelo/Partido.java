package modelo;
// Generated 11/06/2021 09:40:19 AM by Hibernate Tools 4.3.1



/**
 * Partido generated by hbm2java
 */
public class Partido  implements java.io.Serializable {


     private Integer id;
     private Equipo equipoByEquipo2;
     private Equipo equipoByEquipo1;
     private int goles1;
     private int goles2;
     private int rojas1;
     private int amarillas1;
     private int rojas2;
     private int amarillas2;
     private int finalizar;

    public Partido() {
    }

    public Partido(Equipo equipoByEquipo2, Equipo equipoByEquipo1, int goles1, int goles2, int rojas1, int amarillas1, int rojas2, int amarillas2, int finalizar) {
       this.equipoByEquipo2 = equipoByEquipo2;
       this.equipoByEquipo1 = equipoByEquipo1;
       this.goles1 = goles1;
       this.goles2 = goles2;
       this.rojas1 = rojas1;
       this.amarillas1 = amarillas1;
       this.rojas2 = rojas2;
       this.amarillas2 = amarillas2;
       this.finalizar = finalizar;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Equipo getEquipoByEquipo2() {
        return this.equipoByEquipo2;
    }
    
    public void setEquipoByEquipo2(Equipo equipoByEquipo2) {
        this.equipoByEquipo2 = equipoByEquipo2;
    }
    public Equipo getEquipoByEquipo1() {
        return this.equipoByEquipo1;
    }
    
    public void setEquipoByEquipo1(Equipo equipoByEquipo1) {
        this.equipoByEquipo1 = equipoByEquipo1;
    }
    public int getGoles1() {
        return this.goles1;
    }
    
    public void setGoles1(int goles1) {
        this.goles1 = goles1;
    }
    public int getGoles2() {
        return this.goles2;
    }
    
    public void setGoles2(int goles2) {
        this.goles2 = goles2;
    }
    public int getRojas1() {
        return this.rojas1;
    }
    
    public void setRojas1(int rojas1) {
        this.rojas1 = rojas1;
    }
    public int getAmarillas1() {
        return this.amarillas1;
    }
    
    public void setAmarillas1(int amarillas1) {
        this.amarillas1 = amarillas1;
    }
    public int getRojas2() {
        return this.rojas2;
    }
    
    public void setRojas2(int rojas2) {
        this.rojas2 = rojas2;
    }
    public int getAmarillas2() {
        return this.amarillas2;
    }
    
    public void setAmarillas2(int amarillas2) {
        this.amarillas2 = amarillas2;
    }
    public int getFinalizar() {
        return this.finalizar;
    }
    
    public void setFinalizar(int finalizar) {
        this.finalizar = finalizar;
    }




}


