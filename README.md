# Gestão de Academia
Trabalho da disciplina **Estrutura de Dados** · Turma STADSCAS3NA-2603 · **Grupo 6**


Sistema para gerenciar uma academia: matrícula de alunos, fichas de treino, controle de mensalidades e registro de presença.

## Integrantes
- Barbara de Oliveira Silva
- Camily Quintino Ramos
- Davi Teixeira da Silva
- Julia Beatriz Xavier Ferreira
- Kauane Mineiro Coimbra

## Atores
- **Aluno:** consulta o perfil, a ficha de treino e o financeiro
- **Instrutor:** monta a ficha de treino
- **Recepção:** matricula, controla mensalidades e registra presença

## Funcionalidades (casos de uso)
- Matricular aluno
- Montar treino
- Controlar mensalidade
- Registrar presença

## Estruturas de dados utilizadas
- **Lista encadeada:** alunos e exercícios da ficha de treino
- **Fila:** registro de presenças (entra pelo fim, sai pelo início)
- **Ordenação:** mensalidades em atraso (a preencher)

## Tecnologias
- Back-end: Java puro, sem frameworks
- Front-end: HTML, CSS e JavaScript
- Protótipo: Figma — (link a preencher)

## Estrutura de pastas
```
backend/    código Java (model, estrutura, service e Main)
frontend/   telas em HTML, CSS e JS
docs/       histórias de usuário e casos de uso, plano de testes e protótipo
```

## Como executar
1. Abrir o projeto no IntelliJ IDEA (JDK 17).
2. Executar a classe `Main` em `backend/src`.
3. Usar o menu no console (matricular, ficha de treino, presença).

## Documentação
- [Histórias de usuário e casos de uso](docs/historias-e-casos-de-uso.pdf)
- [Plano de testes](docs/PLANO_DE_TESTES.md)

## Entrega
02/12/2026
