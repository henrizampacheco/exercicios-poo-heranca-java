## [Exercícios: POO Herança em Java](https://github.com/henrizampacheco/exercicios-poo-heranca-java/tree/master/ExerciciosPOOHerancaJava/src/com/henrizampacheco/java "Exercícios: POO Herança em Java")

Fonte dos exercícios:
https://docente.ifrn.edu.br/nickersonferreira/disciplinas/programacao-estruturada-e-orientada-a-objetos/lista-de-exercicios-heranca/view

### Apresentação
------------

Apresento aqui um projeto com exercícios de Java resolvidos, os quais tratam sobre herança na Programação Orientada a Objetos. Créditos ao Prof.º Nickerson Ferreira do IFRN, que disponibilizou a lista on-line, conforme o link acima.

### Lista de exercícios: POO Herança (Java)
------------

**Exercício 1:** Implemente a classe Funcionario com nome, salario e os métodos addAumento(double valor), ganhoAnual() e exibeDados() - imprime os valores do funcionário.
a. crie a classe Assistente, que também é um funcionário, e que possui um número de matrícula (faça os métodos GET e SET). Sobrescreva o método exibeDados().
b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes Tecnico e Administrativo e sobrescreva o método ganhoAnual() de ambas as classes (Administrativo e Tecnico).

**Exercício 2:** Implemente os diagramas de classe abaixo:
a. {Superclasse = Animal; Atributos = -nome: String, -raca: String; Métodos = +Animal(), +Animal(nome: String), +caminha(): String}
{Subclasse 1 = Cachorro; Métodos = +late(): String}
{Subclasse 2 = Gato; Métodos = +mia(): String}
b. {Superclasse = Pessoa; Atributos = -nome: String, -idade: int; Métodos = +Pessoa()}
{Subclasse 1 = Rica; Atributos = -dinheiro: double; Métodos = +fazCompras()}
{Subclasse 2 = Pobre; Métodos = +trabalha()}
{Subclasse 3 = Miseravel; Métodos = +mendiga()} 

**Exercício 3 (SLIDE):** Crie uma classe chamada Ingresso que possui um valor em reais e um método imprimeValor().
a. crie uma classe Normal, que herda de Ingresso e possui um método (nome a sua escolha) que imprime: "Ingresso Normal".
b. crie uma classe VIP, que herda de Ingresso e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído). OBS:: sobrescreva o método imprimeValor() da classe Ingresso.
c. crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para acessar (get e set) e imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe VIP. 

**Exercício 4:** Crie a classe Imovel, que possui um endereço e um preço.
a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto. 

**Exercício 5:** Crie uma classe de Teste com o método main. Neste método:
a. crie um assistente administrativo e um técnico. Imprima o número de matrícula e o nome de cada um deles.
b. crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. Faça os dois animais caminharem.
c. teste (como quiser) as classes Rica, Pobre e Miseravel.
d. crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP. Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior. Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior. Imprima o valor do ingresso.
e. crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a definição do usuário, imprima o valor final do imóvel.

### Tecnologias
------------
Utilizou-se neste projeto:
- Java
- Netbeans IDE
- GIT

### Autor
------------
Desenvolvido por [Henrique Z. Pacheco](https://www.linkedin.com/in/henrizampacheco/ "Henrique Z. Pacheco")