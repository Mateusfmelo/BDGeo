package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "hidrovia_linha_2005")

public class Hidrovia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    
    @Column(name = "mslink")
    private Integer mslink;

    @Column(name = "rio_associ")
    private String rio_associ;

    @Column(name = "nome_hidro")
    private String nome_hidro;
    
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getMslink() {
        return mslink;
    }

    public void setMslink(Integer mslink) {
        this.mslink = mslink;
    }

    public String getRio_associ() {
        return rio_associ;
    }

    public void setRio_associ(String rio_associ) {
        this.rio_associ = rio_associ;
    }

    public String getNome_hidro() {
        return nome_hidro;
    }

    public void setNome_hidro(String nome_hidro) {
        this.nome_hidro = nome_hidro;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Hidrovia{" + "gid=" + gid + ", mslink=" + mslink + ", rio_associ=" + rio_associ + ", nome_hidro=" + nome_hidro + ", geometria=" + geometria + '}';
    }
    
    
    
}
