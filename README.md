<div align="center">

# 🛒 Projeto Final de Programação Orientada a Objetos

### Sistema de E-commerce em Java

Projeto desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)** do curso de **Sistemas de Informação** do **Centro Universitário de Patos de Minas (UNIPAM)**.

---

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![POO](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![License](https://img.shields.io/badge/Licença-Acadêmica-lightgrey?style=for-the-badge)

</div>

---

# 📖 Sobre o Projeto

Este projeto consiste no desenvolvimento de um sistema de **E-commerce** utilizando a linguagem **Java**, aplicando os principais conceitos de **Programação Orientada a Objetos** estudados durante a disciplina.

O objetivo foi implementar um sistema simples, porém organizado, demonstrando a utilização correta dos conceitos de POO.

---

# 🎯 Objetivos

✔ Cadastro de Clientes

✔ Cadastro de Endereços

✔ Cadastro de Produtos

✔ Carrinho de Compras

✔ Realização de Pedidos

✔ Formas de Pagamento

✔ Formas de Entrega

✔ Geração de Nota Fiscal

---

# 🚀 Conceitos de POO Aplicados

- ✅ Classes e Objetos
- ✅ Encapsulamento
- ✅ Herança
- ✅ Polimorfismo
- ✅ Interfaces
- ✅ Sobrescrita (Override)
- ✅ Sobrecarga
- ✅ Composição
- ✅ Associação
- ✅ Agregação
- ✅ ArrayList
- ✅ Packages

---

# 📂 Estrutura do Projeto

```text
src
│
├── cliente
│
├── produto
│
├── pedido
│
├── pagamento
│
├── entrega
│
├── notaFiscal
│
└── main
```

---

# 💳 Formas de Pagamento

O sistema possui quatro formas de pagamento implementadas através da interface `Pagamento`.

| Forma | Desconto |
|--------|----------|
| 💳 Crédito | Não |
| 💳 Débito | Não |
| 🧾 Boleto | Não |
| ⚡ PIX | **15%** |

O desconto é aplicado automaticamente quando o cliente escolhe o pagamento via PIX.

---

# 🚚 Formas de Entrega

- 📦 Entrega Padrão
- ⚡ Entrega Rápida
- 🏪 Retirada na Loja

---

# 👨‍💻 Divisão das Tarefas

| Integrante | Responsabilidade |
|------------|------------------|
| Daniel | Estrutura do projeto, Main e integração |
| Isaac | Cliente, Empresa e Endereço |
| Lucas Cavalcante | Produto, Carrinho e Pedido |
| Davi Artur | Interface Pagamento, PIX, Crédito, Débito e Boleto |
| Kevin | Entrega, Nota Fiscal, Atendente Virtual e UML |

---

# 🧩 Exemplo de Funcionamento

```text
Cliente realiza pedido

        │

        ▼

Escolhe forma de pagamento

        │

        ▼

PIX?

├── Sim → aplica 15% de desconto
│
└── Não → mantém valor original

        │

        ▼

Pedido Finalizado

        │

        ▼

Nota Fiscal Gerada
```

---

# 🛠 Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- IDE IntelliJ IDEA / NetBeans / Eclipse
- Git
- GitHub

---

# ▶ Como Executar

1. Clone o projeto

```bash
git clone https://github.com/seu-repositorio.git
```

2. Abra o projeto na IDE.

3. Execute a classe:

```text
Main.java
```

4. Utilize o menu para testar as funcionalidades do sistema.

---

# 📚 Disciplina

**Programação Orientada a Objetos**

Curso de Sistemas de Informação

Centro Universitário de Patos de Minas - UNIPAM

Professor: **Alexandre Alves**

---

# 👥 Grupo 5

- Daniel Soares
- Isaac Pereira
- Lucas Cavalcante
- Davi Artur
- Kevin

---

<div align="center">

### 💙 Desenvolvido para fins acadêmicos

*"A tecnologia move o mundo, mas o conhecimento constrói quem a utiliza."*

⭐ Obrigado por visitar nosso projeto!

</div>