# 📒 Agenda de Contatos

Projeto didático desenvolvido em **Java** na disciplina de **Programação Orientada a Objetos (POO)**.

O projeto é desenvolvido de forma incremental, com cada versão introduzindo novos conceitos, estruturas e funcionalidades.

## 🎯 Objetivo

Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de armazenamento, da organização do código, da persistência de dados e das funcionalidades do sistema.

## 📈 Evolução do projeto

| Versão | Estrutura | Principais conceitos |
|---|---|---|
| **V.0.0.0** | Variáveis simples | `String`, `Scanner`, `if-else`, `switch`, `while` |
| **V.0.1.0** | Arrays | Vetores, índices, `for` e capacidade fixa |
| **V.0.2.0** | `List` + `ArrayList` | Coleções, tamanho dinâmico, `add()`, `get()`, `remove()`, `size()` |
| **V.0.3.0** | `List` + `ArrayList` | Alteração de contatos com `set()` e CRUD |
| **V.1.0.0** | Métodos | Organização do código em métodos |
| **V.1.1.0** | Classes `Agenda` e `Uteis` | Separação de responsabilidades e organização do código |
| **V.1.1.1** | Classes `Agenda` e `Uteis` | Correção do encerramento do sistema e opção "Sobre" |
| **V.2.1.0** | Classe `Persistencia` | Persistência de dados em arquivos (`FileWriter`, `PrintWriter`, `BufferedReader`) |
| **V.3.0.0** | Classe `Contato` | Criação de objetos e acesso aos atributos |
| **V.3.1.0** | Coleção de objetos | `List<Contato>`, `add()`, `get()` e `for-each` |
| **V.3.2.0** | CRUD orientado a objetos | Operações e persistência com `List<Contato>` |
| **V.3.3.0** | Encapsulamento | Atributos privados, construtores, getters e setters |

### V.0.0.0

Primeira versão do projeto, utilizando variáveis simples para armazenar **apenas um contato**.

### V.0.1.0

Substituição das variáveis por **arrays**, permitindo armazenar vários contatos com capacidade fixa.

### V.0.2.0

Substituição dos arrays por **`List` e `ArrayList`**, permitindo o armazenamento dinâmico de contatos.

### V.0.3.0

Adição da funcionalidade de **alterar contatos**, utilizando o método `set()`.

Com essa versão, o sistema passou a possuir um CRUD básico:

- **CREATE** → Adicionar contato
- **READ** → Listar e procurar contato
- **UPDATE** → Alterar contato
- **DELETE** → Excluir contato

### V.1.0.0

Organização do código por meio da criação de **métodos**, separando as diferentes funcionalidades da aplicação.

As operações de adicionar, listar, pesquisar, atualizar, excluir e sair passaram a ser implementadas em métodos próprios.

### V.1.1.0

Organização do projeto em diferentes classes, separando as responsabilidades da aplicação.

A classe **`Agenda`** passou a concentrar as operações relacionadas aos contatos, enquanto a classe **`Uteis`** passou a concentrar funcionalidades auxiliares, como inicialização, menu, seleção de opção e informações sobre o sistema.

Também foi adicionada a opção **"Informações Sobre a Agenda de Contatos"**, utilizando `JOptionPane`.

### V.1.1.1

Correção do funcionamento da opção **Sair**.

Na versão anterior, o método `sair()` recebia a variável `continuar`, mas a alteração feita dentro do método não modificava a variável existente no `main`.

Na V.1.1.1, o método `sair()` passou a retornar um valor `boolean`, permitindo que o `main` atualize corretamente a variável `continuar` e encerre o sistema.

### V.2.1.0

Introdução da classe **`Persistencia`** para salvar e carregar os contatos em arquivo de texto (`contatos.txt`).

- **Carregamento automático:** Os dados são lidos do arquivo ao iniciar a aplicação.
- **Salvamento automático:** Os dados são gravados no arquivo ao optar por sair do sistema.

### V.3.0.0

Introdução da classe **`Contato`**, reunindo os atributos `nome`, `celular` e `email` em um objeto.

Nesta etapa, são apresentados a criação de objetos e o acesso aos seus atributos.

### V.3.1.0

Introdução de uma **`List<Contato>`** para armazenar vários objetos em uma única coleção.

Os exemplos utilizam `add()`, `get()` e `for-each`. O CRUD e a persistência ainda utilizam as listas de strings nesta etapa.

### V.3.2.0

Adaptação das operações de adicionar, listar, pesquisar, alterar e excluir contatos para trabalhar com **objetos `Contato`**.

As três listas de strings são substituídas por uma única **`List<Contato>`**. A persistência também passa a utilizar objetos, mantendo o formato `nome;celular;email` no arquivo `contatos.txt`.

### V.3.3.0 — Versão atual

Introdução do **encapsulamento** na classe `Contato`.

- **Atributos privados:** Proteção dos dados do contato com `private`.
- **Getters e setters:** Métodos para consultar e alterar os atributos.
- **Construtores:** Inicialização dos dados na criação do objeto, utilizando `this`.

O CRUD e a persistência são adaptados para utilizar os construtores, getters e setters. O encerramento do programa passa a fechar o `Scanner` e finalizar o `main` com `return`.

## ⚙️ Funcionalidades

- ➕ Adicionar contato
- 📋 Listar contatos
- 🔎 Procurar contato
- ✏️ Alterar contato
- 🗑️ Excluir contato
- 💾 Persistência em arquivo (`contatos.txt`)
- 🚪 Sair
- ℹ️ Informações sobre a Agenda de Contatos

## 📂 Estrutura do projeto

```text
Agenda-Contatos/
├── .gitignore
├── README.md
└── src/
    └── br/
        └── edu/
            └── principal/
                ├── Principal.java
                ├── Contato.java
                ├── Agenda.java
                ├── Uteis.java
                └── Persistencia.java
```
