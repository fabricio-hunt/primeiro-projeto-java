# Primeiro Projeto Java - Conta Bancária

Este é o primeiro projeto Java que implementa um simples sistema de **Conta Bancária**. A aplicação permite que o usuário consulte o saldo, realize transferências, saques e encerre o sistema.

## Funcionalidades

- Consultar Saldo
- Realizar Transferência
- Efetuar Saque
- Sair do Sistema

## Estrutura do Código

A classe `ContaBancaria` é a principal, contendo a lógica de interação com o usuário por meio de um menu de opções no console.

### Variáveis Iniciais

- `nome`: Nome do cliente (exemplo: "Fabrício Macedo Baraúna").
- `tipoDeConta`: Tipo de conta bancária (Corrente).
- `saldoDaConta`: Saldo inicial da conta (exemplo: R$ 4599,95).
- `opcao`: Variável que armazena a opção escolhida pelo usuário.

### Menu de Opções

O sistema exibe o seguinte menu para o usuário:

```text
*** Digite a Opção ***

1- Consultar Saldo
2- Transferência
3- Saque
4- Sair
```
O usuário pode escolher entre as opções e realizar as operações correspondentes. O sistema valida as entradas, garantindo que o saldo seja suficiente para transferências e saques.

Requisitos
Java 8 ou superior
Scanner: Para capturar entradas do usuário
Exemplo de Execução

**********************************
Nome do cliente: Fabrício Macedo Baraúna
Tipo de conta: Corrente
Saldo da conta: R$ 4599,95
**********************************

*** Digite a Opção ***

1- Consultar Saldo
2- Transferência
3- Saque
4- Sair
Escolha uma opção: 1
Seu saldo atual é: R$ 4599,95

### Melhorias Futuras
Implementar autenticação do usuário.
Adicionar limites de transações diárias.
Criar uma interface gráfica para melhor interação.

![image](https://github.com/user-attachments/assets/a54faa40-e991-416f-82aa-9c0403043c4e)


![image](https://github.com/user-attachments/assets/cf924115-812e-446b-ba49-74a13c0bec8e)


