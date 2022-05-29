package br.com.lucasrocha.produtos.DAO;

import br.com.lucasrocha.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoDAO extends JpaRepository<Produto, Long> {
    Produto findById(long id);

}
