package br.gov.sp.etec.api_produto.dto;

public class ProdutoDTO {
	private String nomeProduto;
	private String descricaoProduto;
	private double precoProduto;
	private int quantidadeProduto;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantiadadeProduto) {
		this.quantidadeProduto = quantiadadeProduto;
	}
	
	

}
