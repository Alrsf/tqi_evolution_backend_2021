# tqi_evolution_backend_2021

# Repositório para avaliação do desafio TQI Evolution

## Proposta do desafio ##

Uma empresa de empréstimo precisa criar um sistema de análise de crédito para fornecer aos seus clientes as seguintes funcionalidades:
I. Cadastro de clientes
    O cliente pode cadastrar: nome, e-mail, CPF, RG, endereço completo, renda e senha.
II. Login
    A autenticação será realizada por e-mail e senha.
III. Solicitação de empréstimo
    Para solicitar um empréstimo, precisamos do valor do empréstimo, data da primeira parcela e quantidade de parcelas.
    O máximo de parcelas será 60 e a data da primeira parcela deve ser no máximo 3 meses após o dia atual.
IV. Acompanhamento das solicitações de empréstimo
    O cliente pode visualizar a lista de empréstimos solicitados por ele mesmo e também os detalhes de um de seus empréstimos.
    Na listagem, devemos retornar no mínimo o código do empréstimo, o valor e a quantidade de parcelas.
    No detalhe do empréstimo, devemos retornar: código do empréstimo, valor, quantidade de parcelas, data da primeira parcela, e-mail do cliente e renda do cliente.
    
## Desenvolvimento ##

Foi desenvolvido em Java uma API com Spring Boot, com um banco de dados H2 e com o Swagger-UI.

Após execução da aplicação, os banco de dados pode ser acessado por meio da URL: http://localhost:8080/h2-console 
e o Swagger por meio da URL: http://localhost:8080/swagger-ui/#/

## ##
