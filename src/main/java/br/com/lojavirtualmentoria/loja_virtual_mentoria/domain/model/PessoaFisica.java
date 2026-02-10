package br.com.lojavirtualmentoria.loja_virtual_mentoria.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@FieldNameConstants

@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class PessoaFisica extends Pessoa implements Serializable {

    private static final long serialVersionUID = -5209742765126066824L;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

}
