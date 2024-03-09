# Salsa
Teste de Automação de API com RestAssured

Projeto com 6 script de testes para testar os cenarios:

1 * Acessar API sem Token
2 * Verificar Item no Body
3 * Verificar Item em Lista
4 * Verificar se login é invalido
5 * Verificar se usuario é criado
6 * Validar com Pojo



1 - Eu como usuário quero acessar a página sem nenhuma autenticação.

•	Dado que eu tenho o Eclipse e Maven instalados
•	Quando eu acesso a página com o protocolo get
•	Então eu devo ter retorno da requisição sucesso (200).

2 – Eu como usuário quero acessar a página e localizar meu personagem e espécie
•	Dado que eu tenho o Eclipse e Maven instalados
•	Quando eu acesso a página com o protocolo get
•	Então eu devo visualizar o Id do personagem 
•	E o nome do personagem
•	E a espécie do personagem

3 – Eu como usuário quero verificar lista de localização do personagem

•	Dado que eu tenho o Eclipse e Maven instalados
•	Quando eu acesso a página com o protocolo get
•	Então eu devo visualizar 7 páginas
•	E devo filtrar por localização
•	E validar se o filtro da lista está correto

4 – Eu como usuário quero verificar se o usuário é invalido

•	Dado que eu tenho o Eclipse e Maven instalados
•	Quando eu acesso a página com o protocolo get
•	Então eu devo ter retorno da requisição usuário inexistente (404)

5 – Eu como usuário quero fazer login no sistema
•	Dado que eu tenho o Eclipse e Maven instalados
•	Quando eu acesso a página com o protocolo get
•	Então eu devo retorno da requisição com sucesso
•	E validar se o usuário existe 

6 – Script Pojo 









Criado e desenvolvido por Edinéa Conceição
