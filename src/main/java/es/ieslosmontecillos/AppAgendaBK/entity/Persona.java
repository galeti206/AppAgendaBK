package es.ieslosmontecillos.AppAgendaBK.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="PERSONA")
public class Persona implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;
    @Basic
    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;
    @Basic
    @Column(name = "TELEFONO", nullable = true, length = 15)
    private String tlf;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 30)
    private String email;
    @ManyToOne
    @JoinColumn(name = "PROVINCIA", nullable = false)
    private Provincia provincia;
    @Basic
    @Column(name = "FECHA", nullable = true)
    private Date fecha;
    @Basic
    @Column(name = "NUM_HIJOS", nullable = true)
    private short nHijos;
    @Basic
    @Column(name = "ESTADO_CIVIL", nullable = true, length = 1)
    private String estCivil;
    @Basic
    @Column(name = "SALARIO", nullable = true, precision = 9, scale = 2)
    private BigDecimal salario;
    @Basic
    @Column(name = "JUBILADO", nullable = true)
    private short jubilado;
    @Basic
    @Column(name = "FOTO", nullable = true, length = 30)
    private String foto;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return tlf;
    }
    public void setTelefono(String tlf) {
        this.tlf = tlf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public Date getDate() {
        return fecha;
    }
    public void setDate(Date fecha) {
        this.fecha = fecha;
    }
    public Short getNHijos() {
        return nHijos;
    }
    public void setNHijos(Short nHijos) {
        this.nHijos = nHijos;
    }
    public String getEstCivil() {
        return estCivil;
    }
    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public Short getJubilado() {
        return jubilado;
    }
    public void setJubilado(Short jubilado) {
        this.jubilado = jubilado;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return nHijos == persona.nHijos && jubilado == persona.jubilado
                && Objects.equals(id, persona.id) && Objects.equals(nombre, persona.nombre)
                && Objects.equals(apellidos, persona.apellidos) && Objects.equals(tlf, persona.tlf)
                && Objects.equals(email, persona.email) && Objects.equals(provincia, persona.provincia)
                && Objects.equals(fecha, persona.fecha) && Objects.equals(estCivil, persona.estCivil)
                && Objects.equals(salario, persona.salario) && Objects.equals(foto, persona.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, tlf, email, provincia, fecha, nHijos, estCivil, salario, jubilado, foto);
    }
}
