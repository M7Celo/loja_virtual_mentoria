package br.com.lojavirtualmentoria.loja_virtual_mentoria.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@FieldNameConstants

@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class PessoaJuridica extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1396720130360372518L;

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String inscricaoEstadual;

    @Column(nullable = false)
    private String inscricaoMunicipal;

    @Column(nullable = false)
    private String nomeFantasia;

    @Column(nullable = false)
    private String razaoSocial;

    @Column(nullable = false)
    private String categoria;

}
