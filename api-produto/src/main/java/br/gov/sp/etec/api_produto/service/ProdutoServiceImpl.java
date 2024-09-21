package br.gov.sp.etec.api_produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.api_produto.dto.ProdutoDTO;
import br.gov.sp.etec.api_produto.entity.ProdutoEntity;
import br.gov.sp.etec.api_produto.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	ProdutoRepository produtoRepository;
	
	
	@Override
	public ProdutoEntity cadastrar(ProdutoDTO produto) {
		ProdutoEntity entidade = new ProdutoEntity();
		entidade.setNomeProduto(produto.getNomeProduto());
		entidade.setDescricaoProduto(produto.getDescricaoProduto());
		entidade.setPrecoProduto(produto.getPrecoProduto());
		entidade.setQuantidadeProduto(produto.getQuantidadeProduto());
		
		return produtoRepository.save(entidade);
		
		
	}

	
}
