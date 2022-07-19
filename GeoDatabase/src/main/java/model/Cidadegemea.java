package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "cidades_gemeas_2014")

public class Cidadegemea {

        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    
    @Column(name = "objectid_1")
    private Integer objectid_1;
    
    @Column(name = "municdv")
    private String municdv;
    
    @Column(name = "uf")
    private String uf;
    
    @Column(name = "nome_uf")
    private String nome_uf;
    
    @Column(name = "municipio")
    private String municipio;
    
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public Integer getObjectid_1() {
        return objectid_1;
    }

    public void setObjectid_1(Integer objectid_1) {
        this.objectid_1 = objectid_1;
    }

    public String getMunicdv() {
        return municdv;
    }

    public void setMunicdv(String municdv) {
        this.municdv = municdv;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome_uf() {
        return nome_uf;
    }

    public void setNome_uf(String nome_uf) {
        this.nome_uf = nome_uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Cidadegemea{" + "gid=" + gid + ", objectid_1=" + objectid_1 + ", municdv=" + municdv + ", uf=" + uf + ", nome_uf=" + nome_uf + ", municipio=" + municipio + ", geometria=" + geometria + '}';
    }
    
    
    
}
