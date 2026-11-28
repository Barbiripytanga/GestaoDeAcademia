# Plano de Testes

Os testes são feitos pelo menu de console do `Main`.

## Matricular aluno (UC01)

| ID | Teste | Entrada | Resultado esperado | Resultado |
|---|---|---|---|---|
| T01 | Matrícula válida | Opção 1: Maria, CPF 123, 9999, Mensal | "Aluno matriculado com sucesso!" | Passou |
| T02 | CPF repetido | Opção 1 com o CPF 123 de novo | "CPF já cadastrado." | Passou |
| T03 | Campo vazio | Opção 1 com o nome em branco | "Preencha todos os campos." | Passou |

## Montar treino (UC02)

| ID | Teste | Entrada | Resultado esperado | Resultado |
|---|---|---|---|---|
| T04 | Montar ficha | Opção 2: CPF 123, 1 exercício (Supino, 3, 12, Segunda) | "Ficha de treino montada com sucesso!" | Passou |
| T05 | Ver ficha | Opção 3: CPF 123 | Ficha com Supino, 3 séries, 12 repetições, Segunda | Passou |

## Registrar presença (UC04)

| ID | Teste | Entrada | Resultado esperado | Resultado |
|---|---|---|---|---|
| T06 | Registrar presença | Opção 4: CPF 123 (duas vezes) | "Presença registrada" nas duas vezes | Passou |
| T07 | Histórico | Opção 5: CPF 123 | Duas linhas com nome e data/hora | Passou |
| T08 | Aluno inexistente | Opção 4: CPF 999 | "Aluno nao encontrado." | Passou |

## Controlar mensalidade (UC03)

(a preencher quando a parte estiver pronta)