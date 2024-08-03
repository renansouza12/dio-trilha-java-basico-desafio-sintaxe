# DIO - Trilha Java Básico 🚀
[www.dio.me](https://www.dio.me)

## Visão Geral 📝

Este repositório faz parte do curso de Java Básico na Digital Innovation One (DIO). Ele inclui um projeto chamado `ContaBanco`, projetado para ajudá-lo a praticar os conceitos aprendidos no módulo de Sintaxe, codificando um cenário do mundo real.


## Projeto: ContaBanco 🏦

### Objetivo 🎯
O objetivo deste projeto é criar uma aplicação Java que simule um sistema de conta bancária. Você coletará os detalhes da conta via entrada do terminal e exibirá um resumo das informações inseridas.

### Etapas do Projeto 📋

1. **Criar o Projeto**
   - Nomeia o projeto como `ContaBanco`.

2. **Crie a Classe Principal**
   - Dentro do  projeto, criar uma classe chamada `ContaTerminal.java`. Esta classe lidará com toda a codificação do programa.

### Requisitos ⚙️

#### Declarar Variáveis
 Regras para declaração de variáveis. A classe deve incluir os seguintes atributos:

| Atributo     | Tipo    | Exemplo       |
|--------------|---------|---------------|
| Numero       | int     | 1021          |
| Agencia      | String  | 067-8         |
| Nome Cliente | String  | MARIO ANDRADE |
| Saldo        | double  | 237.48        |

#### Entrada via Terminal 🖥️
Revise como usar o terminal, argumentos do método `main` e a classe `Scanner` para entrada de dados. Seu programa deve solicitar ao usuário que insira cada informação. Por exemplo:

- **Programa:** "Por favor, digite o número da Agência!"
- **Usuário:** 067-8 *(depois pressione ENTER para o próximo campo)*


*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco. Sua agência é [Agencia], conta [Numero], e seu saldo [Saldo] já está disponível para saque."*

Os campos entre colchetes [ ] devem ser substituídos pelas informações fornecidas pelo usuário.

### Exemplo de Uso 📚

1. O usuário executa o programa.
2. O programa solicita: "Por favor, digite o número da Agência!"
3. O usuário digita: 067-8
4. O programa solicita: "Por favor, digite o número da Conta!"
5. O usuário digita: 1021
6. O programa solicita: "Por favor, digite o Nome do Cliente!"
7. O usuário digita: MARIO ANDRADE
8. O programa solicita: "Por favor, digite o Saldo da Conta!"
9. O usuário digita: 237.48

O programa então exibe:

*"Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco. Sua agência é 067-8, conta 1021, e seu saldo 237.48 já está disponível para saque."*

