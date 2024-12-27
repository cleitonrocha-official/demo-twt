package br.com.twt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTwtApplication.class, args);
	}
	
//	
//	Desafio: API de Gerenciamento de Benefícios
//	1. Introdução
//	O objetivo deste desafio é criar uma API REST utilizando Spring Boot que permita gerenciar
//	benefícios. A aplicação deve ser simples, mas funcional, com endpoints que possibilitem
//	criar, listar, ativar, desativar e excluir benefícios. O projeto utilizará Lombok para reduzir
//	código boilerplate e H2 como banco de dados em memória para facilitar os testes. Além
//	disso, serão implementados testes automatizados para validar o funcionamento dos
//	endpoints.
//	2. Configuração Inicial
//	1. Dependências Necessárias:
//	○ Spring Web: Para criar a API REST.
//	○ Spring Data JPA: Para persistência no banco de dados.
//	○ H2 Database: Banco de dados em memória para testes.
//	○ Lombok: Para simplificar o código com anotações como @Data e
//	@NoArgsConstructor.
//	○ Spring Boot Starter Test: Para criar testes automatizados com JUnit e
//	MockMvc.
//	2. Configuração do Banco H2:
//	○ Utilize o banco em memória com configurações básicas para
//	desenvolvimento rápido.
//	○ Permita acesso ao console do H2 em
//	http://localhost:8080/h2-console.
//	3. Entidade Benefit
//	A entidade Benefit será o modelo principal da aplicação, representando um benefício. Ela
//	deve conter os seguintes atributos:
//	● id (Long): Identificador único gerado automaticamente.
//	● name (String): Nome do benefício.
//	● description (String): Descrição do benefício (opcional).
//	● isActive (boolean): Indica se o benefício está ativo (valor padrão: true).
//	4. Repositório BenefitRepository
//	Crie um repositório que será responsável por realizar as operações básicas de persistência
//	(CRUD). Este repositório deve estender a interface do Spring Data JPA (JpaRepository).
//	5. Controlador BenefitController
//	Implemente um controlador REST que exponha os seguintes endpoints:
//	1. GET /benefits
//	○ Objetivo: Listar todos os benefícios cadastrados.
//	○ Resposta: Uma lista com os benefícios, contendo seus detalhes.
//	2. POST /benefits
//	○ Objetivo: Adicionar um novo benefício.
//	○ Entrada: Um JSON com os dados do benefício (name e description).
//	○ Resposta: O benefício criado com seu id.
//	3. PUT /benefits/{id}/deactivate
//	○ Objetivo: Marcar um benefício como inativo.
//	○ Entrada: O id do benefício na URL.
//	○ Resposta: O benefício atualizado com isActive igual a false.
//	4. PUT /benefits/{id}/activate
//	○ Objetivo: Marcar um benefício como ativo novamente.
//	○ Entrada: O id do benefício na URL.
//	○ Resposta: O benefício atualizado com isActive igual a true.
//	5. DELETE /benefits/{id}
//	○ Objetivo: Remover um benefício do sistema.
//	○ Entrada: O id do benefício na URL.
//	○ Resposta: Sem conteúdo (204 No Content).
//	6. Testando o Projeto
//	A aplicação deve incluir testes automatizados para garantir o funcionamento correto de
//	cada endpoint. Utilize JUnit e MockMvc para criar os testes.
//	Objetivo dos Testes
//	● Validar que os endpoints retornam as respostas esperadas.
//	● Garantir que as regras de negócio sejam respeitadas.
//	● Simular cenários de erro e confirmar o tratamento adequado.
//	7. Extensões (Opcional)
//	● Adicione validações aos campos para garantir integridade dos dados, como:
//	○ Campo name:
//	■ Não pode ser nulo ou vazio.
//	■ Deve ter entre 3 e 100 caracteres.
//	○ Campo description:
//	■ Não pode exceder 255 caracteres, caso fornecido.
//	● Implemente paginação e ordenação na listagem de benefícios.
//	● Adicione métricas básicas de monitoramento utilizando ferramentas como Spring
//	Actuator.

}
