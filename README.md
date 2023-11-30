# Mercado-inclusivo

Projeto de Listagem de Empregos
Este é um projeto simples de listagem de empregos, onde os usuários podem visualizar diferentes oportunidades de emprego. O projeto é construído utilizando Java, Spring Boot, e H2 Database para armazenamento temporário dos dados.

# Funcionalidades
Listagem de Empregos: Os usuários podem acessar a rota /jobs para visualizar uma lista de oportunidades de emprego disponíveis.

# Tecnologias Utilizadas
Java: Linguagem de programação principal.
Spring Boot: Framework para desenvolvimento de aplicativos Java.
H2 Database: Banco de dados em memória para armazenamento temporário.
Maven: Gerenciador de dependências.

# Estrutura do Projeto
Entities: Contém a definição da entidade Jobs, que representa um emprego.
Repositories: Contém o repositório JobRepository para interação com o banco de dados.
DTOs: O pacote dtos contém o objeto de transferência de dados JobsDto, utilizado para representar os empregos de forma simplificada.
Service: JobsService contém a lógica de negócios para manipular empregos.
Controller: JobController gerencia as requisições HTTP relacionadas aos empregos.

# Configuração do Banco de Dados
O projeto está configurado para utilizar um banco de dados H2 em memória.
As configurações do banco de dados podem ser encontradas no arquivo application.properties.

# Instruções para Execução
Clone o repositório: git clone <URL do Repositório>
Abra o projeto em sua IDE favorita.
Execute a aplicação Spring Boot.

# Instruções para Teste
Após a execução da aplicação, acesse http://localhost:8080/jobs para visualizar a lista de empregos.
Dados de Exemplo
Foram inseridos alguns dados de exemplo no arquivo data.sql para preencher o banco de dados H2 durante a inicialização.

# Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) e pull requests para melhorar este projeto
