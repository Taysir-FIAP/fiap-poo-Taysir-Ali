# Projeto FiapRide - Taysir Fauzi Ali

## 📊 Informações do Aluno
- **Nome:** Taysir Fauzi Ali
- **RM:** [Seu RM aqui]
- **Turma:** [Sua Turma aqui]
- **Curso:** Engenharia de Computação / Análise e Desenvolvimento de Sistemas (FIAP)
- **GitHub:** @Taysir-FIAP

---

## 🎯 Descrição do Projeto
Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **"FiapRide"**. Adaptamos o conceito original para um sistema de gestão de **Oficina Mecânica e Mobilidade**, focando na organização de profissionais, veículos e ordens de serviço.

---

## ✅ Checklist de Implementação
- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## 🤔 Perguntas de Reflexão

### Aula 1 - Classes e Objetos
**Sua Resposta:**
Utilizar uma classe como `Passageiro` ou `Carro` é fundamental para organizar a complexidade do mundo real dentro do código. Se usássemos variáveis soltas para 1 milhão de usuários, teríamos um caos de gerenciamento e um código impossível de manter. A classe funciona como uma "planta arquitetônica": ela define o comportamento e as características uma única vez, permitindo que o sistema crie milhões de instâncias (objetos) de forma padronizada, eficiente e segura.

### Aula 2 - Métodos
**Sua Resposta:**
Criar métodos específicos como `adicionarSaldo()` ou `registrarViagem()` é o que chamamos de comportamento controlado. O risco de permitir que qualquer programador altere o saldo diretamente é a quebra das regras de negócio (ex: saldo negativo não permitido ou fraudes). O método centraliza a lógica de validação: antes de alterar o valor, o sistema verifica se a operação é legítima, garantindo a saúde financeira e a integridade dos dados da startup.

### Aula 3 - Encapsulamento
**Sua Resposta:**
Deixar o atributo original como `private` e o `get` como `public` é a diferença entre dar a chave do seu cofre para alguém ou apenas mostrar quanto dinheiro tem lá dentro através de um vidro. O atributo público permite que qualquer um "rasure" o dado original. O método `get` entrega apenas uma cópia ou uma visualização do valor, protegendo o estado interno do objeto contra alterações acidentais ou mal-intencionadas.

### Aula 4 - Construtores
**Sua Resposta:**
Gerar Getters e Setters para tudo é um erro grave porque expõe dados que não deveriam mudar (imutabilidade). No mundo real, você não muda o modelo de um carro ou a cor dele a todo instante via software; isso exige processos físicos ou burocráticos. Ao criar o `atualizarPlaca()` como um processo controlado, simulamos o rigor do Detran, impedindo fraudes de identidade veicular e garantindo que o sistema reflita apenas mudanças reais e validadas.

### Aula 5 - Associação
**Sua Resposta:**
Exigir o objeto inteiro `Passageiro` (ou `Profissional`) no construtor da `Viagem` (ou `OrdemDeServico`) é essencial para a integridade do sistema. Se tivéssemos apenas a String do nome, não poderíamos descontar o saldo do cliente ou verificar as credenciais do técnico ao final do processo. Ter o objeto completo permite a "comunicação entre objetos": a Ordem de Serviço "conversa" com o objeto Profissional para atualizar suas horas trabalhadas ou validar sua especialidade.

### Aula 6 - Herança
**Sua Resposta:**
O Java não permite que a filha altere variáveis privadas da mãe para garantir o princípio do **Encapsulamento**. Mesmo sendo "família", a classe mãe deve ser a única responsável por gerenciar seus próprios dados sensíveis. Isso protege o sistema contra subclasses que possam tentar burlar validações de segurança definidas na superclasse, forçando o uso de métodos de acesso seguros (`super` ou `setters`).

### Aula 7 - Polimorfismo
**Sua Resposta:**
O contrato precisa existir na base da hierarquia para que o compilador saiba que todo e qualquer veículo, não importa o tipo, possui a capacidade de "Calcular Autonomia" ou "Gerar Orçamento". Se o método não estivesse na mãe, o loop genérico falharia, pois o Java não teria garantia de que aquele comportamento existe em todos os itens da lista. O polimorfismo permite tratar diferentes especialistas de forma uniforme, simplificando drasticamente o código principal.

### Aula 8 - Classes Abstratas
**Sua Resposta:**
No mundo real, não existe um objeto que seja "apenas veículo"; ele sempre será algo específico. No código, usamos `abstract` para evitar que alguém crie instâncias "fantasmas" que não possuem comportamento definido. Se esquecermos o `abstract`, corremos o risco de ter um objeto no sistema que ocupa memória mas não sabe calcular um orçamento ou uma autonomia, gerando erros de lógica (NullPointer ou cálculos zerados) em relatórios financeiros.

### Aula 9 - Interfaces
**Sua Resposta:**
Interfaces resolvem o problema da Herança Múltipla (Diamond Problem). Se o `CarroEletrico` herdasse de duas classes que tivessem o método `ligar()`, haveria um conflito de qual código executar. A Interface não tem código, apenas a promessa de que o método existirá. Isso permite que um Carro e um Profissional sejam ambos `Documentaveis` sem precisarem ser da mesma "família", focando no que eles **fazem** e não no que eles **são**.

---

## 🚀 Desafios Técnicos Implementados

### Desafio Pessoal (Meu Projeto)
- **Domínio escolhido:** Sistema de Gestão de Oficina Mecânica (FiapRide Service).
- **Classes criadas:** `Profissional` (Abstrata), `Mecanico`, `Eletricista`, `Carro`, `OrdemDeServico` e a Interface `Documentavel`.
- **Maior desafio técnico:** O maior desafio foi garantir que a classe `OrdemDeServico` conseguisse navegar corretamente entre os objetos associados (`Profissional` e `Carro`) após as refatorações para classes abstratas. Tive que restaurar os métodos de acesso (Getters) na superclasse para que o resumo da OS não perdesse o acesso ao nome do técnico e à placa do veículo, garantindo que o polimorfismo funcionasse sem quebrar a exibição de dados.

---

## 🎓 Conclusão
- **O que aprendi:** Nestas 9 aulas, compreendi como transformar regras de negócio complexas em estruturas de código organizadas, escaláveis e seguras, utilizando os pilares da POO.
- **Conceito mais difícil:** O Polimorfismo foi o mais desafiador, especialmente entender como o Java decide em tempo de execução qual método chamar, mas superei isso praticando com a lista de profissionais na oficina.
- **Melhoria futura:** Se pudesse refazer, implementaria um sistema de tratamento de exceções (Try/Catch) mais robusto para validar a entrada de dados financeiros e quilometragem, tornando o sistema à prova de falhas de usuário.
