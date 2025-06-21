# Processo Seletivo Simples
Projeto Java que simula um processo seletivo básico, onde candidatos são avaliados com base no salário que desejam e na política de salário da empresa.

### Funcionalidades

1. Avaliação de Salário Individual (case1)
Este método compara o salário base oferecido pela empresa com o salário que o candidato pretende receber. As possíveis decisões são:

- "LIGAR PARA O CANDIDATO": Se o salário base for maior que o pretendido.
- "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA": Se o salário base for igual ao pretendido.
- "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS": Se o salário base for menor que o pretendido.

2. Seleção Contínua de Candidatos (case2)

Simula a busca por um número específico de candidatos (neste caso, 5) a partir de uma lista predefinida. Cada candidato tem um salário pretendido gerado aleatoriamente dentro de uma faixa (entre R$ 1.800 e R$ 2.200).

- Candidato Selecionado: Se o salário pretendido for menor ou igual ao salário base da empresa (R$ 2.000).
- Candidato Não Selecionado: Se o salário pretendido for maior que o salário base da empresa.

**Nota:** Atualmente, apenas as chamadas ao método case1 estão ativas no método main. Para ver o case2 em ação, você precisaria descomentar ou adicionar uma chamada para ProcessoSeletivo.case2(); dentro do main.
  
