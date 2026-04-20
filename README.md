# Calculadora de Taxa de Coleta de Lixo

Este projeto automatiza o cálculo da Taxa de Lixo para a prefeitura local, resolvendo o problema de erros manuais e tempo de resposta ao cidadão.

## Sobre o Projeto
A aplicação recebe o tipo de imóvel e a metragem quadrada (m²), processa a base de cálculo específica e gera uma guia detalhada para o contribuinte.

## Regras de Calculo
| Tipo de Imóvel | Valor (R$/m²) | Limitador (m²) |
| :--- | :---: | :---: |
| Terrenos (≥ 250m²) | 0,05 | 1500 |
| Residenciais | 0,13 | 300 |
| Restaurantes, Mercados e similares | 0,20 | 300 |
| Demais Comércios | 0,13 | 300 |
| Industriais | 0,20 | 500 |


## Linguagem:
* JAVA 21

## ⚙️ Como executar
1. Clone o repositório.
2. Abre o terminal na pasta calculadora-taxa-lixo-main/src/
3. Execute javac Main.java para compilar
4. Execute o arquivo principal java Main
