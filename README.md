– Calculadora de Consumo Diário de Água
📱 Descrição do Projeto

O Hidrometa é um aplicativo Android desenvolvido em Java no Android Studio que ajuda o usuário a calcular a quantidade ideal de água que deve consumir diariamente.

O cálculo é realizado com base em:

⚖️ Peso corporal (kg)
🎂 Idade (anos)
🏃 Nível de atividade física
🥤 Quantidade de água já consumida no dia (ml)

O aplicativo também informa quanto ainda falta para atingir a meta diária de hidratação.

🎯 Objetivo

Auxiliar o usuário a manter uma hidratação adequada de forma simples e prática.

📥 Dados de Entrada

O usuário deverá informar:

Peso (kg)
Idade (anos)
Nível de atividade física
Sedentário
Moderado
Intenso
Quantidade de água já consumida hoje (ml)
🧮 Fórmulas Utilizadas
Consumo Base
Consumo_base = Peso × 35
Consumo Total
Consumo_total = Consumo_base + Extra
Valores de Extra
Nível de Atividade	Extra
Sedentário	0 ml
Moderado	300 ml
Intenso	600 ml
Quantidade Restante
Restante = Consumo_total − Ingestão_atual

Se o valor restante for menor que zero, o aplicativo exibirá 0 ml, indicando que a meta já foi atingida.

📊 Exemplo de Cálculo
Dados Informados:
Peso: 70 kg
Idade: 20 anos
Atividade: Moderado
Água consumida: 1500 ml
Cálculo:
Consumo_base = 70 × 35 = 2450 ml
Consumo_total = 2450 + 300 = 2750 ml
Restante = 2750 − 1500 = 1250 ml
Resultado:
Meta diária: 2750 ml
Já consumido: 1500 ml
Falta consumir: 1250 ml
🖥️ Funcionalidades do App
Inserção dos dados do usuário
Seleção do nível de atividade física
Cálculo automático da meta diária
Exibição da quantidade restante
Validação dos campos
Botão para limpar os dados
🛠️ Tecnologias Utilizadas
Java
Android Studio
XML (Layout)
📂 Estrutura do Projeto
app/
 ├── java/
 │   └── MainActivity.java
 └── res/
     └── layout/
         └── activity_main.xml
✅ Validações Implementadas
Todos os campos devem ser preenchidos.
Valores negativos não são permitidos.
Tratamento de erros com try-catch.
🎨 Interface do Usuário

A interface contém:

Campos de texto para peso, idade e ingestão atual.
RadioButtons para selecionar o nível de atividade.
Botões:
Calcular
Limpar
Área para exibir:
Meta diária
Quantidade restante
🚀 Como Executar
Abra o projeto no Android Studio.
Execute em um emulador ou dispositivo Android.
Insira os dados.
Clique em Calcular.
📌 Regras de Negócio
Cada quilograma de peso equivale a 35 ml de água por dia.
Atividade física aumenta a necessidade de hidratação.
O cálculo considera o volume já ingerido.
👨‍💻 Autor

Projeto desenvolvido por Vitória Gabriela Fernandes da Luz para atividade acadêmica de Programação Mobile com Android Studio.
