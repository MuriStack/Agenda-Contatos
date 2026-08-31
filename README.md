# 📒 Agenda de Contatos

Projeto didático desenvolvido em **Java** na disciplina de **Programação Orientada a Objetos (POO)**.

O projeto é desenvolvido de forma incremental, com cada versão introduzindo novos conceitos e funcionalidades.

## 🎯 Objetivo

Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de armazenamento e das funcionalidades do sistema.

## 📈 Evolução do projeto

| Versão | Armazenamento | Principais conceitos |
|---|---|---|
| **V.0.0.0** | Variáveis simples | `String`, `Scanner`, `if-else`, `switch`, `while` |
| **V.0.1.0** | Arrays | Vetores, índices, `for` e capacidade fixa |
| **V.0.2.0** | `List` + `ArrayList` | Coleções, tamanho dinâmico, `add()`, `get()`, `remove()`, `size()` |
| **V.0.3.0** | `List` + `ArrayList` | Alteração de contatos com `set()` e CRUD |

### V.0.0.0

Primeira versão do projeto, utilizando variáveis simples para armazenar **apenas um contato**.

### V.0.1.0

Substituição das variáveis por **arrays**, permitindo armazenar vários contatos com capacidade fixa.

### V.0.2.0

Substituição dos arrays por **`List` e `ArrayList`**, permitindo armazenamento dinâmico de contatos.

### V.0.3.0 — Versão atual

Adição da funcionalidade de **alterar contatos**, utilizando o método `set()`.

Com essa versão, o sistema possui um CRUD básico:

- **CREATE** → Adicionar contato
- **READ** → Listar e procurar contato
- **UPDATE** → Alterar contato
- **DELETE** → Excluir contato

## ⚙️ Funcionalidades

- ➕ Adicionar contato
- 📋 Listar contatos
- 🔎 Procurar contato
- ✏️ Alterar contato
- 🗑️ Excluir contato
- 🚪 Sair

## 📂 Estrutura do projeto

```text
Agenda-Contatos/
├── .gitignore
├── README.md
└── src/
    └── br/
        └── edu/
            └── principal/
                └── Principal.java
```

### Arquivos principais

- `.gitignore` — arquivos ignorados pelo Git.
- `README.md` — documentação do projeto.
- `Principal.java` — classe principal da aplicação.

## 🛠️ Tecnologias

- **Java**
- **JDK**
- **Git**
- **GitHub**

## ▶️ Execução

Compile o projeto:

```bash
javac -d bin src/br/edu/principal/Principal.java
```

Execute:

```bash
java -cp bin br.edu.principal.Principal
```

## 🏷️ Versionamento

As versões do projeto são identificadas por **tags Git**:

```text
v0.0.0
v0.1.0
v0.2.0
v0.3.0
```

**Versão atual: `v0.3.0`**

O projeto continuará evoluindo conforme os novos conteúdos trabalhados na disciplina.