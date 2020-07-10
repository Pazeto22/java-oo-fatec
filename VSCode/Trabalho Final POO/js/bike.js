function cadastrarBike() {
  // recupera os valores do usuário
  var bike = new Object(); //cria um objeto
  bike.marca = document.getElementById("marca").value;
  bike.modelo = document.getElementById("modelo").value;
  bike.aro = Number(document.getElementById("aro").value);
  bike.quadro = Number(document.getElementById("quadro").value);
  //para atualização
  bike.id = Number(document.getElementById("idBike").value);

  // consumir API para inserção = POST
  var request = new XMLHttpRequest(); // objeto de requisição
  //abre a requisição
  request.open("POST", "http://localhost:8080/api/bike", true);
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
  request.send(JSON.stringify(bike));
  alert("Bike inserida com sucesso");
  location.reload();
}

function consultaB() {
  //cria um objeto de requisição
  var request = new XMLHttpRequest();
  // abre a conexão
  request.open("GET", "http://localhost:8080/api/bike", true);
  // ao carregar
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Conectou na API");
      // recuperar os dados
      var bikes = JSON.parse(this.response); // converte de JSON para objeto
      // cria as linhas da tabelaBike
      // recupera a tabelaBike
      var tabelaBike = document.getElementById("tabelaBike");
      // apaga dados passados
      tabelaBike.innerHTML = `
      <thead class="thead-dark">
      <tr>
      <th>Marca</th>
      <th>Modelo</th>
      <th>Aro</th>
      <th>Quadro</th>
      <th>Atualizar</th>
      <th>Remover</th>
      </tr>
      </thead>
      `;
      bikes.forEach((bike) => {
        // cria a linha da tabelaBike
        var linha = document.createElement("tr");
        // adiciona linha na tabelaBike
        tabelaBike.appendChild(linha);
        // cria as colunas da tabelaBike
        var cel1 = document.createElement("td");
        cel1.textContent = bike.marca;
        var cel2 = document.createElement("td");
        cel2.textContent = bike.modelo;
        var cel3 = document.createElement("td");
        cel3.textContent = bike.aro;
        var cel4 = document.createElement("td");
        cel4.textContent = bike.quadro;
        var cel5 = document.createElement("td");
        var buttonAtualizar = document.createElement("span");
        buttonAtualizar.innerHTML = "<i class='fas fa-sync-alt'></i>";
        buttonAtualizar.setAttribute(
          "onclick",
          `atualizarBike(${JSON.stringify(bike)})`
        );
        var cel6 = document.createElement("td");
        var buttonRemover = document.createElement("span");
        buttonRemover.innerHTML = "<i class='fas fa-trash'></i>";
        buttonRemover.setAttribute("onclick", `removerBike(${bike.id})`);

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

function removerBike(id) {
  var request = new XMLHttpRequest();
  request.open("DELETE", `http://localhost:8080/api/bike/${id}`, true);
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

function atualizarBike(bike) {
  // copiar o conteúdo da linha para as caixas de texto do cadastro
  document.getElementById("marca").value = bike.marca;
  document.getElementById("modelo").value = bike.modelo;
  document.getElementById("aro").value = bike.aro;
  document.getElementById("quadro").value = bike.quadro;
  document.getElementById("idBike").value = bike.id;
}
