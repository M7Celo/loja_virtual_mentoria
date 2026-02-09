package br.com.lojavirtualmentoria.loja_virtual_mentoria.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldNameConstants

@Entity
@Table(name = "marca_produto")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
public class MarcaProduto implements Serializable {

    private static final long serialVersionUID = -1118462069484935176L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private Long idMarcaProduto;

    @Column(nullable = false)
    private String nomeDescricao;

}
