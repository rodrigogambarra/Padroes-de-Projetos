<h1 align="center">Sistema que simula operações financeiras de uma loja utilizando alguns padrões de projetos</h1>
<p align="center">Aplicando padrões de projetos descritos no livro *"Gang of Four"*</p>

---

**<p align="center">Sumário:</p>**
<p align="center">
<a href="#sobre">Sobre</a> |
<a href="#funcionalidades">Funcionalidades</a> |
<a href="#tecnologias">Tecnologias</a> |
<a href="#serviços-usados">Serviços usados</a> |
<a href="#imagens">Imagens</a> |
<a href="#como-usar">Como usar</a> |
<a href="#pré-requisitos">Pré-requisitos</a> |
<a href="#links">Links</a> |
<a href="#autor">Autor</a></p>



## Sobre
Esse projeto foi desenvolvido para praticar a utilização dos principais padrões de projetos descritos no livro *"Gang of Four"* que descreve um total de 22 padrões de projetos com a finalidade de solucionar problemas comuns em projeto de software.


## Funcionalidades e descrição dos padrões utilizados

✅ Criar orçamentos contendo valor e quantidade de ítens;

✅ Calcular diferentes impostos incididos aos orçamentos; (Para essa funcionalidade foi utilizado o padrão *Strategy* Também conhecido como: Estratégia)

✅ Calcular diferentes descontos para cada tipo de orçamento, dependendo do valor ou do número de ítens; (Para essa funcionalidade foi utilizado o padrão *Chain of Responsibility* Também conhecido como: Corrente de responsabilidade - exemplificado pela Classe CalculadoraDeDescontos)

✅ Criados descontos por meio da abstração de Polimorfismo isolando as regras de negócios em classes filhas e os testes condicionais na classe mãe: Desconto (Implementação do padrão de projetos *Template Method* Também conhecido como: Método padrão)

✅ Gerenciar diferentes estados para cada tipo de orçamento, determinando a transitividade entre os estados; (Para essa funcionalidade foi utilizado o padrão *State* Também conhecido como: Estado)

✅ Criar pedidos contendo nome do cliente, valor do orçamento e a quantidade de ítens.

✅ Simulação da ação enviar pedido por e-mail (Após a criação do pedido)

✅ Simulação da ação cadastra pedido no banco (Após a criação do pedido)

✅ A interface do sistema simulada pela classe main *TestesPedidos* solicita execução das acões às classes intermediárias: *GeraPedido* e *GeraPedidoHandler* (Implementação do padrão de projeto *Command*)

✅ A classe *GeraPedidoHandler* dispara o método "executar" para as ações serem feitas. (Implementação do padrão de projetos *Observer*)


## Tecnologias utilizadas
* Java 20

## Serviços usados
* Intellij (Idea)
* GitHub


## Imagens


## Como usar


## Pré requisitos
Java devidamente instalado

## Links
* Repositório: https://github.com/rodrigogambarra/OrcamentosApp
* Deploy: https://portalcondominio.herokuapp.com/
* Vídeo explicativo e demonstração do projeto em execução: https://youtu.be/KP0D71ph61M
* Segundo vídeo explicativo e demonstração do projeto em execução: https://www.youtube.com/watch?v=V3g5KyKVJFo&list=PLO7K0b9tHLUuPh_KBSlN4elpfwOYwgnrg&index=2

## Autor
✨ Feito por Rodrigo Gambarra!!

* rodrigo@gambarra.com.br
* <a href="linkedin.com/in/rodrigo-gambarra-2a195b151" target=”_blank”>LinkedIn</a>
* <a href="https://github.com/rodrigogambarra/OrcamentosApp" target=”_blank”>GitHub</a>
