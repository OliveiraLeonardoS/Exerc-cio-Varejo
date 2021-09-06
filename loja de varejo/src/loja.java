public class loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendedores vendedor = new Vendedores();
		Clientes cli1 = new Clientes();
		Fornecedores forne1 = new Fornecedores();
		Produtos prod1 = new Produtos();
		Vendas vend1 = new Vendas();
		Estoque est1 = new Estoque();
		Transportadora transp1 = new Transportadora();
		
		vendedor.nomeCompleto = "Leonardo Oliveira";
		vendedor.idade = "33";
		vendedor.endereco = "Travessa Caetano Celia";
		vendedor.telefoneContato = "51 991-011-744";
		vendedor.escolaridade = "Cursando Técnico em Informatica";
		
		cli1.nome = "Alberto";
		cli1.empresa = "Varejo do Al";
		cli1.cidade = "São Paulo - SP";
		cli1.contato = "011 989 709 117";
		cli1.redesocial = "@varejodoal";
		
		forne1.nome = "Marcia Silveira";
		forne1.produto = "Panelas";
		forne1.cnpj = "98765164/0002-23";
		forne1.fornecedor = "Panelas";
		forne1.nomefantasia = "Marcia Panex";
		
		
		prod1.bazar = "Artigos de Festas";
		prod1.vestuario =  "Roupas do infantil ao adulto";
		prod1.decoracao = "Decoração para sua casa";
		prod1.flores = "Flores Artificiais para seu lar e trabalho";
		prod1.brinquedos = "Brinquedo para todas as idades";
		
		vend1.diaria = "30 itens";
		vend1.semanal = "180 itens";
		vend1.mensal = "5,400 itens";
		vend1.trimestral = "486.000,00 itens";		
		vend1.anual = "17.739,0000";
		
		est1.total = "14 mil itens";
		est1.bazar = "5 mil itens";
		est1.brinquedos = "3.800 mil itens";
		est1.vestuario = "4 mil itens";
		est1.flores = "1,200 itens";
		
		transp1.nome = "TransPack";
		transp1.cnpj = "24729000/2324-12";
		transp1.cidade = "Minas Gerais - MG";
		transp1.contato = "31 - 3691-2798";
		transp1.email = "transpack@gmail.com";
		
		System.out.printf("O Funcionário %s recebeu um pedido de orçamento do cliente %s, da empresa %s da cidade de %s. Um pedido de %s da fornecedora %s da empresa %s, Que vende diariamente %s, que tem um estoque %s, e que vai enviar este pedido pela %s da cidade de %s, com o cnpj %s e o telefone %s e email %s", vendedor.nomeCompleto, cli1.nome, cli1.empresa, cli1.cidade, forne1.produto, forne1.nome, forne1.nomefantasia, vend1.diaria, est1.total, transp1.nome, transp1.cidade, transp1.cnpj, transp1.contato, transp1.email);
		
		
		
	}

}
