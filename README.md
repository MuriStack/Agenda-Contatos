# 📒 Agenda de Contatos

Projeto didático desenvolvido em **Java** na disciplina de **Programação Orientada a Objetos (POO)**.

O projeto é desenvolvido de forma incremental, com cada versão introduzindo novos conceitos, estruturas e funcionalidades.

## 🎯 Objetivo

Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de armazenamento, da organização do código e das funcionalidades do sistema.

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

### V.1.1.1 — Versão atual

Correção do funcionamento da opção **Sair**.

Na versão anterior, o método `sair()` recebia a variável `continuar`, mas a alteração feita dentro do método não modificava a variável existente no `main`.

Na V.1.1.1, o método `sair()` passou a retornar um valor `boolean`, permitindo que o `main` atualize corretamente a variável `continuar` e encerre o sistema.

## ⚙️ Funcionalidades

- ➕ Adicionar contato
- 📋 Listar contatos
- 🔎 Procurar contato
- ✏️ Alterar contato
- 🗑️ Excluir contato
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
                ├── Agenda.java
                └── Uteis.java
