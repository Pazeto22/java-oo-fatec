function cadastrarCidade() {
  // recupera os valores do usuário
  var cidade = new Object(); //cria um objeto
  cidade.nomeCidade = document.getElementById("nomeCidade").value;
  cidade.pib = Number(document.getElementById("pib").value);
  cidade.populacao = Number(document.getElementById("populacao").value);
  cidade.prefeito = document.getElementById("prefeito").value;
  //para atualização
  cidade.id = Number(document.getElementById("idCidade").value);

  // consumir API para inserção = POST
  var request = new XMLHttpRequest(); // objeto de requisição
  //abre a requisição
  request.open("POST", "http://localhost:8080/api/cidade", true);
  // ao carregar
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Conectou na API");
    } else {
      console.log("Não conectou na API");
    }
  };

  //configura o cabeçalho da requisição
  request.setRequestHeader("Content-Type", "application/json");
  // Envia dados para a requisição
  // converte objeto em JSON
  request.send(JSON.stringify(cidade));
  alert("Cidade inserida com sucesso");
  location.reload();
}

function consultaC() {
  //cria um objeto de requisição
  var request = new XMLHttpRequest();
  // abre a conexão
  request.open("GET", "http://localhost:8080/api/cidade", true);
  // ao carregar
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Conectou na API");
      // recuperar os dados
      var cidades = JSON.parse(this.response); // converte de JSON para objeto
      // cria as linhas da tabelaCidade
      // recupera a tabelaCidade
      var tabelaCidade = document.getElementById("tabelaCidade");
      // apaga dados passados
      tabelaCidade.innerHTML = `
      <thead class="thead-dark">
      <tr>
      <th>Nome</th>
      <th>PIB</th>
      <th>População</th>
      <th>Prefeito</th>
      <th>Atualizar</th>
      <th>Remover</th>
      </tr>
      </thead>
      `;
      cidades.forEach((cidade) => {
        // cria a linha da tabelaCidade
        var linha = document.createElement("tr");
        // adiciona linha na tabelaCidade
        tabelaCidade.appendChild(linha);
        // cria as colunas da tabelaCidade
        var cel1 = document.createElement("td");
        cel1.textContent = cidade.nomeCidade;
        var cel2 = document.createElement("td");
        cel2.textContent = cidade.pib;
        var cel3 = document.createElement("td");
        cel3.textContent = cidade.populacao;
        var cel4 = document.createElement("td");
        cel4.textContent = cidade.prefeito;
        var cel5 = document.createElement("td");
        var buttonAtualizar = document.createElement("span");
        buttonAtualizar.innerHTML = "<i class='fas fa-sync-alt'></i>";
        buttonAtualizar.setAttribute(
          "onclick",
          `atualizarCidade(${JSON.stringify(cidade)})`
        );
        var cel6 = document.createElement("td");
        var buttonRemover = document.createElement("span");
        buttonRemover.innerHTML = "<i class='fas fa-trash'></i>";
        buttonRemover.setAttribute("onclick", `removerCidade(${cidade.id})`);

        // colocar as células dentro da linha
        linha.appendChild(cel1);
        linha.appendChild(cel2);
        linha.appendChild(cel3);
        linha.appendChild(cel4);
        linha.appendChild(cel5);
        linha.appendChild(cel6);
        cel5.appendChild(buttonAtualizar);
        cel6.appendChild(buttonRemover);
      });
    } else {
      console.log("Não conectou na API");
    }
  };
  request.send();
}

function removerCidade(id) {
  var request = new XMLHttpRequest();
  request.open("DELETE", `http://localhost:8080/api/cidade/${id}`, true);
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Carregou");
    } else {
      console.log("Não carregou");
    }
  };
  request.send();
  alert("Remoção realizada com sucesso");
  location.reload(); // atualiza a página
}

function atualizarCidade(cidade) {
  // copiar o conteúdo da linha para as caixas de texto do cadastro
  document.getElementById("nomeCidade").value = cidade.nomeCidade;
  document.getElementById("pib").value = cidade.pib;
  document.getElementById("populacao").value = cidade.populacao;
  document.getElementById("prefeito").value = cidade.prefeito;
  document.getElementById("idCidade").value = cidade.id;
}
