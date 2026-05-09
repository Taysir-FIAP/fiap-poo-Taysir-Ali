# FiapRide - Sistema de Mobilidade

Este repositório contém a modelagem de objetos para o sistema de mobilidade FiapRide, desenvolvido nas aulas de Programação Orientada a Objetos.

## Objeto: Carro
A classe `Carro` representa um veículo dentro do ecossistema da startup. Ela abstrai as características físicas e o estado mecânico necessários para a operação das corridas.

### Atributos (Estado)
* `placa`: Identificador único do veículo (String).
* `modelo`: Categoria ou nome do modelo do veículo (String).
* `cor`: Cor externa do veículo (String).
* `quilometragem`: Distância total percorrida pelo veículo em quilômetros (double).
* `motorLigado`: Estado atual do motor, indicando se está ativo ou inativo (boolean).

### Métodos (Comportamentos)
* `ligarMotor()`: Altera o estado do motor para ligado. Inclui validação de regra de negócio para impedir a ativação caso o motor já esteja em funcionamento.
* `registrarViagem(double distanciaKm)`: Incrementa a distância percorrida à quilometragem total do veículo. O processamento é bloqueado por duas validações: o motor deve estar obrigatoriamente ligado e a distância informada deve ser estritamente maior que zero.