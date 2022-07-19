
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "aeroportos_2014")
public class Aeroporto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "gid")
    private Integer gid;
    
    @Column(name = "objectid_1")
    private double objectid_1;
    
    @Column(name = "municdv")
    private Integer municdv;
    
    @Column(name = "uf")
    private Integer uf;
    
    @Column(name = "nome_uf")
    private String nome_uf;
    
    @Column(name = "nome_regia")
    private String nome_regia; 
    
    @Column(name = "municipio")
    private String municipio; 
    
    @Column(name = "pax2010")
    private double pax2010; 
    
    @Column(name = "internacio")
    private double internacio;
    
    @Column(name = "geom")
    private Geometry geom;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public double getObjectid_1() {
        return objectid_1;
    }

    public void setObjectid_1(double objectid_1) {
        this.objectid_1 = objectid_1;
    }

    public Integer getMunicdv() {
        return municdv;
    }

    public void setMunicdv(Integer municdv) {
        this.municdv = municdv;
    }

    public Integer getUf() {
        return uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public String getNome_uf() {
        return nome_uf;
    }

    public void setNome_uf(String nome_uf) {
        this.nome_uf = nome_uf;
    }

    public String getNome_regia() {
        return nome_regia;
    }

    public void setNome_regia(String nome_regia) {
        this.nome_regia = nome_regia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getPax2010() {
        return pax2010;
    }

    public void setPax2010(double pax2010) {
        this.pax2010 = pax2010;
    }

    public double getInternacio() {
        return internacio;
    }

    public void setInternacio(double internacio) {
        this.internacio = internacio;
    }

    public Geometry getGeom() {
        return geom;
    }

    public void setGeom(Geometry geom) {
        this.geom = geom;
    }

    @Override
    public String toString() {
        return "Aeroporto{" + "gid=" + gid + ", objectid_1=" + objectid_1 + ", municdv=" + municdv + ", uf=" + uf + ", nome_uf=" + nome_uf + ", nome_regia=" + nome_regia + ", municipio=" + municipio + ", pax2010=" + pax2010 + ", internacio=" + internacio + ", geom=" + geom + '}';
    }

}
