# Atividade Individual Avaliativa 1 - POO-III

O seguinte repositório contem o código fonte referente a atividade "Padrões de Projeto Factory, DAO e Criação de método de Busca de Aluno". <br/>
Originalmente, o projeto foi realizado com a IDE Apache Netbeans o gerenciador de dependências Maven, disponível no seguinte repositório: <a href="https://github.com/JGMelon22/AVA1-POO3">AVA1-POO3</a>

### 📝 Proposta da atividade
> Em um aplicativo com persistência de dados geralmente é preciso aplicar padrões de projeto Factory e DAO para desenvolver funcionalidades de criação, leitura, atualização e remoção de itens do banco de dados. Um dos métodos mais importantes nesse tipo de aplicativo é a busca de registros a partir de um conjunto de parâmetros de consulta.
>
> Na classe AlunoDAO explanada nesta unidade foram desenvolvidas algumas funcionalidades de listagem de informações, inclusão e remoção de registros, mas ainda não foi implementado um método de busca de um aluno a partir de sua matrícula.
>
> Imagine a seguinte situação: um usuário precisa usar o aplicativo para buscar informações sobre um determinado aluno e as informações estão armazenadas no banco de dados. A interface do aplicativo solicita que o professor entre com o código da matrícula para utilizar como índice de consulta na base de dados e retorna as informações desejadas sobre o aluno.
>
> No desenvolvimento de sistemas computacionais com acesso a banco dados é recomendável a utilização de padrões de projeto específicos para facilitar a manutenção do código, diminuindo o acoplamento e aumentando a coesão.
>
> a) Cite as características e vantagens do modelo de projeto Factory.  
> b) Cite as características e vantagens do modelo de projeto DAO.  
> c) Crie um método responsável por realizar a busca de um aluno específico no banco de dados usando a matrícula como parâmetro de entrada e retornando as informações sobre o aluno.  
> d) Implemente o tratamento de exceção no método de busca de aluno.  
> e) Implemente um teste de funcionamento do método de busca de aluno.

## 🧰 Tecnologias utilizadas

- OpenJDK 21 <br/>
- IntelliJ Community <br/>
- MySQL <br/>

## 🚧 Como executar?

1. Clone o projeto
3. Inicie o servidor do banco de dados MySQL e execute o script disponível no diretório `/SQL`
4. Ajuste a string de conexão na classe `ConnectionFactory` de acordo com as credenciais e rota de seu SGBD
5. Execute o projeto