function cadastrarHotel() {
  // recupera os valores do usuário
  var hotel = new Object(); //cria um objeto
  hotel.nomeHotel = document.getElementById("nomeHotel").value;
  hotel.capacidade = Number(document.getElementById("capacidade").value);
  hotel.estrelas = Number(document.getElementById("estrelas").value);
  //para atualização
  hotel.id = Number(document.getElementById("idHotel").value);

  // consumir API para inserção = POST
  var request = new XMLHttpRequest(); // objeto de requisição
  //abre a requisição
  request.open("POST", "http://localhost:8080/api/hotel", true);
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
  request.send(JSON.stringify(hotel));
  alert("Hotel inserido com sucesso");
  location.reload();
}

function consultaH() {
  //cria um objeto de requisição
  var request = new XMLHttpRequest();
  // abre a conexão
  request.open("GET", "http://localhost:8080/api/hotel", true);
  // ao carregar
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Conectou na API");
      // recuperar os dados
      var hotels = JSON.parse(this.response); // converte de JSON para objeto
      // cria as linhas da tabela
      // recupera a tabela
      var tabelaHotel = document.getElementById("tabelaHotel");
      // apaga dados passados
      tabelaHotel.innerHTML = `
      <thead class="thead-dark">
      <tr>
      <th>Nome</th>
      <th>Capacidade</th>
      <th>Estrelas</th>
      <th>Remover</th>
      <th>Atualizar</th>
      </tr>
      </thead>
      `;
      hotels.forEach((hotel) => {
        // cria a linha da tabela
        var linha = document.createElement("tr");
        // adiciona linha na tabela
        tabelaHotel.appendChild(linha);
        // cria as colunas da tabela
        var cel1 = document.createElement("td");
        cel1.textContent = hotel.nomeHotel;
        var cel2 = document.createElement("td");
        cel2.textContent = hotel.capacidade;
        var cel3 = document.createElement("td");
        cel3.textContent = hotel.estrelas;
        var cel4 = document.createElement("td");
        var buttonAtualizar = document.createElement("span");
        buttonAtualizar.innerHTML = "<i class='fas fa-sync-alt'></i>";
        buttonAtualizar.setAttribute(
          "onclick",
          `atualizarHotel(${JSON.stringify(hotel)})`
        );
        var cel5 = document.createElement("td");
        var buttonRemover = document.createElement("span");
        buttonRemover.innerHTML = "<i class='fas fa-trash'></i>";
        buttonRemover.setAttribute("onclick", `removeHotel(${hotel.id})`);

        // colocar as células dentro da linha
        linha.appendChild(cel1);
        linha.appendChild(cel2);
        linha.appendChild(cel3);
        linha.appendChild(cel4);
        linha.appendChild(cel5);
        cel4.appendChild(buttonAtualizar);
        cel5.appendChild(buttonRemover);
      });
    } else {
      console.log("Não conectou na API");
    }
  };
  request.send();
}

function removeHotel(id) {
  var request = new XMLHttpRequest();
  request.open("DELETE", `http://localhost:8080/api/hotel/${id}`, true);
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

function atualizarHotel(hotel) {
  // copiar o conteúdo da linha para as caixas de texto do cadastro
  document.getElementById("nomeHotel").value = hotel.nomeHotel;
  document.getElementById("capacidade").value = hotel.capacidade;
  document.getElementById("estrelas").value = hotel.estrelas;
  document.getElementById("idHotel").value = hotel.id;
}
