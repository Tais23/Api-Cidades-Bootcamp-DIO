package com.taissantos.cidadesapi.estados;

import com.taissantos.cidadesapi.paises.Pais;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Estado")
@Table(name = "estado")

@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})

public class Estado {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;


    @Column(name = "pais")
    private Integer countryId;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public Estado() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public List<Integer> getDdd() {
        return ddd;
    }


  public Integer getCountryId() {
      return countryId;
  }
}
