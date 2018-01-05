
package ClinicaMascotas;

public class Mascotas {
    private  Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String nombrePropietario;
    private String nombreMascota;
    private Integer numeroChip;
    private Sexo sexo;
    private Integer edad;
    private String especie ;
    private String raza;
    private String dolencia;
    private String observaciones;       

    public Mascotas(Integer id, String nombrePropietario, String nombreMascota, Integer numeroChip, Sexo sexo, Integer edad, String especie, String raza, String dolencia, String observaciones) {
        this.id = id;
        this.nombrePropietario = nombrePropietario;
        this.nombreMascota = nombreMascota;
        this.numeroChip = numeroChip;
        this.sexo = sexo;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
        this.dolencia = dolencia;
        this.observaciones = observaciones;
    }

  

    public Mascotas() {
    }

    

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Integer getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(Integer numeroChip) {
        this.numeroChip = numeroChip;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    @Override
    public String toString(){
        return "Nombre Propietario: " +this.nombrePropietario+"\nNombre Mascota: "
                +this.nombreMascota+"\nNumero Chip :"+this.numeroChip+"\nSexo:"
                +sexo+"\nEdad: "+edad+"\nEspecie :"
                +this.especie+"\nRaza :"+this.raza+"\nDolencia :"+this.dolencia
                +"\nObservaciones :"+this.observaciones ;
    }
   

}
