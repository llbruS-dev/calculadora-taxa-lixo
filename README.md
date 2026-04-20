# Calculadora de Taxa de Coleta de Lixo

Este projeto automatiza o cálculo da Taxa de Lixo para a prefeitura local, resolvendo o problema de erros manuais e tempo de resposta ao cidadão.

## Sobre o Projeto
A aplicação recebe o tipo de imóvel e a metragem quadrada (m²), processa a base de cálculo específica e gera uma guia detalhada para o contribuinte.

## Regras de Negócio
/****************************************************************
  TABELA DE REFERÊNCIA PARA CÁLCULO DE TAXA DE LIXO
 ****************************************************************
  TIPO DE IMÓVEL                | VALOR R$ / M² | LIMITADOR M² |
 -------------------------------|---------------|--------------|
  1. Terrenos (>= 250m²)        |     0,05      |     1500     | 
 -------------------------------|---------------|--------------|
  2. Residenciais               |     0,13      |      300     | 
 -------------------------------|---------------|--------------|
  3. Comércio (Rest./Mercados)  |     0,20      |      300     | 
 -------------------------------|---------------|--------------|
  4. Demais Comércios           |     0,13      |      300     |
 -------------------------------|---------------|--------------|
  6. Industriais                |     0,20      |      500     |

     
 ****************************************************************/


## Linguagem:
* JAVA 21

## ⚙️ Como executar
1. Clone o repositório.
2. Execute o arquivo principal `Main.java`.
