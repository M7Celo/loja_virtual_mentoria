package br.com.lojavirtualmentoria.loja_virtual_mentoria.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@FieldNameConstants

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable {

    private static final long serialVersionUID = 6396363436749148205L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    @Column(name = "id_produto")
    private Long idProduto;

    @Column(nullable = false)
    private String tipoUnidade;

    @Column(nullable = false)
    private String nomeProduto;

    @Column(columnDefinition = "text", length = 2000)
    private String descricao;

    private Double pesoProduto;

    private Double larguraProduto;

    private Double alturaProduto;

    private Double profundidadeProduto;

    private BigDecimal valorVenda = BigDecimal.ZERO;

    private Integer qtdEstoque = 0;

    private Integer qtdAlertaEstoque = 0;

    private String linkYoutube;

    private Boolean alertaQuantidadeEstoque = Boolean.FALSE;

    private Boolean produtoAtivo = Boolean.TRUE;

    private Integer qtdClique = 0;
}
